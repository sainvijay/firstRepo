package com.first.FirstService;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/get")
@Singleton
public class FirstController {
	
	
	
	@Inject
	@RestClient
	Second secInterface;

	@GET
	public String firstService() {
		return "this is My first Service";
	}
	
	@GET
	@Path("/fst")
	public String Second() {
		secInterface.stsMethod();
	//String ss=	con.get("app.dj").toString();
	//System.out.println("config property is"+ss);	
	return "nothing";
	}
	
	
	
}
