package com.jdbc;

import java.sql.*;
import java.util.Scanner;


public class JdbcDemo {

	public static void main(String[] args) throws Exception {
		Connection conn = null;

//create connection

		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "system", "12345");

		// create statement
		Statement st = conn.createStatement();

		// create prepared statement
		/*
		 * int id = 107; String name = "shy"; int salary = 788;
		 * 
		 * PreparedStatement
		 * psmt=conn.prepareStatement("insert into employee values(?,?,?)");
		 * 
		 * // Execute query // INSERTING INTO TABLE
		 * 
		 * psmt.setInt(1, id); psmt.setString(2, name); psmt.setInt(3, salary); int r=
		 * psmt.executeUpdate();
		 * 
		 */
		/*
		 * //THE BELOW STATEMENT IS COMPILCATED BECAUSE WE HAVE TO MAINTAIN COMMAS
		 * //INSTEAD OF USING THAT WE CAN USE PREPARED STATEMENT int r=
		 * st.executeUpdate("insert into employee values("+id+",'"+name+"',"+salary+")")
		 * ;
		 */
		// Prepared Statement
//UPDATE RECORDS

		PreparedStatement psmt = conn.prepareStatement("update employee set salary=? where id=?");
		int id, salary;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rollno to update");
		id = sc.nextInt();
		System.out.println("Enter new Marks");
		salary = sc.nextInt();
		psmt.setInt(1, salary);
		psmt.setInt(2, id);

		int r = psmt.executeUpdate();
		if (r > 0) {
			System.out.println("updated succesfuly");
		} else {
			System.out.println("updation failed");
		}

		// DELETE RECORDS
		/*
		 * PreparedStatement
		 * psmt=conn.prepareStatement("delete from employee where id=?"); int roll;
		 * Scanner sc=new Scanner(System.in);
		 * System.out.println("Enter rollno to delete"); roll=sc.nextInt();
		 * 
		 * psmt.setInt(1, roll);
		 * 
		 * int r=psmt.executeUpdate(); if(r>0) {
		 * System.out.println("deleted succesfuly"); } else {
		 * System.out.println("failed"); }
		 */

		ResultSet rs = psmt.executeQuery("select * from employee");
		// Process resultset
		while (rs.next()) {
			System.out.println(rs.getInt(1) + "|" + rs.getString(2) + "|" + rs.getInt(3));

		}
	}

}
