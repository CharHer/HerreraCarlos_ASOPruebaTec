package com.bbva.uuaa.helloWorld.business.v0.dao;

import com.bbva.uuaa.helloWorld.business.v0.dto.BDetailsOut;
import com.bbva.uuaa.helloWorld.business.v0.dto.BDetailsRequest;

public interface ISrvHelloWorldDAO {
    BDetailsOut mapDAO(BDetailsRequest detailsRequest);
}
