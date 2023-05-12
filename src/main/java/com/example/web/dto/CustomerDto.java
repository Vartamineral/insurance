package com.example.web.dto;

import java.time.LocalDate;
import java.util.UUID;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.validation.annotation.Validated;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.annotations.OpenAPI30;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CustomerDto extends CustomerShortDto{

    private UUID id;

    @Builder(builderMethodName = "customerDtoBuilder")
    public CustomerDto(final String firstName,
                       final String middleName,
                       @NotBlank(message = "lastName is mandatory") final String lastName,
                       @NotBlank(message = "Email is mandatory") @Email final String email,
                       @Size(max = 16) final String phoneNumber,
                       final LocalDate birthDate,
                       final UUID id) {
        super(firstName, middleName, lastName, email, phoneNumber, birthDate);
        this.id = id;
    }
}
