package com.example.service.impl;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.exception.NotFoundException;
import com.example.model.Subscription;
import com.example.repository.SubscriptionRepository;
import com.example.service.SubscriptionService;
import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class SubscriptionServiceImpl implements SubscriptionService {

    private final SubscriptionRepository subscriptionRepository;

    @Override
    public Subscription create(final Subscription subscription) {
        subscription.setId(UUID.randomUUID());
        return subscriptionRepository.saveAndFlush(subscription);
    }

    @Override
    public Subscription findById(final UUID id) {
        return subscriptionRepository.findById(id).orElseThrow(() -> new NotFoundException("Subscription not found: id=" + id));
    }
}
