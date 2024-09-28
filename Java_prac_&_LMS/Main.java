package com.inheritance;

class HillStation{
	public void location() {
		System.out.println("Welcome to the HillStations Enjoy ");
	}
	
	public void famousFor() {
		System.out.println("Every Station is famous for its speciality");
	}
	
}
 class Manali extends HillStation{
	 
	 public void location() {
	 System.out.println("Manali is in Himachal Pradesh");
	 }
	 public void famousFor() {

			 System.out.println("Manali include varietes of trekking, raffting");
	 }
	 
 }
class Mussorie extends HillStation{
	
	 public void location() {
		 System.out.println("Mussorie is in Uttrakhand");
		 }
	 
	 public void famousFor() {
		 System.out.println("Mussorie is famous scenic beauty, climate, and many attractions");
 }
	 
 }
class Gulmarg extends HillStation{
	public void location() {
		 System.out.println("Gullmarg is in Jammu & Kashmir");
		 }
	 public void famousFor() {
		 System.out.println("Gulmarg is the home to the world's highest golf course");
	 }
}


public class Main {
  public static void main(String[] args) {
	  
	  System.out.println("By the Parent Class : ");
	  //parent class
	  HillStation h1=new Manali();
	  h1.location();
	  h1.famousFor();
	  HillStation h2=new Mussorie();
	  h2.location();
	  h2.famousFor();
	  HillStation h3=new Gulmarg();
	  h3.location();
	  h3.famousFor();
	  
	  //subclass
	  System.out.println("By the Subclass : ");

	  Manali m1=new Manali();
	  m1.location();
	  m1.famousFor();
	  Mussorie m2=new Mussorie();
	  m2.location();
	  m2.famousFor();
	  Gulmarg m3=new Gulmarg();
	  m3.location();
	  m3.famousFor();
  }
}
