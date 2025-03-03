package com.bbva.uuaa.helloWorld.facade.v0.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Size;

@Getter
@Setter
public class Subproduct {
    @Size(max = 2, message = "El campo id no puede tener más de 2 caracteres.")
    private String id;
}
