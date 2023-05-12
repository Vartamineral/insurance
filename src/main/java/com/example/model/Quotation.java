package com.example.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "quotations")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Quotation {

    @Id
    private UUID id;

    private LocalDate beginingOfInsurance;

    private BigDecimal insuredAmount;

    private LocalDate dateOfSigningMortgage;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
