package com.bbva.uuaa.helloWorld.business.v0.impl;

import com.bbva.uuaa.helloWorld.business.v0.IBSrvHelloWorld;
import com.bbva.uuaa.helloWorld.business.v0.dao.ISrvHelloWorldDAO;
import com.bbva.uuaa.helloWorld.business.v0.dto.BDetailsOut;
import com.bbva.uuaa.helloWorld.business.v0.dto.BDetailsRequest;

import org.springframework.stereotype.Service;

@Service
public class BSrvHelloWorld implements IBSrvHelloWorld {

    private final ISrvHelloWorldDAO helloWorldDAO;

    public BSrvHelloWorld(ISrvHelloWorldDAO helloWorldDAO) {
        this.helloWorldDAO = helloWorldDAO;
    }

    @Override
    public BDetailsOut mapBusiness(BDetailsRequest detailsRequest) {

        return helloWorldDAO.mapDAO(detailsRequest);
    }
}

