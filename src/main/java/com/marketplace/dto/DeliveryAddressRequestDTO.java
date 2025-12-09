package com.marketplace.dto;

import jakarta.validation.constraints.NotNull;

public class DeliveryAddressRequestDTO {
    @NotNull(message = "City is required!")
    private String city;
    @NotNull(message = "Street is required!")
    private String street;
    @NotNull(message = "House is required!")
    private String house;
    private String apartment;
    @NotNull(message = "Index is required!")
    private String index;
}
