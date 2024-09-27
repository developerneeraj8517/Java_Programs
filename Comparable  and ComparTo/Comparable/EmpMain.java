package com.ComparableAndComparatorDemo;

import java.util.ArrayList;
import java.util.Collections;

public class EmpMain {
	public static void main(String[] args) {
	ArrayList<Employee> e1=new ArrayList<>();
	
	
	e1.add(new Employee(111,"Mohan", 2225.50));
	e1.add(new Employee(122,"Ashish",1800.54));
	e1.add(new Employee(133,"Ramu",2154.32));
	
	//sorting
	Collections.sort(e1);
	
	for(Employee obj:e1) {
		System.out.println(obj.id+" "+obj.name+" "+obj.salary);
	}
	
	}
	
}
