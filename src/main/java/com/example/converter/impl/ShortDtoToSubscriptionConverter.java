package com.example.converter.impl;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.example.model.Subscription;
import com.example.web.dto.SubscriptionShortDto;

@Component
public class ShortDtoToSubscriptionConverter implements Converter<SubscriptionShortDto, Subscription> {

    @Override
    public Subscription convert(final SubscriptionShortDto source) {
        return Subscription.builder()
            .startDate(source.getStartDate())
            .validUntil(source.getValidUntil())
            .build();
    }
}
