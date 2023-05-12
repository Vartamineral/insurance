package com.example.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.facade.CustomerFacade;
import com.example.web.dto.CustomerCreateDto;
import com.example.web.dto.CustomerDto;
import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping(value = "/api/v1/customers", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerFacade customerFacade;

    @PostMapping
    public ResponseEntity<CustomerDto> create(@RequestBody CustomerCreateDto dto) {
        return new ResponseEntity<>(customerFacade.create(dto), HttpStatus.CREATED);
    }
}
