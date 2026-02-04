package com.marketplace.kafka.producer;
import com.marketplace.events.OrderCreatedEvent;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderEventProducer {

    private final KafkaTemplate<String, OrderCreatedEvent> kafkaTemplate;

    public OrderEventProducer(KafkaTemplate<String, OrderCreatedEvent> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(OrderCreatedEvent event) {

        kafkaTemplate.send(
                "order-created",
                event.getOrderId(),
                event
        );

        //log.info("Order event sent: {}", event.getOrderId());
    }
}
