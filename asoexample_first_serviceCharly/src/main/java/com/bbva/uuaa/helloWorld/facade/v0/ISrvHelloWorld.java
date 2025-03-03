package com.bbva.uuaa.helloWorld.facade.v0;

import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponseCreated;
import com.bbva.uuaa.helloWorld.facade.v0.dto.DetailsOut;
import com.bbva.uuaa.helloWorld.facade.v0.dto.DetailsRequest;

public interface ISrvHelloWorld {
	ServiceResponseCreated<DetailsOut> contrato(DetailsRequest detailsRequest, String nuip);
}