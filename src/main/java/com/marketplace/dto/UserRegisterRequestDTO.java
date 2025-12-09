package com.marketplace.dto;

import jakarta.validation.constraints.NotNull;

public class UserRegisterRequestDTO {
    @NotNull(message = "Name is required!")
    private String firstname;
    private String lastname;
    @NotNull(message = "Email is required!")

    private String email;
    @NotNull(message = "Phone number is required!")

    private String phoneNumber;
    @NotNull(message = "Password is required!")

    private String passwordHash;
}
