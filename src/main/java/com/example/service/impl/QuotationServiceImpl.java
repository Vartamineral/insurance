package com.example.service.impl;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.exception.NotFoundException;
import com.example.model.Quotation;
import com.example.repository.QuotationRepository;
import com.example.service.QuotationService;
import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class QuotationServiceImpl implements QuotationService {

    private final QuotationRepository quotationRepository;

    @Override
    public Quotation create(final Quotation quotation) {
        quotation.setId(UUID.randomUUID());
        return quotationRepository.saveAndFlush(quotation);
    }

    @Override
    public Quotation findById(final UUID id) {
        return quotationRepository.findById(id).orElseThrow(() -> new NotFoundException("Quotation not found: id=" + id));
    }
}
