package com.ComparableAndComparatorDemo;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arrayList
		ArrayList<Student> a1=new ArrayList<>();
		
		
		a1.add(new Student(101,"ABC", 20));
		a1.add(new Student(102,"Xyz",18));
		a1.add(new Student(103,"MNO",21));
		
		//sorting
		Collections.sort(a1);
		
		for(Student obj:a1) {
			System.out.println(obj.rollno+" "+obj.name+" "+obj.age);
		}
		
		
		

	}

}
