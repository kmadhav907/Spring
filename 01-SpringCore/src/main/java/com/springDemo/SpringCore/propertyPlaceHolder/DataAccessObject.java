package com.springDemo.SpringCore.propertyPlaceHolder;

public class DataAccessObject {
	private String dbUser;
	private String dbUrl;
	private String dbPassword;
	@Override
	public String toString() {
		return "DataAccessObject [dbUser=" + dbUser + ", dbUrl=" + dbUrl + ", dbPassword=" + dbPassword + "]";
	}
	public DataAccessObject(String dbUser, String dbUrl, String dbPassword) {
		super();
		this.dbUser = dbUser;
		this.dbUrl = dbUrl;
		this.dbPassword = dbPassword;
	}
	
}
