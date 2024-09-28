package com.Practice;

import java.util.HashSet;

public class HashSetEx {
	public static void main(String[] args) {
		
		HashSet h1=new HashSet();
		
		h1.add(45);
		h1.add("Neeraj");
		h1.add(12);
		h1.add("Hello");
		System.out.println(h1);
		h1.add(1);
		
		String element="Hii";
		h1.add(element);
		System.out.println(h1);
	}

}
