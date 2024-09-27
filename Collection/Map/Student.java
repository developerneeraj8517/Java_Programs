package com.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Student {
	public static void main(String[] args) {
	HashMap<Integer, String>hs=new HashMap();
	
	hs.put(1,"Anurag");
	hs.put(2, "Rohan");
	hs.put(5, "Komal");
    // hs.put(null, "Neeraj");
     //hs.put(null,"Pankaj");
	hs.put(10, null);
	
System.out.println(hs);
//	System.out.println(hs.get(1));
//	System.out.println(hs.containsKey(2));
//hs.remove(5);
//System.out.println(hs);
//	System.out.println(hs.isEmpty());
//	System.out.println(hs.get(null));
	
	//entry set----- set view return
	System.out.println(hs.entrySet());
	  
	//keySet() method
	// read 1 by 1 keyset
	for(int i:hs.keySet()) {
		System.out.println("Key set are "+i);
	}
	
	
	//values
	for(Object string: hs.values()) {
		System.out.println("Values: "+string);
	}
	//convert map to set
	
	Set<Map.Entry<Integer, String>>s=hs.entrySet();
	// for reading the single entry
	for(Map.Entry<Integer,String> it:s) {
		System.out.println("Single Entry reading: "+it.getKey()+" "+it.getValue());
	}
	
//	s.iterator();
//	while(it.hashNext()) {
//		
//	}
	}

}
