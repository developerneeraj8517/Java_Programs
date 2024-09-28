package com.Practice;

import java.util.HashMap;

public class HashMapEx1 {
	public static void main(String[] args) {
		
		HashMap<String, Integer> h1=new HashMap<>();
		
		//adding key value to the map
		h1.put("Neeraj",121);
		h1.put("Lalit", 441);
		h1.put("Naresh", 545);
		h1.put("Sachin", 325);
		h1.put("Anurag", 222);
		
		System.out.println(h1);
		
		//associting the specific key with value
		String key="Abhishek";
		int value=548;
		h1.put(key, value);
		System.out.println(h1);
	}

}
