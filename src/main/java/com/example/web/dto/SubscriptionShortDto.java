package com.example.web.dto;

import java.time.LocalDate;
import java.util.UUID;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class SubscriptionShortDto {

    @NotNull(message = "quotationId is mandatory")
    private UUID quotationId;

    @NotNull(message = "startDate is mandatory")
    private LocalDate startDate;

    @NotNull(message = "validUntil is mandatory")
    private LocalDate validUntil;
}
