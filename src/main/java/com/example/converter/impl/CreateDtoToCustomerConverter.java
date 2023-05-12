package com.example.converter.impl;

import java.time.LocalDate;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.example.model.Customer;
import com.example.web.dto.CustomerCreateDto;

@Component
public class CreateDtoToCustomerConverter implements Converter<CustomerCreateDto, Customer> {

    @Override
    public Customer convert(final CustomerCreateDto source) {
        return Customer.builder()
            .firstName(source.getFirstName())
            .middleName(source.getMiddleName())
            .lastName(source.getLastName())
            .email(source.getEmail())
            .phoneNumber(source.getPhoneNumber())
            .birthDate(LocalDate.parse(source.getBirthDate()))
            .build();
    }
}
