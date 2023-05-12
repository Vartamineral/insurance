package com.example.facade;

import com.example.model.Customer;
import com.example.web.dto.CustomerCreateDto;
import com.example.web.dto.CustomerDto;


public interface CustomerFacade {
    CustomerDto create(CustomerCreateDto customerCreateDto);
}
