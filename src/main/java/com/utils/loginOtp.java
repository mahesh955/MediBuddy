package com.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class loginOtp 
{	 
	//To fetch OTP from loginsms table.
	public static String getLoginOTP(String number)  throws Exception
	//public static void main(String[] args) throws Exception
	{
		String url = "jdbc:mysql://docsapp-prod.cw68gbfmumcn.ap-south-1.rds.amazonaws.com";
		String username = "qatesting";
		String password = "ZYQsBehr5p";
		String query = "SELECT SUBSTRING(meta, 55, 4) as OTP FROM node.loginsms WHERE mobile="+ "'" +number+"'" +"ORDER BY createdat DESC LIMIT 1;";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();
		Thread.sleep(10000);	
		ResultSet res = st.executeQuery(query);
		
		res.next();
		String lastOTP = res.getString("otp");
		System.out.println("OTP: " + lastOTP);
		return lastOTP;
		
	} 

}
