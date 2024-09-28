package com.Practice;

import java.util.ArrayList;

public class EvenNoSum {
 
	 public static void main(String[] args) {
		 ArrayList<Integer> a1=new ArrayList<>();
		 
		 a1.add(2);
		 a1.add(8);
		 a1.add(5);
		 a1.add(19);
		 a1.add(6);
		 a1.add(20);
		 a1.add(1);
		 a1.add(2);
		 a1.add(4);
		 
		 int sum=0;
		 for(int num:a1) {
			 if(num%2==0) {
				 sum+=num;
			 }
		 }
		 System.out.println(sum);
		 
		
		 
	 }
	
}
