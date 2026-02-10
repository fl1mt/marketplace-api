package com.marketplace.logisticservice.delivery;

import com.marketplace.events.DeliveryCalculatedEvent;
import com.marketplace.events.DeliveryInTransitEvent;
import com.marketplace.events.OrderCreatedEvent;
import com.marketplace.logisticservice.errors.BadRequestException;
import com.marketplace.logisticservice.errors.NotFoundException;
import com.marketplace.logisticservice.kafka.DeliveryCalculatedProducer;
import com.marketplace.logisticservice.kafka.DeliveryInTransitProducer;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Service
public class DeliveryService {

    private final DeliveryCalculatedProducer deliveryCalculatedProducer;
    private final DeliveryInTransitProducer deliveryInTransitProducer;
    private final DeliveryRepository deliveryRepository;
    private final DeliveryMapper deliveryMapper;

    public DeliveryService(DeliveryCalculatedProducer deliveryCalculatedProducer, DeliveryInTransitProducer deliveryInTransitProducer, DeliveryRepository deliveryRepository, DeliveryMapper deliveryMapper) {
        this.deliveryCalculatedProducer = deliveryCalculatedProducer;
        this.deliveryInTransitProducer = deliveryInTransitProducer;
        this.deliveryRepository = deliveryRepository;
        this.deliveryMapper = deliveryMapper;
    }

    public List<DeliveryResponse> getDeliveries(){
        return deliveryMapper.toResponseDtoList(deliveryRepository.findAll());
    }

    @Transactional
    public void calculateAndSend(OrderCreatedEvent event) {
        // временная заглушка
        BigDecimal deliveryPrice = BigDecimal.valueOf(500);
        LocalDate deliveryDate = LocalDate.now().plusDays(3);

        Delivery delivery = new Delivery();
        delivery.setOrderId(event.orderId());
        delivery.setShippingCost(deliveryPrice);
        delivery.setDeliveryDate(deliveryDate);
        delivery.setDeliveryStatus(DeliveryStatus.CONFIRMED);

        deliveryRepository.save(delivery);

        DeliveryCalculatedEvent result =
                new DeliveryCalculatedEvent(
                        event.orderId(),
                        deliveryPrice,
                        deliveryDate
                );

        deliveryCalculatedProducer.send(result);
    }

    @Transactional
    public DeliveryResponse markInTransit(UUID orderId) {
        Delivery delivery = deliveryRepository.findByOrderId(orderId);
        if(delivery == null) { throw new NotFoundException("Delivery not found!");}

        if(delivery.getDeliveryStatus() != DeliveryStatus.CONFIRMED) {
            throw new BadRequestException("The order must have the confirmed status.");
        }

        delivery.setDeliveryStatus(DeliveryStatus.IN_TRANSIT);
        deliveryRepository.save(delivery);

        deliveryInTransitProducer.send(new DeliveryInTransitEvent(orderId));
        return deliveryMapper.toDTO(delivery);
    }
}

