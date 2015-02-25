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
			PreparedStatement ps = (PreparedStatement) connection.prepareStatement("select userID,applicationID,applicationType,paymentMode,paymentStatus from ApplicationTable ORDER BY paymentMode DESC");
			ResultSet rs = ps.executeQuery();
			while(((ResultSet) rs).next())
			{
			FeedObjects feedObject = new FeedObjects();
			feedObject.setUserID(rs.getInt("userID"));
			feedObject.setApplicationID(rs.getInt("applicationID"));
			feedObject.setApplicationType(rs.getInt("applicationType"));
			feedObject.setPaymentMode(rs.getInt("paymentMode"));
			feedObject.setPaymentStatus(rs.getInt("paymentStatus"));
			feedData.add(feedObject);
			}
			return feedData;
		}catch(Exception e){
			throw e;
		}

	}

}
