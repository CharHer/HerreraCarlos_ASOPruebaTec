package com.bbva.uuaa.helloWorld.facade.v0.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DetailsOut {
    private String id;
    private String nuip;
    private Details details;
    private LimitAmountOut minimumAmount;
    private LimitAmountOut maximumAmount;
    private ProductOut product;
}
