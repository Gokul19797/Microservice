package com.microservice.CustomerServiceApplication.customerservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class CustomerRequestDTO {
    @NotEmpty
    private String name;

    @Email
    @NotEmpty
    private String email;

    @NotEmpty
    private String phone;

    private String address;

    @NotEmpty
    private String password;
}

