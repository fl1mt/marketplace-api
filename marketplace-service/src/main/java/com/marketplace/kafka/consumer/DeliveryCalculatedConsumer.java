package com.marketplace.kafka.consumer;

import com.marketplace.events.DeliveryCalculatedEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Service;

@Service
public class DeliveryCalculatedConsumer {
    @KafkaListener(
            topics = "delivery-calculated",
            groupId = "marketplace-group"
    )
    public void consume(
            DeliveryCalculatedEvent event,
            Acknowledgment ack
    ) {

        // logic

        ack.acknowledge();
    }


}
