package com.exception;
import java.util.*;
//public class UserDefinedException extends Exception{
//	UserDefinedException(String msg){
//		super(msg);
//	}
//}
public class LeapYearException extends Exception{
	LeapYearException(String msg){
		super(msg);
	}
	
	 static void Leapyear(int year) throws LeapYearException{
		 if((year%4==0 && year%100!=0)||(year%400==0)) {
			 System.out.println(" leap Year");
			 
		 }
		 else {
			 throw new LeapYearException("This is a not leap Year");
			// System.out.println("Not a leap Year");
		 }
	 }
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		try {
			Leapyear(a);
			
		}
		catch(LeapYearException l) {
			System.out.println("Exception Occured......");
		}
	}
}
