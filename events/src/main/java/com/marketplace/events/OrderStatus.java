package com.marketplace.events;

public enum OrderStatus {
    CREATED,
    DELIVERY_REQUESTED,
    DELIVERY_CONFIRMED,
    IN_TRANSIT,
    WAITING_FOR_RECEIVE,
    COMPLETED,
    CANCELED_BY_USER,
    CANCELED
}
