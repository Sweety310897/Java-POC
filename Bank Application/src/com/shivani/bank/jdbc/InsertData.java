package com.shivani.bank.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/shivanidb","root","");
		Statement stmt = con.createStatement();
		
		String s1 = "insert into emp11 values(101,'ram','Siddipet')";
		stmt.executeUpdate(s1);
		con.close();
		System.out.print("inserted successfully");

	}
}
