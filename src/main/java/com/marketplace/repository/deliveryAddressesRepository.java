package com.marketplace.repository;

import com.marketplace.entity.DeliveryAddress;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface deliveryAddressesRepository extends JpaRepository<DeliveryAddress, UUID> {
    Optional<DeliveryAddress> findByUserId(UUID uuid);
}
