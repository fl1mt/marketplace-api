package com.marketplace.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public class OrderItemRequestDTO {
    @NotNull(message = "Order is required!")
    private OrderRequestDTO orderRequestDTO;
    @NotNull(message = "Product is required!")
    private ProductRequestDTO productRequestDTO;
    @NotNull(message = "Quantity is required!")
    private Integer quantity;
    @JsonIgnore
    private LocalDateTime createdAt;
    @JsonIgnore
    private LocalDateTime updatedAt;

}
