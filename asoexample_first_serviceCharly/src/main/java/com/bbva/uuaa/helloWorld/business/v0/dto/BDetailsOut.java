package com.bbva.uuaa.helloWorld.business.v0.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BDetailsOut {
    private String id;
    private String nuip;
    private BDetails details;
    private BLimitAmountOut minimumAmount;
    private BLimitAmountOut maximumAmount;
    private BProductOut product;
}
