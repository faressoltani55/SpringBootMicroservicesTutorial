package com.fares_tutorials.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {
}
