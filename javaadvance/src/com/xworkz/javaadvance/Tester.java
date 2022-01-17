package com.xworkz.javaadvance;

import java.sql.*;

public class Tester {
	
	static String url = "JDBC:mysql://localhost:3306/JDBC";
	static String userName ="root";
	static String password ="Sam@123456";
	static String sqlStatement ="insert into JAVAADVANCE.COMPANY values('wipro','UP','YES',567000,567400,'B',85)";
	
	static String updateQuery = "update JAVAADVANCE.COMPANY set Company_Name='IBM' where COMAPANY_LOCATION='Mysore' ";
	static String deleteQuery = "delete JAVAADVANCE.COMPANY set Company_Name='wipro' where COMAPANY_LOCATION='UP' ";
	
	
	
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
