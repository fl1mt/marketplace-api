package com.marketplace.events;

import java.util.UUID;

public record OrderStatusChangedEvent (
        String status,
        UUID userId,
        UUID orderId,
        String email,
        String phone
){ }
