package com.marketplace.events;

import java.util.UUID;

public class OrderCreatedEvent {
    private UUID orderId;
    private UUID userId;
    private String city;
    private String street;
    private String index;

    public OrderCreatedEvent(UUID orderId, UUID userId, String city, String street, String index){
        // для упрощения оставим просто переменные city & address (street + house + apartment)
        this.orderId = orderId;
        this.userId = userId;
        this.city = city;
        this.street = street;
        this.index = index;
    }

    public void setOrderId(UUID orderId){
        this.orderId = orderId;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId){
        this.userId = userId;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getIndex() {
        return index;
    }
}
