package com.example.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Subscription;


public interface SubscriptionRepository extends JpaRepository<Subscription, UUID> {
}
