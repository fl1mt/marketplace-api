package com.marketplace.repository;

import com.marketplace.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface productsRepository extends JpaRepository<Product, UUID> {
}
