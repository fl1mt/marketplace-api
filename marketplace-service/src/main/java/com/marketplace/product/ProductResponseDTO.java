package com.marketplace.product;

import com.marketplace.product.ProductType;

import java.math.BigDecimal;
import java.util.UUID;

public class ProductResponseDTO {
    private UUID id;
    private String name;
    private String description;
    private ProductType category;
    private Integer discountPercentage;
    private Integer inventoryStock;
    private BigDecimal averageRating;
    private Long reviewCount;
    private BigDecimal basePrice;
    private BigDecimal finalPrice;

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    public BigDecimal getBasePrice(){
        return basePrice;
    }
    public void setBasePrice(BigDecimal basePrice){
        this.basePrice = basePrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public void setCategory(ProductType category) {
        this.category = category;
    }

    public ProductType getCategory() {
        return category;
    }

    public void setDiscountPercentage(Integer discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public Integer getDiscountPercentage() {
        return discountPercentage;
    }

    public void setInventoryStock(Integer inventoryStock) {
        this.inventoryStock = inventoryStock;
    }

    public Integer getInventoryStock() {
        return inventoryStock;
    }

    public void setAverageRating(BigDecimal averageRating) {
        this.averageRating = averageRating;
    }

    public BigDecimal getAverageRating() {
        return averageRating;
    }

    public void setReviewCount(Long reviewCount) {
        this.reviewCount = reviewCount;
    }

    public Long getReviewCount() {
        return reviewCount;
    }

    public void setFinalPrice(BigDecimal finalPrice) {
        this.finalPrice = finalPrice;
    }

    public BigDecimal getFinalPrice() {
        return finalPrice;
    }
}
