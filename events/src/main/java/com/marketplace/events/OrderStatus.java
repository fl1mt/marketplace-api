package com.marketplace.events;

public enum OrderStatus {
    CREATED,
    DELIVERY_REQUESTED,
    DELIVERY_CONFIRMED,
    IN_TRANSIT,
    WAITING_FOR_RECEIVE,
    COMPLETED,
    CANCELLED_BY_USER,
    CANCELLED
}
