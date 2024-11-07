package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.CallableStatement;

import java.sql.CallableStatement;

public class CallableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc=new Scanner(System.in);
			
			//register he driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/preparedDemo", "root","NDhakad@8517");

			 // Prepare the callable statement for the stored procedure
			String query = "{CALL StudentInfo(?, ?, ?)}";
			CallableStatement st= con.prepareCall(query);
			
			  System.out.print("Enter Student ID: ");
              int id = sc.nextInt();

              System.out.print("Enter student name: ");
              String name = sc.next();

              System.out.print("Enter student age: ");
              int age = sc.nextInt();

              // Set parameters
              st.setInt(1, id);
              st.setString(2, name);
              st.setDouble(3, age);

              // Execute the stored procedure
              st.execute();
              System.out.println("Student data inserted successfully.");
		}
		catch(Exception e) {
			e.printStackTrace();
			}

	}

}
