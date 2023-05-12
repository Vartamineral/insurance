package com.example.facade.impl;

import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import com.example.facade.CustomerFacade;
import com.example.model.Customer;
import com.example.service.CustomerService;
import com.example.web.dto.CustomerCreateDto;
import com.example.web.dto.CustomerDto;
import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class CustomerFacadeImpl implements CustomerFacade {

    private final CustomerService customerService;
    private final ConversionService conversionService;

    @Override
    public CustomerDto create(final CustomerCreateDto customerCreateDto) {
        Customer createdCustomer = customerService.create(
            conversionService.convert(customerCreateDto, Customer.class));
        return conversionService.convert(createdCustomer, CustomerDto.class);
    }
}
