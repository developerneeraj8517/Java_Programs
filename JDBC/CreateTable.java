package com.createTable;
import java.sql.*;

public class CreateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		System.out.println("Welcome to jdbc");
		
		//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
                 
			// creating connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcDemo", "root","NDhakad@8517");
			
			//writing query
			String query="create table Exam(eid int auto_increment primary key, ename varchar(20) Not Null)";
			
			
			//creating statement
			Statement statement=con.createStatement();
			
			//execute
			statement.executeUpdate(query);
			//result
		
			System.out.println("table is created");
			
				
			}
    
	}
	
	

