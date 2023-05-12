package com.example.repo;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Customer;
import com.example.model.Quotation;


public interface QuotationRepository extends JpaRepository<Quotation, UUID> {
}
