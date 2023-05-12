package com.example.facade.impl;

import java.util.Objects;
import java.util.UUID;

import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import com.example.facade.CustomerFacade;
import com.example.model.Customer;
import com.example.service.CustomerService;
import com.example.web.dto.CustomerShortDto;
import com.example.web.dto.CustomerDto;
import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class CustomerFacadeImpl implements CustomerFacade {

    private final CustomerService customerService;
    private final ConversionService conversionService;

    @Override
    public CustomerDto create(final CustomerShortDto customerShortDto) {
        Customer createdCustomer = customerService.create(
            conversionService.convert(customerShortDto, Customer.class));
        return conversionService.convert(createdCustomer, CustomerDto.class);
    }

    @Override
    public CustomerDto update(final UUID id, final CustomerShortDto customerShortDto) {
        Customer customer = conversionService.convert(customerShortDto, Customer.class);
        Objects.requireNonNull(customer).setId(id);
        Customer updatedCustomer = customerService.update(customer);
        return conversionService.convert(updatedCustomer, CustomerDto.class);
    }
}
