package com.formsdirect.rest.service;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.formsdirect.rest.dto.FeedObjects;
import com.formsdirect.rest.model.ProjectManager;
import com.google.gson.Gson;

@Path("/service")
public class FeedService {
	@GET
	@Path("/GetFeeds")
	//@Produces("application/JSON")
	@Produces(MediaType.TEXT_HTML)
	public String feed(){
		String feeds=null;
		try{
			ArrayList<FeedObjects> feedData =null;
			ProjectManager projectmanager = new ProjectManager();
			feedData = projectmanager.GetFeeds();
			Gson gson = new Gson();
			System.out.println(gson.toJson(feedData));
			feeds = gson.toJson(feedData);
		}catch(Exception e){
			System.out.println("Exception Error"); //Console
		}
		return feeds;
	}



}
