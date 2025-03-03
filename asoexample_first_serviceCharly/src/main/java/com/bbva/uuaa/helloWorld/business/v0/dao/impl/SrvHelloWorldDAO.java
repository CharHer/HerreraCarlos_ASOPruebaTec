package com.bbva.uuaa.helloWorld.business.v0.dao.impl;

import com.bbva.uuaa.helloWorld.business.v0.dao.ISrvHelloWorldDAO;

import com.bbva.uuaa.helloWorld.business.v0.dto.BDetails;
import com.bbva.uuaa.helloWorld.business.v0.dto.BDetailsOut;
import com.bbva.uuaa.helloWorld.business.v0.dto.BDetailsRequest;
import com.bbva.uuaa.helloWorld.business.v0.dto.BLimitAmount;
import com.bbva.uuaa.helloWorld.business.v0.dto.BLimitAmountOut;
import com.bbva.uuaa.helloWorld.business.v0.dto.BProduct;
import com.bbva.uuaa.helloWorld.business.v0.dto.BProductOut;
import com.bbva.uuaa.helloWorld.business.v0.dto.BSubproductOut;
import org.springframework.stereotype.Repository;

@Repository
public class SrvHelloWorldDAO implements ISrvHelloWorldDAO {

    @Override
    public BDetailsOut mapDAO(BDetailsRequest detailsRequest) {
        BDetails bDetails = detailsRequest.getDetails();

        BDetailsOut bDetailsOut = new BDetailsOut();

        bDetailsOut.setDetails(bDetails);

        BLimitAmount bLimitAmount = bDetails.getLimitAmount();
        BLimitAmountOut minimumAmount = new BLimitAmountOut();
        minimumAmount.setAmount(bLimitAmount.getAmount() * 0.9);
        minimumAmount.setCurrency(bLimitAmount.getCurrency());

        BLimitAmountOut maximumAmount = new BLimitAmountOut();
        maximumAmount.setAmount(bLimitAmount.getAmount() * 1.05);
        maximumAmount.setCurrency(bLimitAmount.getCurrency());

        bDetailsOut.setMinimumAmount(minimumAmount);
        bDetailsOut.setMaximumAmount(maximumAmount);

        BProduct bProduct = bDetails.getProduct();
        BProductOut bProductOut = new BProductOut();
        bProductOut.setId(bProduct.getId());

        BSubproductOut bSubproductOut = new BSubproductOut();
        bSubproductOut.setId(bProduct.getSubproduct().getId());
        bProductOut.setSubproductOut(bSubproductOut);

        bDetailsOut.setProduct(bProductOut);

        return bDetailsOut;
    }

}
