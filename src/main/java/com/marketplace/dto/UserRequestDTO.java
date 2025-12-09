package com.marketplace.dto;

import jakarta.validation.constraints.NotNull;

public class UserRequestDTO {
    @NotNull(message = "Phone number is required!")
    private String phoneNumber;
    @NotNull(message = "Firstname is required!")
    private String firstname;
    private String lastname;
    @NotNull(message = "Email is required!")
    private String email;
}
