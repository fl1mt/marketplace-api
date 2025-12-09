package com.marketplace.dto;

import jakarta.persistence.Column;

import java.math.BigDecimal;
import java.util.UUID;

public class ProductResponseDTO {
    private UUID id;
    private String name;
    private String description;
    private BigDecimal price;
}
