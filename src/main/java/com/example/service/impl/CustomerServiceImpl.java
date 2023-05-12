package com.example.service.impl;

import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.model.Customer;
import com.example.repo.CustomerRepository;
import com.example.service.CustomerService;
import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public Customer create(final Customer customer) {
        customer.setId(UUID.randomUUID());
        return customerRepository.saveAndFlush(customer);
    }

    @Override
    @Transactional
    public Customer update(final Customer customer) {
        return customerRepository.save(customer);
    }
}
