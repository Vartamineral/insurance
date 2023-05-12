package com.example.converter.impl;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.example.model.Customer;
import com.example.web.dto.CustomerDto;

@Component
public class CustomerToDtoConverter implements Converter<Customer, CustomerDto> {

    @Override
    public CustomerDto convert(final Customer source) {
        return CustomerDto.customerDtoBuilder()
            .id(source.getId())
            .firstName(source.getFirstName())
            .middleName(source.getMiddleName())
            .lastName(source.getLastName())
            .email(source.getEmail())
            .phoneNumber(source.getPhoneNumber())
            .birthDate(source.getBirthDate())
            .build();
    }
}