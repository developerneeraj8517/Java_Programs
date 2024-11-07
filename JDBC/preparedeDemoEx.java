package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class preparedeDemoEx {
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			
			Class.forName("com.mysql.cj.jdbc.Driver");  // register the driver
			
			// Connection creation
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/preparedDemo", "root","NDhakad@8517");
			String q1="Insert into StudentData (sid, sname, age) values(?,?,?)";
			PreparedStatement pst=con.prepareStatement(q1);
			
			for(int i=0; i<3; i++){
				System.out.println("Enter student id, student name, student age");
				int id=sc.nextInt();
				String name=sc.next();
				int age=sc.nextInt();
				
				pst.setInt(1, id);
				pst.setString(2,name);
				pst.setInt(3, age);
				pst.execute();
			}
		}
		catch(Exception e) {
			e.printStackTrace();			
		}
	}
}
