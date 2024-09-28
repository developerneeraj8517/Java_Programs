package com.tightCoupling;

public class Car {

	
	//petrol
	PetrolEng e;  //ref variable
	
	Car(){
		e=new PetrolEng();
	}
	public void move() {
		System.out.println(" Car move with ");
		e.show();
	}
}
