package com.bbva.uuaa.helloWorld.facade.v0.mapper;

import com.bbva.uuaa.helloWorld.business.v0.dto.BDetailsOut;
import com.bbva.uuaa.helloWorld.business.v0.dto.BDetailsRequest;
import com.bbva.uuaa.helloWorld.facade.v0.dto.DetailsOut;
import com.bbva.uuaa.helloWorld.facade.v0.dto.DetailsRequest;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface ISrvHelloWorldMapper {

    BDetailsRequest detailsRequestToBDetailsRequest(DetailsRequest detailsRequest);

    DetailsOut bDetailsOutToDetailsOut(BDetailsOut bDetailsOut);
}

