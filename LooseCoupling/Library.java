package com.looseCoupling;

public class Library {

    Library1 l;
	
	Library(Library1 l){
		this.l=l;
	}
	
	public void action() {
		System.out.println("Your Action is ");
		l.read();
	}

}
