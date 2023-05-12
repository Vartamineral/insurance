package com.example.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.model.Quotation;
import com.example.model.Subscription;
import com.example.repository.SubscriptionRepository;
import com.example.service.SubscriptionService;


@ExtendWith(MockitoExtension.class)
class SubscriptionServiceImplTest {

    @Mock
    private SubscriptionRepository subscriptionRepositoryMock;

    @Mock
    private Quotation quotationMock;

    @InjectMocks
    private SubscriptionServiceImpl sut;

    @Test
    void shouldCreateSubscription() {

        //given
        Subscription subscription = new Subscription(
            UUID.randomUUID(), LocalDate.parse("2023-05-12"),
            LocalDate.parse("2023-06-12"), quotationMock);
        when(subscriptionRepositoryMock.saveAndFlush(any())).thenReturn(subscription);

        //when
        Subscription actual = sut.create(subscription);

        //then
        assertEquals(subscription, actual);
    }
}