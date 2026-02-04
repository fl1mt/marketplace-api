package com.marketplace.user.auth;

import jakarta.validation.constraints.*;

public class UserRegisterRequestDTO {
    @NotBlank(message = "Name is required!")
    @Size(min = 2, max = 50, message = "Name must be 2-50 characters")
    private String firstname;
    @Size(max = 50, message = "Lastname too long")
    private String lastname;

    @NotBlank(message = "Email is required!")
    @Email(message = "Invalid email format")
    private String email;

    @NotBlank(message = "Phone number is required!")
    @Pattern(regexp = "^\\+?[1-9]\\d{1,14}$", message = "Invalid phone number")
    private String phoneNumber;

    @NotBlank(message = "Password is required!")
    @Size(min = 8, max = 30, message = "Password must be 8-30 characters")
    private String passwordHash;
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getPasswordHash() {
        return passwordHash;
    }
}
