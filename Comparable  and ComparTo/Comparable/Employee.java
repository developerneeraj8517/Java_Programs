package com.ComparableAndComparatorDemo;

public class Employee implements Comparable<Employee>{

	
	int id;
	String name;
	double salary;
	
	Employee(int id, String name, double salary)
	{
		this.id=id;
	this.name=name;
	this.salary=salary;
	}
	
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(salary==o.salary)
		return 0;
		else if(salary>o.salary) {
			return 1;
		}
		else {
			return -1;
		}
	}

}
