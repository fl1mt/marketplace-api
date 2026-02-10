package com.marketplace.events;

import java.util.UUID;

public record DeliveryDeliveredEvent(UUID orderId) { }
