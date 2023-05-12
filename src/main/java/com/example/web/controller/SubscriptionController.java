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

import com.example.facade.SubscriptionFacade;
import com.example.web.dto.SubscriptionDto;
import com.example.web.dto.SubscriptionShortDto;
import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping(value = "/api/v1/subscriptions", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class SubscriptionController {

    private final SubscriptionFacade subscriptionFacade;

    @PostMapping
    public ResponseEntity<SubscriptionDto> create(@Valid @RequestBody SubscriptionShortDto dto) {
        return new ResponseEntity<>(subscriptionFacade.create(dto), HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<SubscriptionDto> findById(@Valid @RequestParam UUID id) {
        return new ResponseEntity<>(subscriptionFacade.findById(id), HttpStatus.OK);
    }
}
