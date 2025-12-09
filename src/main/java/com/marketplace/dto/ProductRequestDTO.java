package com.marketplace.dto;

import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public class ProductRequestDTO {
    @NotNull(message = "Product name is required!")
    private String name;
    @NotNull(message = "Product description is required!")
    private String description;
    @NotNull(message = "Product price is required!")
    private BigDecimal price;
}
