package com.Practice;

import java.util.HashMap;

public class HashMapEmptyCheck {
	
	public static void main(String [] args) {
		HashMap<String,Integer>h1=new HashMap<>();
		
		//intial the map is empty
		if(h1.isEmpty()) {
			System.out.println("The map is empty");
		}
		else {
			System.out.println("Not empty");
		}
		
		// add key values to the map
		h1.put("Neeraj",121);
		h1.put("Lalit", 441);
		h1.put("Naresh", 545);
		h1.put("Sachin", 325);
		h1.put("Anurag", 222);
		
		//condition to check the map is empty
		if(h1.isEmpty()) {
			System.out.println("The map is empty");
		}
		else {
			System.out.println("Not empty");
		}
		
	}

}
