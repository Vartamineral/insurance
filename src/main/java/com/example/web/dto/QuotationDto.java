package com.example.web.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Getter
public class QuotationDto extends QuotationShortDto{

    private UUID id;

    @Builder(builderMethodName = "quotationDtoBuilder")
    public QuotationDto(@NotNull(message = "beginingOfInsurance is mandatory") final LocalDate beginingOfInsurance,
                        @NotNull(message = "insuredAmount is mandatory") final BigDecimal insuredAmount,
                        @NotNull(message = "dateOfSigningMortgage is mandatory") final LocalDate dateOfSigningMortgage,
                        @NotNull(message = "customerId is mandatory")final UUID customerId,
                        final UUID id) {
        super(beginingOfInsurance, insuredAmount, dateOfSigningMortgage, customerId);
        this.id = id;
    }
}
