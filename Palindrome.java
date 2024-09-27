package com.Practice;
import java.util.*;
public class Palindrome {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String Str=sc.nextLine();
	
	Str=Str.toLowerCase();
	System.out.println(Str);
	
//	String reversed=new StringBuilder(Str).reverse().toString();
//	if(Str.equals(reversed)) {
//		System.out.println("Given String is a Palindrome");
//	}
//	else {
//		System.out.println("Not a Palindrome");
//	}
	boolean isPalindrome=true;
	for(int i=0; i<Str.length()/2;i++) {
		if(Str.charAt(i)!=Str.charAt(Str.length()-i-1)) {
			isPalindrome=false;
			break;
		}
	}
	  if(isPalindrome) {
		  System.out.println("Palindrome");
	  }
	  else {
		  System.out.println("Not a Palindrome");
	  }
}
	
}
