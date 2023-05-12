package com.example.converter.impl;

import java.util.Objects;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.example.model.Subscription;
import com.example.web.dto.SubscriptionDto;

@Component
public class SubscriptionToDtoConverter implements Converter<Subscription, SubscriptionDto> {

    @Override
    public SubscriptionDto convert(final Subscription source) {
        return SubscriptionDto.subscriptionDtoBuilder()
            .id(source.getId())
            .startDate(source.getStartDate())
            .validUntil(source.getValidUntil())
            .quotationId(Objects.requireNonNull(source.getQuotation()).getId())
            .build();
    }
}
