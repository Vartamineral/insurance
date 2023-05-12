package com.example.facade.impl;

import java.util.Objects;
import java.util.UUID;

import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import com.example.facade.SubscriptionFacade;
import com.example.model.Subscription;
import com.example.service.QuotationService;
import com.example.service.SubscriptionService;
import com.example.web.dto.SubscriptionDto;
import com.example.web.dto.SubscriptionShortDto;
import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class SubscriptionFacadeImpl implements SubscriptionFacade {

    private final SubscriptionService subscriptionService;
    private final ConversionService conversionService;
    private final QuotationService quotationService;

    @Override
    public SubscriptionDto create(final SubscriptionShortDto dto) {
        Subscription subscription = conversionService.convert(dto, Subscription.class);
        Objects.requireNonNull(subscription).setQuotation(quotationService.findById(dto.getQuotationId()));
        Subscription createdSubscription = subscriptionService.create(subscription);
        return conversionService.convert(createdSubscription, SubscriptionDto.class);
    }

    @Override
    public SubscriptionDto findById(final UUID id) {
        return conversionService.convert(subscriptionService.findById(id), SubscriptionDto.class);
    }
}
