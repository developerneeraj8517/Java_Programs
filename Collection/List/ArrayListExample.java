package com.ListInterface;

import java.util.*;

public class ArrayListExample {
	public static void main(String[] args) {
	//declare
	ArrayList a1=new ArrayList();  
	//add
	a1.add(100);
	a1.add('A');
	a1.add(true);
	a1.add(12.02);
	a1.add("hii");
	a1.add(null);
	System.out.println(a1);
	System.out.println(a1.size());
	a1.remove(0);
	System.out.println(a1);
			
	}
	 
}
