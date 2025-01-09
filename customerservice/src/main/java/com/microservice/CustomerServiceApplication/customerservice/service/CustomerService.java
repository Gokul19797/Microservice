package com.microservice.CustomerServiceApplication.customerservice.service;



import com.microservice.CustomerServiceApplication.customerservice.dto.CustomerRequestDTO;
import com.microservice.CustomerServiceApplication.customerservice.model.Customer;
import com.microservice.CustomerServiceApplication.customerservice.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public Customer registerCustomer(CustomerRequestDTO request) {
        Customer customer = new Customer();
        customer.setName(request.getName());
        customer.setEmail(request.getEmail());
        customer.setPhone(request.getPhone());
        customer.setAddress(request.getAddress());
        customer.setPassword(request.getPassword()); // TODO: Encrypt password
        return repository.save(customer);
    }

    public Optional<Customer> findCustomerByEmail(String email) {
        return repository.findByEmail(email);
    }
}

