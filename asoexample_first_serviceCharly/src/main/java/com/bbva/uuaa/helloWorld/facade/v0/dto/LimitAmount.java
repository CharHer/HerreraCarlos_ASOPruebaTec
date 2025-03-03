package com.bbva.uuaa.helloWorld.facade.v0.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class LimitAmount {
    @NotNull(message = "El campo amount no puede ser nulo.")
    private Double amount;

    @NotBlank
    private String currency;
}
