package com.Practice;

  class   User {
	int id;
	String name;
	public User(int id, String name){
		this.id=id;
		this.name=name;
	}
	
	public int getId(){
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}

}
public class Employee extends User{
	
	double salary;

	Employee(int id, String name, double salary) {
		super(id, name);
		this.salary=salary;
		// TODO Auto-generated constructor stub
	}

	
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public double calculateAnnualSalary() {
		return salary*12;
	}
	
	public static void main(String[] args) {
		Employee e=new Employee(111,"Rammohan",45000);
		System.out.println(e.getId()+" "+e.getName()+" "+e.calculateAnnualSalary());
		
	}



	
}