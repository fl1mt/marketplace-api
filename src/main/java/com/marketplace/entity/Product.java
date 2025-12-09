package com.marketplace.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.UUID;
@Entity
@Table(name = "products")
public class Product{
        @Id
        @GeneratedValue(strategy = GenerationType.UUID)
        private UUID id;
        @Column(nullable = false)
        private String name;
        @Column(columnDefinition = "TEXT", nullable = false)
        private String description;
        @Column(nullable = false)
        private BigDecimal price;

        public void setId(UUID id) {
                this.id = id;
        }

        public UUID getId() {
                return id;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getName() {
                return name;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        public String getDescription() {
                return description;
        }

        public void setPrice(BigDecimal price) {
                this.price = price;
        }

        public BigDecimal getPrice() {
                return price;
        }
}
