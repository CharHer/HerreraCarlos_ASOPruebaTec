package com.bbva.uuaa.helloWorld.facade.v0.mapper;

import com.bbva.uuaa.helloWorld.business.v0.dto.BDetails;
import com.bbva.uuaa.helloWorld.business.v0.dto.BDetailsOut;
import com.bbva.uuaa.helloWorld.business.v0.dto.BDetailsRequest;
import com.bbva.uuaa.helloWorld.business.v0.dto.BLimitAmount;
import com.bbva.uuaa.helloWorld.business.v0.dto.BLimitAmountOut;
import com.bbva.uuaa.helloWorld.business.v0.dto.BProduct;
import com.bbva.uuaa.helloWorld.business.v0.dto.BProductOut;
import com.bbva.uuaa.helloWorld.business.v0.dto.BSubproduct;
import com.bbva.uuaa.helloWorld.business.v0.dto.BSubproductOut;
import com.bbva.uuaa.helloWorld.facade.v0.dto.Details;
import com.bbva.uuaa.helloWorld.facade.v0.dto.DetailsOut;
import com.bbva.uuaa.helloWorld.facade.v0.dto.DetailsRequest;
import com.bbva.uuaa.helloWorld.facade.v0.dto.LimitAmount;
import com.bbva.uuaa.helloWorld.facade.v0.dto.LimitAmountOut;
import com.bbva.uuaa.helloWorld.facade.v0.dto.Product;
import com.bbva.uuaa.helloWorld.facade.v0.dto.ProductOut;
import com.bbva.uuaa.helloWorld.facade.v0.dto.Subproduct;
import com.bbva.uuaa.helloWorld.facade.v0.dto.SubproductOut;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-18T00:40:34-0600",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 1.8.0_442 (Amazon.com Inc.)"
)
@Component
public class ISrvHelloWorldMapperImpl implements ISrvHelloWorldMapper {

    @Override
    public BDetailsRequest detailsRequestToBDetailsRequest(DetailsRequest detailsRequest) {
        if ( detailsRequest == null ) {
            return null;
        }

        BDetailsRequest bDetailsRequest = new BDetailsRequest();

        bDetailsRequest.setDetails( detailsToBDetails( detailsRequest.getDetails() ) );

        return bDetailsRequest;
    }

    @Override
    public DetailsOut bDetailsOutToDetailsOut(BDetailsOut bDetailsOut) {
        if ( bDetailsOut == null ) {
            return null;
        }

        DetailsOut detailsOut = new DetailsOut();

        detailsOut.setId( bDetailsOut.getId() );
        detailsOut.setNuip( bDetailsOut.getNuip() );
        detailsOut.setDetails( bDetailsToDetails( bDetailsOut.getDetails() ) );
        detailsOut.setMinimumAmount( bLimitAmountOutToLimitAmountOut( bDetailsOut.getMinimumAmount() ) );
        detailsOut.setMaximumAmount( bLimitAmountOutToLimitAmountOut( bDetailsOut.getMaximumAmount() ) );
        detailsOut.setProduct( bProductOutToProductOut( bDetailsOut.getProduct() ) );

        return detailsOut;
    }

    protected BLimitAmount limitAmountToBLimitAmount(LimitAmount limitAmount) {
        if ( limitAmount == null ) {
            return null;
        }

        BLimitAmount bLimitAmount = new BLimitAmount();

        bLimitAmount.setAmount( limitAmount.getAmount() );
        bLimitAmount.setCurrency( limitAmount.getCurrency() );

        return bLimitAmount;
    }

    protected BSubproduct subproductToBSubproduct(Subproduct subproduct) {
        if ( subproduct == null ) {
            return null;
        }

        BSubproduct bSubproduct = new BSubproduct();

        bSubproduct.setId( subproduct.getId() );

        return bSubproduct;
    }

    protected BProduct productToBProduct(Product product) {
        if ( product == null ) {
            return null;
        }

        BProduct bProduct = new BProduct();

        bProduct.setId( product.getId() );
        bProduct.setSubproduct( subproductToBSubproduct( product.getSubproduct() ) );

        return bProduct;
    }

    protected BDetails detailsToBDetails(Details details) {
        if ( details == null ) {
            return null;
        }

        BDetails bDetails = new BDetails();

        bDetails.setOfferType( details.getOfferType() );
        bDetails.setLimitAmount( limitAmountToBLimitAmount( details.getLimitAmount() ) );
        bDetails.setProduct( productToBProduct( details.getProduct() ) );

        return bDetails;
    }

    protected LimitAmount bLimitAmountToLimitAmount(BLimitAmount bLimitAmount) {
        if ( bLimitAmount == null ) {
            return null;
        }

        LimitAmount limitAmount = new LimitAmount();

        limitAmount.setAmount( bLimitAmount.getAmount() );
        limitAmount.setCurrency( bLimitAmount.getCurrency() );

        return limitAmount;
    }

    protected Subproduct bSubproductToSubproduct(BSubproduct bSubproduct) {
        if ( bSubproduct == null ) {
            return null;
        }

        Subproduct subproduct = new Subproduct();

        subproduct.setId( bSubproduct.getId() );

        return subproduct;
    }

    protected Product bProductToProduct(BProduct bProduct) {
        if ( bProduct == null ) {
            return null;
        }

        Product product = new Product();

        product.setId( bProduct.getId() );
        product.setSubproduct( bSubproductToSubproduct( bProduct.getSubproduct() ) );

        return product;
    }

    protected Details bDetailsToDetails(BDetails bDetails) {
        if ( bDetails == null ) {
            return null;
        }

        Details details = new Details();

        details.setOfferType( bDetails.getOfferType() );
        details.setLimitAmount( bLimitAmountToLimitAmount( bDetails.getLimitAmount() ) );
        details.setProduct( bProductToProduct( bDetails.getProduct() ) );

        return details;
    }

    protected LimitAmountOut bLimitAmountOutToLimitAmountOut(BLimitAmountOut bLimitAmountOut) {
        if ( bLimitAmountOut == null ) {
            return null;
        }

        LimitAmountOut limitAmountOut = new LimitAmountOut();

        limitAmountOut.setAmount( bLimitAmountOut.getAmount() );
        limitAmountOut.setCurrency( bLimitAmountOut.getCurrency() );

        return limitAmountOut;
    }

    protected SubproductOut bSubproductOutToSubproductOut(BSubproductOut bSubproductOut) {
        if ( bSubproductOut == null ) {
            return null;
        }

        SubproductOut subproductOut = new SubproductOut();

        subproductOut.setId( bSubproductOut.getId() );

        return subproductOut;
    }

    protected ProductOut bProductOutToProductOut(BProductOut bProductOut) {
        if ( bProductOut == null ) {
            return null;
        }

        ProductOut productOut = new ProductOut();

        productOut.setId( bProductOut.getId() );
        productOut.setSubproductOut( bSubproductOutToSubproductOut( bProductOut.getSubproductOut() ) );

        return productOut;
    }
}
