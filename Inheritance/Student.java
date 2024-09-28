package com.inheritance;

public class Student extends Employee {
	int id;
	public void info2(int id) {
		System.out.println("Name of Student "+super.name +super.city +id);
	}

}
