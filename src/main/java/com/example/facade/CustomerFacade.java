package com.example.facade;

import java.util.UUID;

import com.example.web.dto.CustomerShortDto;
import com.example.web.dto.CustomerDto;


public interface CustomerFacade {
    CustomerDto create(CustomerShortDto customerShortDto);
    CustomerDto update(UUID id, CustomerShortDto customerShortDto);
}
