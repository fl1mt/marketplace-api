package com.marketplace.events;

import java.util.UUID;

public record DeliveryInTransitEvent(UUID orderId) { }
