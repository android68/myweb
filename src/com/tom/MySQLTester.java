package com.tom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLTester {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = 
					DriverManager.getConnection(
					"jdbc:mysql://j.snpy.org/a105?user=a105&password=a105.33");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}