package com.microservice.CustomerServiceApplication.customerservice.controller;


import com.microservice.CustomerServiceApplication.customerservice.dto.CustomerRequestDTO;
import com.microservice.CustomerServiceApplication.customerservice.model.Customer;
import com.microservice.CustomerServiceApplication.customerservice.service.CustomerService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/register")
    public ResponseEntity<Customer> registerCustomer(@Valid @RequestBody CustomerRequestDTO request) {
        Customer customer = customerService.registerCustomer(request);
        return ResponseEntity.ok(customer);
    }

    @GetMapping("/{email}")
    public ResponseEntity<Customer> getCustomerByEmail(@PathVariable String email) {
        return customerService.findCustomerByEmail(email)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
