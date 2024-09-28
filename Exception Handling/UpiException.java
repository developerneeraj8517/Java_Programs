package com.exception;
import java.util.*;
public class UpiException extends Exception {
	
	UpiException(String msg){
		super(msg);
	}
	
 
	  static void validUpi(int upi_id) throws UpiException{
		  if(upi_id!=1234) {
			  throw new UpiException("Upi id is not correct");
		  }
		  else {
			  System.out.println("Your Upi id is Valid");
		  }
		  
	  }
	  public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  int a=sc.nextInt();
			 try {
				 validUpi(a);
			 }
			 catch(UpiException e) {
				 System.out.println("Exception ....");
			 }
		}

}
