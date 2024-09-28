package com.inheritance;

abstract class Vaccine{
	int age;
	String nationality;
	
	public Vaccine(int age, String nationality){
		this.age=age;
		this.nationality=nationality;
		}
	
	public boolean firstDose() {
		if(nationality.equals("indian") && age>=18 ) {
			
			System.out.println("You are eligible for First Dose. Now you have to pay Rs 250 ");
			return true;
		}
		else {
			System.out.println("You are not eligible for first dose ");
			return false;
		}
	}
	public void secondDose(boolean firstDose) {
		if(firstDose) {
			System.out.println("You are eligible for Second dose");
		}
		else {
			System.out.println("First you should take first dose ");
		}
	}
	public abstract void boosterDose();
}

  class VaccinationSuccessful extends Vaccine{

	public VaccinationSuccessful(int age, String nationality) {
		super(age, nationality);
	}

	@Override
	public void boosterDose() {
		System.out.println("Successfully taken boosterDose ");
		
	}
	 
 }

public class Vaccination {
	public static void main(String[] args) {
	VaccinationSuccessful v=new VaccinationSuccessful(18, "indian");
	
	boolean firstDoseTaken=v.firstDose();
	
	v.secondDose(firstDoseTaken);
	
	if(firstDoseTaken) {
	v.boosterDose();
	}

}
}
