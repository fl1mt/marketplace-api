package com.marketplace.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class OrderItemResponseDTO {
    private UUID id;
    private OrderResponseDTO orderResponseDTO;
    private ProductResponseDTO productResponseDTO;
    private Integer quantity;
    private BigDecimal priceAtPurchase;
    @JsonIgnore
    private LocalDateTime createdAt;
    @JsonIgnore
    private LocalDateTime updatedAt;

}
