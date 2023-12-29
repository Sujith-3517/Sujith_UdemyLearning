package org.studyeasy.config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// This class can be used to initialize the database connection
public class DatabaseConfig {
	public static Connection getConnection()
	{
		// Initialize all the information regarding
		// Database Connection
		String dbURL = "jdbc:mysql://localhost:3306/studyeasy?useSSL=false";
		// Database name to access
		String dbUsername = "root";
		String dbPassword = "admin";
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(dbURL,dbUsername,dbPassword);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return con;
	}
}
