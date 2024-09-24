package com.Practice;
import java.util.*;

public class UniqueChar {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   String St=sc.nextLine();
	   
	   for(int i=0; i<St.length();i++) {
		   int count=0;
		 // char temp=St.charAt(i);
		   for(int j=0; j<St.length(); j++) {
			   if(St.charAt(i)==St.charAt(j)) {
				   count++;
			   }
		   }
	   
		   
		   if(count==1) {
			   System.out.print(St.charAt(i));
		   }
	   }
	   }
   }
