package com.marketplace.logisticservice.delivery;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DeliveryRepository extends JpaRepository<Delivery, Long> {

    Delivery findByOrderId(UUID orderId);
}
