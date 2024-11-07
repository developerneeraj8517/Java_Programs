package com.example;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedDemo {
	public static void main(String[] args) {
	
	try {
		Scanner sc=new Scanner(System.in);
		
		
		Class.forName("com.mysql.cj.jdbc.Driver"); // register type4 driver
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1", "root","NDhakad@8517");
		
		String q1="Insert into employee (eid,3"
				+ " ename, eage) values(?,?,?)";
//		PreparedStatement pst=con.prepareStatement(q1);
//
//		
//		for(int i=0; i<3; i++){
//			System.out.println("Enter employee id, name, age");
//			int id=sc.nextInt();
//			String name=sc.next();
//			int age=sc.nextInt();
//			
//			pst.setInt(1, id);
//			pst.setString(2, name);
//			pst.setInt(3, age);
//			pst.execute();
//		}
		
PreparedStatement pst[]=new PreparedStatement[3];

		
		for(int i=0; i<3; i++){
			
			pst[i]=con.prepareStatement(q1);
			System.out.println("Enter employee id, name, age");
			int id=sc.nextInt();
			String name=sc.next();
			int age=sc.nextInt();
			
			pst[i].setInt(1, id);
			pst[i].setString(2, name);
			pst[i].setInt(3, age);
			pst[i].execute();
		}
		

	
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	}

}
