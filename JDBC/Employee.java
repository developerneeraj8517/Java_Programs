package com.createTable;
import java.sql.*;

public class Employee {
	
	public static void main(String[] args) {
		System.out.println("WELCOME");
		String url="jdbc:mysql://localhost:3306/jdbcDemo";
		String name="root";
		String password="NDhakad@8517";
		
		//load driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
//		create connection
		try {
			
			Connection con=DriverManager.getConnection(url, name, password);
			System.out.println("Connection is done");
			
			//create statement
			Statement statement = con.createStatement();
			
			//query
			String query = "Select * from Employee";
			
			ResultSet resultSet=statement.executeQuery(query);
			while(resultSet.next()) {
				int id=resultSet.getInt("eid");
				String name1=resultSet.getString("ename");
				String location=resultSet.getString("location");
				double salary=resultSet.getDouble("salary");
				
				System.out.println(+id+" "+name1+" "+location+" "+salary);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
