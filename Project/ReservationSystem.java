package com.Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ReservationSystem {

	
	private static String url="jdbc:mysql://localhost:3306/Hotel";
	private static String username="root";
	private static String password="NDhakad@8517";
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Connection con=DriverManager.getConnection(url,username,password);
			while(true){
				System.out.println();
				Scanner sc=new Scanner(System.in);
				System.out.println("HOTEL MANAGEMENT SYSTEM");
				System.out.println("1  RESERVE A ROOM");
				System.out.println("2  VIEW RESERVATION");
				System.out.println("3  GET ROOM NUMBER");
				System.out.println("4  UPDATE RESERVATION");
				System.out.println("5  DELETE RESERVATION");
				System.out.println("0  EXIST");
				System.out.println("Choose an option :  ");
				int choice = sc.nextInt();
				
				switch(choice) {
				case 1:  reserveRoom(con, sc);
				break;
				case 2:  viewReservation(con);
				break;
				case 3:  getRoomNumber(con, sc);
				break;
				case 4:  updateReservation(con, sc);
				break;
				case 5:  deleteReservation(con, sc);
				break;
					
					default:
						System.out.println("Invalid choice, Try Again");
				}
			}
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
		private static void reserveRoom(Connection con, Scanner sc) {
			System.out.println("Enter Guest name");
			String guestName=sc.next();
			sc.nextLine();
			System.out.println("Enter room no. ");
			int roomNumber=sc.nextInt();
			System.out.println("Enter Contact Number ");
			String Contact=sc.next();
			
			String sql="Insert into reservation (guest_name, room_no, contact_no) "+ "values('"+guestName+"',' "+roomNumber+"', '"+Contact+"')";

              try (Statement st=con.createStatement()){
				int affectedrows=st.executeUpdate(sql);
				
				if(affectedrows>0) {
					System.out.println("Reservation Done");
				}
				else {
					System.out.println("Rsesrvation Failed");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		private static void viewReservation(Connection con) throws SQLException {
			
			String sql="Select reservation_id, guest_name, room_no, contact_no, reservation_date FROM reservation";
			
			try(Statement st=con.createStatement()){
				ResultSet rt=st.executeQuery(sql);
				
				System.out.println("RESERVATION DETAILS ");
				System.out.println("-------------------*----------------------*------------------*----------------*-----------");
				System.out.println("|  Reservation Id  | Guest                |   Room Number    | Contact Number | Date     |");
				System.out.println("-------------------*----------------------*------------------*----------------*-----------");
				
				while(rt.next()) {
					int id=rt.getInt("reservation_id");
					String guestName=rt.getString("guest_name");
					int roomNumber=rt.getInt("room_no");
					String contactNumber=rt.getString("contact_no");
					String reservationDate=rt.getString("reservation_date").toString();
					
					System.out.println(id+" "+guestName+" "+roomNumber+" "+contactNumber+" "+reservationDate);
				}

			}
		}
		
		private static void getRoomNumber(Connection con, Scanner sc) {
			try {
				System.out.println("Enter reservation Id");
				int reservationId=sc.nextInt();
				System.out.println("Enter Guest NAME ");
				String Guestname=sc.next();
				
			String sql=" Select room_no From reservation"+" Where reservation_id =" + reservationId ;
			
			try(Statement st=con.createStatement()){
				ResultSet resultset=st.executeQuery(sql);
				
				if(resultset.next()) {
					int roomNumber=resultset.getInt("room_no");
					System.out.println("Room number for reservation ID "+reservationId +"and Guest name "+Guestname +"is"+roomNumber);

				}
				else {
					System.out.println("Reservation not found");

				}
			}
					}
			catch(SQLException e) {
				e.printStackTrace();
			}
			
			
		}
		
		private static void updateReservation(Connection con, Scanner sc) {
			try {
				System.out.println("Enter reservation id to update : ");
				int reservationId=sc.nextInt();
				sc.nextLine();//consume new line
				
				if(!reservationFound(con,reservationId)) {
					System.out.println("Reservation not found ");
					return;
				}
				
				System.out.println("Enter the guest name:  ");
				String newGuestName=sc.nextLine();
				System.out.println("Enter the room no:  ");
				int newRoomNo=sc.nextInt();
				
				System.out.println("Enter the Contact No. :  ");
				String newContactNo = sc.next();
				
				String sql = "UPDATE reservation SET guest_name = '" + newGuestName + 
			             "', room_no = '" + newRoomNo + 
			             "', contact_no = '" + newContactNo + 
			             "' WHERE reservation_id = " + reservationId; 
				
				try(Statement st=con.createStatement()){
					int affected_row=st.executeUpdate(sql);
					
					if(affected_row>0) {
						System.out.println("Reservation Updated Successfull  ");
					}
					else {
						System.out.println("Reservation Updation Failed");

					}
				}
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		private static void deleteReservation(Connection con, Scanner sc) {
			try {
				System.out.println("Enter id to delete ");
				int reservationId=sc.nextInt();
				
				if(!reservationFound(con, reservationId)) {
					System.out.println("Reservation not found ");
					return;
				}
				String sql="DELETE FROM reservation WHERE reservation_id= "+reservationId;
				
				try (Statement st=con.createStatement()){
					int affected_row=st.executeUpdate(sql);
					
					if(affected_row>0) {
						System.out.println("Deleted Successfully ");
					}else {
						System.out.println("Not Deleted");

					}
				}
			}
			catch(SQLException e){
				e.printStackTrace();
			}
		}
			
			private static boolean reservationFound(Connection con, int reservationId) {
				try {
					String sql="SELECT reservation_id from reservation WHERE reservation_id= "+reservationId;
					
					try(Statement st=con.createStatement()){
						ResultSet rt=st.executeQuery(sql);
						
						return rt.next();
					}
				}
					catch(SQLException e) {
						e.printStackTrace();
						return false;
				}
			}
		
	
}
