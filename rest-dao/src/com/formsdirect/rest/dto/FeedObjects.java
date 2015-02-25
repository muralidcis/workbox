package com.formsdirect.rest.dto;
//
// The feeder where the  data transaction object happens using the following getter and setter methods
//
public class FeedObjects {


	private int userID;
	private int  applicationID;
	private int applicationType;
	private int paymentMode;
	private int paymentStatus;

	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public int getApplicationID() {
		return applicationID;
	}
	public void setApplicationID(int applicationID) {
		this.applicationID = applicationID;
	}
	public int getApplicationType() {
		return applicationType;
	}
	public void setApplicationType(int applicationType) {
		this.applicationType = applicationType;
	}
	public int getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(int paymentMode) {
		this.paymentMode = paymentMode;
	}
	public int getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(int paymentStatus) {
		this.paymentStatus = paymentStatus;
	}


}