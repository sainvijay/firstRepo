package com.first.FirstService;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;


@RegisterRestClient(baseUri="http://localhost:9015/second/get")
public interface Second {

	
	@POST
	@Path("/sts")
	public String stsMethod();
		
}
