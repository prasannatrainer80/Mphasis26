package com.java.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("training")
public class Training {

	@GET
	@Path("location")
	@Produces(MediaType.TEXT_PLAIN)
	public String location() {
		return "Chennai DLF";
	}
	
	@GET
	@Path("topic")
	@Produces(MediaType.TEXT_PLAIN)
	public String topic() {
		return "Java FSD Advanced...Rest Services...";
	}
}
