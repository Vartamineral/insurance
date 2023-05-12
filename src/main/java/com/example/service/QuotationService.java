package com.example.service;

import java.util.UUID;

import com.example.model.Quotation;


public interface QuotationService {
    Quotation create(Quotation quotation);
    Quotation findById(UUID id);
}
