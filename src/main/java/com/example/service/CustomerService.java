package com.example.service;

import com.example.model.Customer;
import com.example.web.dto.CustomerCreateDto;


public interface CustomerService {
    Customer create(Customer customer);
}
