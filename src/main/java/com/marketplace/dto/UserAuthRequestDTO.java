package com.marketplace.dto;

import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public class UserAuthRequestDTO {
    @NotNull(message = "Email is required!")
    private String email;
    @NotNull(message = "Password is required!")
    private String password;
}
