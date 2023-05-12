package com.example.converter.impl;

import java.time.LocalDate;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.example.model.Customer;
import com.example.model.Quotation;
import com.example.web.dto.CustomerShortDto;
import com.example.web.dto.QuotationShortDto;

@Component
public class ShortDtoToQuotationConverter implements Converter<QuotationShortDto, Quotation> {

    @Override
    public Quotation convert(final QuotationShortDto source) {
        return Quotation.builder()
            .beginingOfInsurance(source.getBeginingOfInsurance())
            .insuredAmount(source.getInsuredAmount())
            .dateOfSigningMortgage(source.getDateOfSigningMortgage())
            .build();
    }
}
