package com.marketplace.events;

import java.math.BigDecimal;

public class OrderCreatedEvent {

    private String orderId;
    private String userId;
    private BigDecimal totalPrice;

    public String getOrderId() {
        return orderId;
    }
}
