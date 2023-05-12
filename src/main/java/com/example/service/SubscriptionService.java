package com.example.service;

import java.util.UUID;

import com.example.model.Subscription;


public interface SubscriptionService {
    Subscription create(Subscription subscription);
    Subscription findById(UUID id);
}
