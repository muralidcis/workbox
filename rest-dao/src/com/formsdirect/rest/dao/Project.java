package com.formsdirect.rest.dao;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.formsdirect.rest.dto.FeedObjects;
import java.sql.Connection;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;

public class Project {

	public ArrayList<FeedObjects> GetFeeds(Connection connection ) throws Exception{
		ArrayList<FeedObjects> feedData = new ArrayList<FeedObjects>();
		try{
			PreparedStatement ps = (PreparedStatement) connection.prepareStatement("SELECT title,description,url FROM website ORDER BY id DESC");
			ResultSet rs = ps.executeQuery();
			while(((ResultSet) rs).next())
			{
			FeedObjects feedObject = new FeedObjects();
			feedObject.setTitle(rs.getString("title"));
			feedObject.setDescription(rs.getString("description"));
			feedObject.setUrl(rs.getString("url"));
			feedData.add(feedObject);
			}
			return feedData;
		}catch(Exception e){
			throw e;
		}

	}

}
