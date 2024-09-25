package com.looseCoupling;

public class LooseCouplingMain {
	
	public static void main(String[] args) {
		car c=new car(new PetrolEngine());
		c.move();
		
	}

}
