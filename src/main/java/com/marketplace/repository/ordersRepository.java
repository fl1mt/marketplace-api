package com.marketplace.repository;
import com.marketplace.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

    public interface ordersRepository extends JpaRepository<Order, UUID> {
        List<Order> findAllByUserId(UUID userId);
    }
