package com.ComparatorInterface;

import java.util.ArrayList;
import java.util.Collections;

public class EmpMain {

	public static void main(String[] args) {
		ArrayList<Employee> a1=new ArrayList<>();
		
		a1.add(new Employee(111,"Mohan"));
		a1.add(new Employee(452,"Rohan"));
		a1.add(new Employee(758,"Sonu"));
		
		Collections.sort(a1,new EmpId());
		System.out.println("=====By Empoyee ID ======");
		
		for(Employee o:a1) {
			System.out.println(o.id+"  "+o.name);
		}
		
	Collections.sort(a1,new EmpName());
	System.out.println("=====By Empoyee Name ======");

		for(Employee o:a1) {
			System.out.println(o.id+"  "+o.name);
		}
	}
}
