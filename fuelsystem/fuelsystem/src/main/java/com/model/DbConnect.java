package com.model;
import java.sql.*;

public class DbConnect {
	
	private static String url ="jdbc:mysql://localhost:3306/fuelsystem";
	private static String user = "root";
	private static String pass="S@ndaru1998";
	private static Connection con;
	
	public static Connection getConnection() {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,user,pass);
			
		}catch(Exception e) {
			System.out.println("Database conection faild!!");
		}
		
		return con;
	}

}
