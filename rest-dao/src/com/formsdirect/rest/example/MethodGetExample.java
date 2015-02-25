package com.formsdirect.rest.example;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/info")
public class MethodGetExample {
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String showInfo(){
		return "hello world!";		
	}

	@GET
	@Path("{username}")	
	@Produces(MediaType.TEXT_HTML)
	public Response getUserInfo(@PathParam("username") String username){
		return Response.status(200).entity(username).build();
	}
	


}
