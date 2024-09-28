package com.encapsulation;

public class Student {
	
	// fully encapsulated class  java beans
	
	public String name;
	
	//data hide access modifiers
	private String password;
	protected String msg="try to access protected data within package";
	
	protected void msg1() {
		System.out.println("Access Outside Package with Inheritance");
	}
	
	protected String Email="neeraj@123";
	
	protected void email() {
		System.out.println("Email is neeraj@123");
	}
	
	// setter getname
	//get
	public String getPassword() {
		return password;
	}
//set
	public void setPassword(String password) {
		this.password=password;
	}
	
}
