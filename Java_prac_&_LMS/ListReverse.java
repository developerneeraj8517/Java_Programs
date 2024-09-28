package com.Practice;

import java.util.*;

public class ListReverse {
	
	public static void main(String [] args) {
	ArrayList<String> a1=new ArrayList<>();
	a1.add("Learning");
	a1.add("Advance");
	a1.add("Java");
	a1.add("Programming");
	
//	for(Object o:a1) {
//		System.out.print(o+" ");
//	}
	System.out.println(a1);
	 Collections.reverse(a1);
	 System.out.println();
	 System.out.println(a1);
	
	
	}

}
