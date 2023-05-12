package com.example.converter.impl;

import java.time.LocalDate;
import java.util.Objects;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.example.model.Quotation;
import com.example.web.dto.QuotationDto;


@Component
public class QuotationToDtoConverter implements Converter<Quotation, QuotationDto> {

    @Override
    public QuotationDto convert(final Quotation source) {
        return QuotationDto.quotationDtoBuilder()
            .id(source.getId())
            .beginingOfInsurance(source.getBeginingOfInsurance())
            .insuredAmount(source.getInsuredAmount())
            .dateOfSigningMortgage(source.getDateOfSigningMortgage())
            .customerId(Objects.requireNonNull(source.getCustomer()).getId())
            .build();
    }
}
