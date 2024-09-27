package com.HashMap;

import java.util.*;
import java.util.Iterator;
import java.util.List;

public class IteratorEx {
	
	public static void main(String[] args) {
//		List<String>list=new ArrayList<String>();
//		
//		list.add("java");
//		list.add("python");
//		list.add("php");
//		
//		//iterator interface
//	    Iterator<String> itr = list.iterator();
//		
//		while(itr.hashNext()) {
//			String element=itr.next();
//			System.out.println(element);
//		}
		
		 ArrayList<Integer> numbers = new ArrayList<Integer>();
		    numbers.add(12);
		    numbers.add(8);
		    numbers.add(2);
		    numbers.add(23);
		    Iterator<Integer> it = numbers.iterator();
		    while(it.hasNext()) {
		      Integer i = it.next();
		      if(i < 10) {
		        it.remove();
		      }
		    }
		    System.out.println(numbers);
	}

}
