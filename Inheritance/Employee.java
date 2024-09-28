package com.inheritance;


public class Employee extends People {
	double salary;
	public void info(double salary) {
		System.out.println("Employee  is "+super.name +super.city +salary);
	}

}
