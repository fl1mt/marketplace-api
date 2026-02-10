package com.marketplace.logisticservice.kafka;

import com.marketplace.events.DeliveryDeliveredEvent;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class DeliveryDeliveredProducer {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    public DeliveryDeliveredProducer(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(DeliveryDeliveredEvent event) {
        kafkaTemplate.send(
                "delivery-delivered",
                event.orderId().toString(),
                event
        );
    }
}
