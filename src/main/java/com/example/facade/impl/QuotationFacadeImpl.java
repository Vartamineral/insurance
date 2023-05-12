package com.example.facade.impl;

import java.util.Objects;
import java.util.UUID;

import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import com.example.facade.QuotationFacade;
import com.example.model.Customer;
import com.example.model.Quotation;
import com.example.service.CustomerService;
import com.example.service.QuotationService;
import com.example.web.dto.CustomerDto;
import com.example.web.dto.QuotationDto;
import com.example.web.dto.QuotationShortDto;
import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class QuotationFacadeImpl implements QuotationFacade {

    private final QuotationService quotationService;
    private final CustomerService customerService;
    private final ConversionService conversionService;

    @Override
    public QuotationDto create(final QuotationShortDto dto) {
        Quotation quotation = conversionService.convert(dto, Quotation.class);
        Objects.requireNonNull(quotation).setCustomer(customerService.findById(dto.getCustomerId()));
        Quotation createdQuotation = quotationService.create(quotation);
        return conversionService.convert(createdQuotation, QuotationDto.class);
    }

    @Override
    public QuotationDto findById(final UUID id) {
        return conversionService.convert(quotationService.findById(id), QuotationDto.class);
    }
}
