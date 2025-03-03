package com.bbva.uuaa.helloWorld.facade.v0.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Getter
@Setter
public class Product {
    @NotNull(message = "El campo id no puede ser nulo.")
    @Pattern(regexp = "^TDC$", message = "El campo id debe ser igual a 'TDC'.")
    private String id;

    @Valid
    @NotNull(message = "El campo subproduct no puede ser nulo.")
    private Subproduct subproduct;
}
