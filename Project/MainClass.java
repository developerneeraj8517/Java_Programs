package com.demo;


import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
public class MainClass {

	  private static final SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

	    public static void main(String[] args) {
	        while (true) {
	            System.out.println();
	            Scanner sc = new Scanner(System.in);
	            System.out.println("HOTEL MANAGEMENT SYSTEM");
	            System.out.println("1  RESERVE A ROOM");
	            System.out.println("2  VIEW RESERVATION");
	           // System.out.println("3  GET ROOM NUMBER");
	            System.out.println("3  UPDATE RESERVATION");
	            System.out.println("4 DELETE RESERVATION");
	            System.out.println("0  EXIT");
	            System.out.println("Choose an option:  ");
	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    reserveRoom(sc);
	                    break;
	                case 2:
	                    viewReservation();
	                    break;
//	                case 3:
//	                    getRoomNumber(sc);
//	                    break;
	                case 3:
	                    updateReservation(sc);
	                    break;
	                case 4:
	                    deleteReservation(sc);
	                    break;
	                case 0:
	                    System.exit(0);
	                    break;
	                default:
	                    System.out.println("Invalid choice, Try Again");
	            }
	        }
	    }
	    private static void reserveRoom(Scanner sc) {
	        System.out.println("Enter Guest name:");
	        String guestName = sc.next();
	        System.out.println("Enter room no.: ");
	        int roomNumber = sc.nextInt();
	        System.out.println("Enter Contact Number: ");
	        String contact = sc.next();

	        Reservation reservation = new Reservation();
	        reservation.setGuestName(guestName);
	        reservation.setRoomNo(roomNumber);
	        reservation.setContactNo(contact);

	        try (Session s = sessionFactory.openSession()) {
	            Transaction t = s.beginTransaction();
	            s.save(reservation);
	            t.commit();
	            s.close();
	            System.out.println("Reservation Done.");
	        }
	    }
	    
	    private static void viewReservation() {
	        try (Session s = sessionFactory.openSession()) {
	            String hql = "FROM Reservation";
	            Query query = s.createQuery(hql);
	            List<Reservation> reservations = query.list();

	            System.out.println("RESERVATION DETAILS ");
	            System.out.println("-------------------*----------------------*------------------*----------------*-----------");
	            System.out.println("|  Reservation Id  | Guest                |   Room Number    | Contact Number | Date     |");
	            System.out.println("-------------------*----------------------*------------------*----------------*-----------");

	            for (Reservation res : reservations) {
	            	System.out.println();
	                System.out.print("      "+res.getReservationId());
	                System.out.print("      "+res.getGuestName());
	                System.out.print("      "+ res.getRoomNo());
	                System.out.print("      "+ res.getContactNo());
	                System.out.print("      "+ res.getReservationDate());
	           
	            }
	        }
	    }

	     
	    
	    private static void updateReservation(Scanner sc) {
	        System.out.println("Enter reservation id to update: ");
	        int reservationId = sc.nextInt();
	        sc.nextLine(); // consume newline

	        System.out.println("Enter the guest name:  ");
	        String newGuestName = sc.nextLine();
	        System.out.println("Enter the room no:  ");
	        int newRoomNo = sc.nextInt();
	        System.out.println("Enter the Contact No.:  ");
	        String newContactNo = sc.next();

	        try (Session s = sessionFactory.openSession()) {
	            Transaction t = s.beginTransaction();
	            String hql = "UPDATE Reservation SET guestName = :guestName, roomNo = :roomNo, contactNo = :contactNo WHERE reservationId = :reservationId";
	            Query query = s.createQuery(hql);
	            query.setParameter("guestName", newGuestName);
	            query.setParameter("roomNo", newRoomNo);
	            query.setParameter("contactNo", newContactNo);
	            query.setParameter("reservationId", reservationId);

	            int affectedRows = query.executeUpdate();
	            t.commit();
                 s.close();
	            if (affectedRows > 0) {
	                System.out.println("Reservation Updated Successfully.");
	            } else {
	                System.out.println("Reservation Update Failed.");
	            }
	        }
	    }
	    
	    private static void deleteReservation(Scanner sc) {
	        System.out.println("Enter reservation id to delete: ");
	        int reservationId = sc.nextInt();

	        try (Session s = sessionFactory.openSession()) {
	            Transaction t = s.beginTransaction();
	            String hql = "Delete From Reservation WHERE reservationId = :reservationId";
	            Query query = s.createQuery(hql);

	            query.setParameter("reservationId", reservationId);
	            int affectedRows = query.executeUpdate();
	            t.commit();
	            s.close();

	            if (affectedRows > 0) {
	                System.out.println("Deleted Successfully.");
	            } else {
	                System.out.println("Reservation not found.");
	            }
	        }
	        catch(Exception e) {
	        	e.printStackTrace();
	        }
	    }
	
}
