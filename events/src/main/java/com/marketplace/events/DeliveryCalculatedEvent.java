package com.marketplace.events;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class DeliveryCalculatedEvent{
    private UUID orderId;
    private BigDecimal deliveryPrice;
    private LocalDate deliveryDate;

    public DeliveryCalculatedEvent(UUID orderId, BigDecimal deliveryPrice, LocalDate deliveryDate) {
        this.orderId = orderId;
        this.deliveryPrice = deliveryPrice;
        this.deliveryDate = deliveryDate;
    }

    public void setOrderId(UUID orderId) {
        this.orderId = orderId;
    }

    public void setDeliveryPrice(BigDecimal deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public BigDecimal getDeliveryPrice() {
        return deliveryPrice;
    }

    public UUID getOrderId() {
        return orderId;
    }
}


