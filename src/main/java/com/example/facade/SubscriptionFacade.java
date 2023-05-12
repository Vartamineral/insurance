package com.example.facade;

import java.util.UUID;

import com.example.model.Subscription;
import com.example.web.dto.SubscriptionDto;
import com.example.web.dto.SubscriptionShortDto;


public interface SubscriptionFacade {
    SubscriptionDto create(SubscriptionShortDto dto);
    SubscriptionDto findById(UUID id);
}
