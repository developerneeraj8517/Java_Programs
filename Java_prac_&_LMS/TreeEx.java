package com.Practice;

import java.util.TreeMap;

public class TreeEx {
	
	public static void main(String[] args) {
		TreeMap<String, Integer> t=new TreeMap<>();
		
		// add key value in treemap
		t.put("One", 1);
		t.put("Two", 2);
		t.put("Three", 3);

		//Display the original tremap
		System.out.println(t);
		
		// Remove the entry associated with the specified key
		Integer removedvalue=t.remove("Two");
		 // Display the removed value
		System.out.println("removed value : "+removedvalue);
		
		//check if entry {"three=3} removed
		boolean isRemove=!t.containsKey("Three");
	
			System.out.println("Is the entry {Three = 3} remove ?" +isRemove);
			
			//Updated treemap entry
			System.out.println("Updated TreeMap "+t);
	
		
	}

}
