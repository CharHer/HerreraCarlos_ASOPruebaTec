package com.bbva.uuaa.helloWorld.facade.v0.impl;

import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponseCreated;
import com.bbva.jee.arq.spring.core.servicing.annotations.SMC;
import com.bbva.jee.arq.spring.core.servicing.annotations.SN;
import com.bbva.jee.arq.spring.core.servicing.annotations.VN;
import com.bbva.uuaa.helloWorld.business.v0.IBSrvHelloWorld;
import com.bbva.uuaa.helloWorld.business.v0.dto.BDetailsOut;
import com.bbva.uuaa.helloWorld.business.v0.dto.BDetailsRequest;
import com.bbva.uuaa.helloWorld.facade.v0.ISrvHelloWorld;
import com.bbva.uuaa.helloWorld.facade.v0.dto.DetailsOut;
import com.bbva.uuaa.helloWorld.facade.v0.dto.DetailsRequest;
import com.bbva.uuaa.helloWorld.facade.v0.mapper.ISrvHelloWorldMapper;

import org.springframework.stereotype.Service;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Service
@SN(registryID = "SNGG20240069", logicalID = "helloWorld")
@VN(vnn = "v0")
@Path("/v0")
public class SrvHelloWorld implements ISrvHelloWorld {

	private final IBSrvHelloWorld bSrvHelloWorld;
	private final ISrvHelloWorldMapper mapper;

	public SrvHelloWorld(IBSrvHelloWorld bSrvHelloWorld, ISrvHelloWorldMapper mapper) {
		this.bSrvHelloWorld = bSrvHelloWorld;
		this.mapper = mapper;
	}

	@Override
	@POST
	@Path("/simulations")
	@Produces({MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_JSON})
	@SMC(registryID = "SMGG20240679", logicalID = "/simulations")
	public ServiceResponseCreated<DetailsOut> contrato(@Valid DetailsRequest detailsRequest, @QueryParam("nuip") String nuip) {

		BDetailsRequest bDetailsRequest = mapper.detailsRequestToBDetailsRequest(detailsRequest);

		BDetailsOut bDetailsOut = bSrvHelloWorld.mapBusiness(bDetailsRequest);

		DetailsOut detailsOut = mapper.bDetailsOutToDetailsOut(bDetailsOut);

		detailsOut.setNuip(nuip);
		detailsOut.setId(generateRandomId(10));

		return ServiceResponseCreated.data(detailsOut).build();

	}

	private String generateRandomId(int length) {
		String chars = "0123456789";
		StringBuilder id = new StringBuilder();
		for (int i = 0; i < length; i++) {
			id.append(chars.charAt((int) (Math.random() * chars.length())));
		}
		return id.toString();
	}

}