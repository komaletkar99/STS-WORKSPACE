package com.jdc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class firstApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo11", "root", "Komal@123");

		String create = "create table student(id int, name varchar(20))";
		
		Statement stmt = con.createStatement();
		
		stmt.execute(create);
		
		System.out.println("table created sucessfully");
		
		
		
		
	}

}
