package com.createTable;
import java.sql.*;

public class InsertIntoTable {
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
		
			// insert
//			//query
			String query = "Insert Into Employee (ename,location,salary) Values \r\n" +"('Ram','Pune',4562.00)";
			
			//execute the query
			int row=statement.executeUpdate(query);
//			
//			System.out.println(row+"row inserted successfully");
			
			
			//update
			
//			String query2="update Employee set ename='Mahesh' where eid=2";
//			int rowUpdated=statement.executeUpdate(query2);
//			
//			
//			// delete
			String query3="Delete from Employee where ename='Ram'";
			int rowDeleted=statement.executeUpdate(query3);
			
			String query1="Select * from Employee";
			
			ResultSet resultSet=statement.executeQuery(query1);
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
