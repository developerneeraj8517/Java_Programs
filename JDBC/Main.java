package jdbc.retrievequery.com;

import java.sql.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to jdbc");
		
		String url="jdbc:mysql://localhost:3306/jdbcDemo";
		String username="root";
		String password="NDhakad@8517";
		// load the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		// create connection
		try {
			Connection con=DriverManager.getConnection(url, username, password);
			System.out.println("Connection is done");
			//create statement
			Statement statement=con.createStatement();
			// query
			String query="select * from student1";
			
			//result
			ResultSet resultSet=statement.executeQuery(query);
			while(resultSet.next()) {
				int id=resultSet.getInt("sid");
				String name=resultSet.getString("sname");
				int age=resultSet.getInt("Age");
				System.out.println("Student id="+id);
				System.out.println("Student name="+name);
				System.out.println("Student age="+age);
				
			}
      }
		catch(SQLException e) {
	e.printStackTrace();
}
	}
}
