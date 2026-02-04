package com.marketplace.order.orderDiscount;

import com.marketplace.order.Order;

import java.math.BigDecimal;

public interface OrderDiscountStrategy {
    BigDecimal calculateOrderDiscount(Order order);
}
