package com.Practice;

import java.util.HashMap;
import java.util.Scanner;

public class Cricketer {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> hs=new HashMap<>();
		
		// map to store Cricketer name
		hs.put("Dhoni", 478);
		hs.put("Rohit", 328);
		hs.put("Virat", 518);
		hs.put("Shubham", 228);
		hs.put("Hardik", 300);
		
		System.out.println(hs);
		
		// taking input name of cricketer
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		
		// search for a cricketer and display the score
		if(hs.containsKey(name)) {
			System.out.println("Score of "+name+" "+hs.get(name));
		}else {
			System.out.println("Cricketer name is not found in the record");
		}
		

		
	}

}
