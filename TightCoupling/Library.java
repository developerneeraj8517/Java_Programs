package com.tightCoupling;

public class Library {
	Books b;
	
	Library(){
		b= new Books();
	}
	public void action() {
		System.out.println("Your action is ");
		b.read();
	}

}
