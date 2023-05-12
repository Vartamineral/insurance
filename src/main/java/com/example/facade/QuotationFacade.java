package com.example.facade;

import java.util.UUID;

import com.example.model.Quotation;
import com.example.web.dto.QuotationDto;
import com.example.web.dto.QuotationShortDto;


public interface QuotationFacade {
    QuotationDto create(final QuotationShortDto dto);
}
