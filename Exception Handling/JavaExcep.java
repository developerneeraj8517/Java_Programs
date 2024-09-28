package com.exception;

public class JavaExcep {
	//method to check the age
//	public void validate(int age) {
//		if(age<18)
//			throw 
//	}
	public static void main(String[] args) {
		int a=5; int b=0;
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException e) {
		e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			}
	}

}
