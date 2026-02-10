package com.marketplace.logisticservice.delivery;

import com.marketplace.events.DeliveryDeliveredEvent;
import com.marketplace.logisticservice.kafka.DeliveryDeliveredProducer;
import jakarta.transaction.Transactional;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DeliveryAutoCompleteService {
    private final DeliveryRepository deliveryRepository;
    private final DeliveryDeliveredProducer producer;


    public DeliveryAutoCompleteService(DeliveryRepository deliveryRepository, DeliveryDeliveredProducer producer) {
        this.deliveryRepository = deliveryRepository;
        this.producer = producer;
    }

    @Transactional
    @Scheduled(fixedRate = 60_000)
    public void completeDeliveredOrders(){
        List<Delivery> deliveryList =
                deliveryRepository.findByDeliveryStatus(DeliveryStatus.IN_TRANSIT);

        LocalDateTime now = LocalDateTime.now();

        for(Delivery delivery : deliveryList){
            if(delivery.getStatusUpdatedAt() == null){
                continue;
            }

            boolean isMoreThaTwoMinutes = delivery.getStatusUpdatedAt()
                    .plusMinutes(2).isBefore(now);

            if(!isMoreThaTwoMinutes){continue;}

            delivery.setStatusUpdatedAt(now);
            delivery.setDeliveryStatus(DeliveryStatus.DELIVERED);
            deliveryRepository.save(delivery);

            producer.send(new DeliveryDeliveredEvent(delivery.getOrderId()));
        }
    }
}
