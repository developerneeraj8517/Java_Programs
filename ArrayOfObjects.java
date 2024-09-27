package com.arrayofObjects;

class Student{
	int rollno;
	String name;
	String grade;
	
	//constructor
	/*Student(int rollno, String name, String grade ){
		this.rollno=rollno;
		this.name=name;
		this.grade=grade;
	}*/
	
	public void setData(int rollno, String name, String grade) {
		this.rollno=rollno;
		this.name=name;
		this.grade=grade;
	}
	
	public void dispaly() {
		System.out.println("Studetn data : " +rollno+" "+ name+" "+grade);
	}
}

public class ArrayOfObjects {
	public static void main(String[] args) {
		// declare array of students
		Student [] arr;
		//size
		arr=new Student[3];
//		arr[0]=new Student(101, "Neeraj", "B");
//		arr[1]=new Student(102, "Rohan", "A");
//		arr[2]=new Student(103, "Pooja", "A");
		
		arr[0].setData(101, "abc", "A");
		arr[1].setData(101, "abc", "A");
		arr[2].setData(101, "abc", "A");
		System.out.println(" First Student data : ");
		arr[0].dispaly();
		System.out.println(" Second Student data : ");
		arr[1].dispaly();
		System.out.println(" ThirdStudent data : ");
		arr[2].dispaly();
		
	}

}
