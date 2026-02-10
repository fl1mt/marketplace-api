package com.marketplace.logisticservice.kafka;

import com.marketplace.events.DeliveryInTransitEvent;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class DeliveryInTransitProducer {

    private static final String TOPIC = "delivery-in-transit";

    private final KafkaTemplate<String, Object> kafkaTemplate;

    public DeliveryInTransitProducer(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(DeliveryInTransitEvent event) {
        kafkaTemplate.send(
                TOPIC,
                event.orderId().toString(),
                event
        );
    }
}
