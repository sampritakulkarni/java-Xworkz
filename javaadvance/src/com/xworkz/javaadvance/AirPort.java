package com.xworkz.javaadvance;

import java.sql.*;

public class AirPort {
	
	static String url = "JDBC:mysql://localhost:3306/JDBC";
	static String userName ="root";
	static String password ="Sam@123456";
	static String sqlStatement ="insert into JAVA.AIRPORT values (6,'COCHIN AIRPORT','KOCHI','KERALA',5,'KERALA','YES')";
	
	static String updateQuery = "update JAVA.AIRPORT set AIRPORT_NOOFTERMINALS=5 where AIRPORT_ID=3; ";
	static String deleteQuery = "delete JAVA.AIRPORT where AIRPORT_ID=4; ";
	
	
	
	public static void main(String[] args)  {
		
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, userName, password);	
			System.out.println(connection+url);
			
			Statement statement = connection.createStatement();
			statement.executeUpdate(deleteQuery);
			
			System.out.println("Query is executed");
		}
		catch(SQLException e) {
			System.out.println("query is not executed"+e.getMessage());
		}
		finally {
			try {
				if(connection!=null) {
					connection.close();
					System.out.println("connection is closed");
				}
			}
			catch(SQLException e) {
				
			}
			
		}
		
		
		
		
		
	}

}



