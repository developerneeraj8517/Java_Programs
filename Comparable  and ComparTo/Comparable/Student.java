package com.ComparableAndComparatorDemo;


/*
 * Comparable(single)
 * 1 single sequen sorting
 * 
 * implemetn
 * override compareTo()
 * 
 * calling
 * main
 */

public class Student implements Comparable<Student>{

	
	//data 
	int rollno;
	String name;
	int age;
	
	//constructor
	Student(int rollno, String name, int age){
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
	@Override
	public int compareTo(Student o) {
		if(age==o.age)
		return 0;
		else if(age>o.age){
			return 1;
		}
		return -1;
	}

}
