package com.marketplace.product.productDiscount;
import com.marketplace.product.Product;

import java.math.BigDecimal;

public interface ProductDiscountStrategy {
    BigDecimal calculateProductDiscount(Product product);
}
