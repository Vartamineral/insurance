package com.example.service;

import java.util.UUID;

import com.example.model.Customer;


public interface CustomerService {
    Customer create(Customer customer);
    Customer update(Customer customer);
    Customer findById(UUID id);
}
