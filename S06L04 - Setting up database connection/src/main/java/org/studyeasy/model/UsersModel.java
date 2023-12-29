package org.studyeasy.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.studyeasy.config.DatabaseConfig;
import org.studyeasy.entity.User;

public class UsersModel {
	public List<User> listuser() {
		List<User> listusers = new ArrayList<User>();
		// Step 1: Connection object init
		Connection connect = DatabaseConfig.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		
		//Step 2: Create the DB query
		String query = "Select * from users";
		try {
			stmt = connect.createStatement();
			
			// Step 3: Execution of statement
	
			rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				listusers.add(new User(rs.getInt("user_id"), rs.getString("username"), rs.getString("email")));
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listusers;
	}

}
