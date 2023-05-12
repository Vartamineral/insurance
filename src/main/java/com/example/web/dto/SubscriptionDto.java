package com.example.web.dto;

import java.time.LocalDate;
import java.util.UUID;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Getter
public class SubscriptionDto extends SubscriptionShortDto{

    private UUID id;

    @Builder(builderMethodName = "subscriptionDtoBuilder")
    public SubscriptionDto(final @NotNull(message = "quotationId is mandatory") UUID quotationId,
                           final @NotNull(message = "startDate is mandatory") LocalDate startDate,
                           final @NotNull(message = "validUntil is mandatory") LocalDate validUntil,
                           final UUID id) {
        super(quotationId, startDate, validUntil);
        this.id = id;
    }
}
