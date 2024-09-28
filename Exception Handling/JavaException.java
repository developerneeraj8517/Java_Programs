package com.exception;

public class JavaException {
	
	public static void main(String[] args){
//		try {
//			int a=100/0;
//	}
//	catch(ArithmeticException e) {
//		System.out.println(e);
//	};
//		System.out.println("rest of code....");
		
		try {
			int a=100/0;
			System.out.println(a);
	}
	catch(ArithmeticException e) {
		System.out.println(e);
	}
//		System.out.println("rest of code....");
		
  finally {
			System.out.println("all SQL connection is closed...");
			System.out.println("Finally block is executed..");
		}
	}

}
