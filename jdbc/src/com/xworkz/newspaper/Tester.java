package com.xworkz.newspaper;

import java.sql.*;
public class Tester {
	static String url="JDBC:mysql://localhost:3306/JDBC";
	static String username="root";
	static String password ="Sam@123456";
	static String sqlStatement="insert into JDBC.NEWSPAPER values(3,'Times of India','Hindi',30)";
	
	public static void main(String[] args) throws Exception {
		
		//Driver driver=Class.forName("com.mysql.cj.jdbc.Driver");
		//DriverManager.registerDriver(driver);
		
	Connection connection =DriverManager.getConnection(url, username, password);
	System.out.println(connection+url);
	Statement statement=connection.createStatement();
	statement.executeUpdate(sqlStatement);
	
	
	
	
}
}

