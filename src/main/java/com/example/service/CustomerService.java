package com.example.service;

import com.example.model.Customer;


public interface CustomerService {
    Customer create(Customer customer);
    Customer update(Customer customer);
}
