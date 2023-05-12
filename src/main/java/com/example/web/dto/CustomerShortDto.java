package com.example.web.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.validation.annotation.Validated;

import com.example.model.Quotation;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class CustomerShortDto {

    private String firstName;

    private String middleName;

    @NotBlank(message = "lastName is mandatory")
    private String lastName;

    @NotBlank(message = "Email is mandatory")
    @Email
    private String email;

    @Size(max = 16)
    private String phoneNumber;

    private LocalDate birthDate;
}
