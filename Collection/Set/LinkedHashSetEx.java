package com.SetInterface;

import java.util.Collections;
import java.util.LinkedHashSet;

public class LinkedHashSetEx {
       public static void main(String[] args) {
//    	   LinkedHashSet l1=new LinkedHashSet();
//    	   
//    	   l1.add(10);
//    	   l1.add(20.50);
//    	   l1.add(null);
//    	   l1.add(10);
//    	   l1.add("Neeraj");
//    	   l1.add("Neeraj");
//    	   
//    	   System.out.println(l1);
//    	   l1.removeLast();
//    	   System.out.println(l1);
    	   
    	   
    	   LinkedHashSet<Integer> l1=new LinkedHashSet<>();
    	   l1.add(10);
    	   l1.add(20);
    	   l1.add(30);
    	   l1.add(40);
//    	   Collections.sort(l1);
    	   System.out.println("1 set:  "+l1);
    	   
    	   LinkedHashSet<Integer> l2=new LinkedHashSet<>();
    	   l2.add(10);
    	   l2.add(25);
    	   l2.add(40);
    	   l2.add(80);
    	   System.out.println("2 set:  "+l2);
    	   
    	   l1.addAll(l2);
    	   System.out.println(l1);
    	   
    	   l1.retainAll(l2);
    	   System.out.println(l1);
    	   
//    	   l1.removeAll(l2);
//    	   System.out.println(l1);
    	   
    	  System.out.println( l1.containsAll(l2));
       }
}
