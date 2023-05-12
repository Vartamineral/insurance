package com.example.repo;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Customer;


public interface CustomerRepository extends JpaRepository<Customer, UUID> {
}
