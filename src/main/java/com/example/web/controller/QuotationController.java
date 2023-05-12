package com.example.web.controller;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.facade.QuotationFacade;
import com.example.web.dto.QuotationDto;
import com.example.web.dto.QuotationShortDto;
import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping(value = "/api/v1/quotations", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class QuotationController {

    private final QuotationFacade quotationFacade;

    @PostMapping
    public ResponseEntity<QuotationDto> create(@Valid @RequestBody QuotationShortDto dto) {
        return new ResponseEntity<>(quotationFacade.create(dto), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<QuotationDto> findById(@RequestParam UUID id) {
        return new ResponseEntity<>(quotationFacade.findById(id), HttpStatus.OK);
    }
}
