package com.marketplace.order;


import com.marketplace.order.orderDiscount.OrderDiscountService;
import com.marketplace.orderItem.OrderItem;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class OrderPricingService {
    private final OrderDiscountService orderDiscountService;

    public OrderPricingService(OrderDiscountService orderDiscountService) {
        this.orderDiscountService = orderDiscountService;
    }

    public void calculateTotals(Order order, List<OrderItem> items) {

        BigDecimal subtotal = items.stream()
                .map(item ->
                        item.getPriceAtPurchase()
                                .multiply(BigDecimal.valueOf(item.getQuantity()))
                )
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        order.setSubtotal(subtotal);

        BigDecimal discount = orderDiscountService.calculateTotalOrderDiscount(order);
        order.setDiscountAmount(discount);

        order.setFinalTotal(subtotal.subtract(discount).add(order.getShippingCost()));
    }
}
