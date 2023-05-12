package com.example.model;

import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "subscriptions")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Subscription {

    @Id
    private UUID id;

    private LocalDate startDate;

    private LocalDate validUntil;

    @ManyToOne
    @JoinColumn(name = "quotation_id")
    private Quotation quotation;
}
