package com.example.web.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class QuotationShortDto {

    @NotNull(message = "beginingOfInsurance is mandatory")
    private LocalDate beginingOfInsurance;

    @NotNull(message = "insuredAmount is mandatory")
    private BigDecimal insuredAmount;

    @NotNull(message = "dateOfSigningMortgage is mandatory")
    private LocalDate dateOfSigningMortgage;

    @NotNull(message = "customerId is mandatory")
    private UUID customerId;
}
