package com.Practice;

import java.util.TreeMap;

public class TreeMapEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initialize the treemap
		TreeMap <Integer, String> t=new TreeMap<>();
		
		t.put(1,"Anurag");
		t.put(2, "Rohan");
		t.put(5, "Komal");
		t.put(6, null);
		t.put(7, "Neeraj");
		
	     System.out.println(t);  
	     
	     System.out.println(t.get(1)); //get value by key
	     
       	System.out.println(t.containsKey(2));  //to check the key is present
	    // remove a particular key from map   
       	t.remove(5);
	 System.out.println(t);
	 
	 //check if the map is empty
          System.out.println(t.isEmpty());

          // readone by one by key
          for(int i:t.keySet()) {
      		System.out.println("Key set are "+i);
      	}
      	
      	
      	// read by values
      	for(Object j: t.values()) {
      		System.out.println("Values are: "+j);
      	}
      	
      	// convert into set
      	System.out.println("Set view : "+t.entrySet());

	}

}
