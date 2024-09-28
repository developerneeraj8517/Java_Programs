package com.inheritance;

public class Activa {
	
	String Name_of_comp;
	double price;
	
	//method
	Activa(){
		System.out.println("ACTIVA");
	}
	
	public void bill(String name, double price) {
		System.out.println("My new Vehicle:"+name +price);
	}

}