package com.looseCoupling;

public class car {
	Engine e;
	
	car(Engine e){
		this.e=e;
	}
	public void move() {
		System.out.println("Car move with ");
		e.show();
		e.CNG();
	}

}
