package com.example.web.dto;

import java.util.UUID;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.annotations.OpenAPI30;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class CustomerDto {

    private UUID id;

    private String firstName;

    private String middleName;

    @NotEmpty
    private String lastName;

    @NotEmpty
    private String email;

    private String phoneNumber;

    private String birthDate;
}
