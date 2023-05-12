package com.example.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Quotation;


public interface QuotationRepository extends JpaRepository<Quotation, UUID> {
}
