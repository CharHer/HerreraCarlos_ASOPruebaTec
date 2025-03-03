package com.bbva.uuaa.helloWorld.business.v0;

import com.bbva.uuaa.helloWorld.business.v0.dto.BDetailsOut;
import com.bbva.uuaa.helloWorld.business.v0.dto.BDetailsRequest;

public interface IBSrvHelloWorld {
    BDetailsOut mapBusiness(BDetailsRequest detailsRequest);
}
