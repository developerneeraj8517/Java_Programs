package com.arrayofObjects;

 class Employee
{
	String name; String address; double salary;
	
	Employee(String name, String address, double salary){
		this.name=name;
		this.address=address;
		this.salary=salary;
	}
	
	public void setData(String name, String address, double salary) {
		this.name=name;
		this.address=address;
		this.salary=salary;
	}
	
	public void display() {
		System.out.println("Employee data is "+name+" "+address+" "+salary);
	}
}
public class EmployeeArrayOfObjects {
	
	public static void main(String[] args) {
		Employee [] arr;
		arr=new Employee[3];
		arr[0]=new Employee("abc", "Kolkata", 2012.15);
		arr[1]=new Employee("ahd", "Mumbai", 70125.15);
		arr[2]=new Employee("jgg", "Pune", 20012.15);
		
		System.out.println("1 Employee data: ");
		arr[0].display();
		System.out.println("2 Employee data: ");
		arr[1].display();
		System.out.println("3 Employee data: ");
		arr[2].display();
		
	}

}
