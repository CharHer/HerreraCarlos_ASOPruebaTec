package com.bbva.uuaa.helloWorld.facade.v0.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Getter
@Setter
public class Details {
	@NotNull(message = "El campo offerType no puede ser nulo.")
	@Pattern(regexp = "^[A-Z_]+$", message = "El campo offerType debe contener solo mayúsculas.")
	private String offerType;

	@Valid
	@NotNull(message = "El campo limitAmount no puede ser nulo.")
	private LimitAmount limitAmount;

	@Valid
	@NotNull(message = "El campo product no puede ser nulo.")
	private Product product;
}