package com.exception;

public class userDefinedException extends Exception {
	userDefinedException(String msg){
		//call parent class
		super(msg);
	}
	

//public class TestCustomException{
	//method
	static void validAge(int age) throws userDefinedException{
		if(age<18) {
			//throws
			throw new userDefinedException("Person is not valid");
		}
		else {
			System.out.println("You can Vote...");
		}
		
	}
	public static void main(String[] args) {
		 try {
			 validAge(20);
		 }
		 catch(userDefinedException e) {
			 System.out.println("Exception ....");
		 }
	}
	}

//}
