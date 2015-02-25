package com.formsdirect.rest.model;

import java.sql.Connection;
import java.util.ArrayList;

import com.formsdirect.rest.dao.Database;
import com.formsdirect.rest.dao.Project;
import com.formsdirect.rest.dto.FeedObjects;

public class ProjectManager {
	public ArrayList<FeedObjects> GetFeeds()throws Exception {
		ArrayList<FeedObjects> feeds =null;
		try{
			Database database = new Database();
			Connection connection = database.Get_Connection();
			Project project= new Project();
			feeds=project.GetFeeds(connection);

		}catch(Exception e){
			throw e;
		}
		return feeds;

	}
}
