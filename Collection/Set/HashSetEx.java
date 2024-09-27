package com.SetInterface;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
//	HashSet h1=new HashSet(100);
//	HashSet h2=new HashSet(100,(float)0.90);
//	HashSet<Integer> h3=new HashSet<Integer>();
//	
//	// add
//	h1.add('A');
//	h1.add(100);
//	h1.add(null);
//	h1.add(100);
//	
//	h1.remove(100);
//	h1.add('M');
//	
//	System.out.println(h1.size());
//     
//	System.out.println(h1);
//	System.out.println(h1.contains('A'));
//	 h1.removeAll(h1);
//     System.out.println(h1);
     
     
     HashSet<Integer> set1=new HashSet<>();
     set1.add(10);
     set1.add(20);
     set1.add(30);
     set1.add(40);
     set1.add(50);
     set1.add(70);
     System.out.println("Set 1= " +set1);
     
     HashSet<Integer> set2=new HashSet<>();
     //set2.add(1);
     set2.add(20);
     set2.add(70);
     set2.add(40);
   //  set2.add(60);
     System.out.println("Set 2 = " +set2);

//      set1.addAll(set2);
//    System.out.println("Union of set" +set1);
      
     // set1.retainAll(set2);
     // System.out.println("Intersection of two set" +set1);
     
     //uncommon 
      //set1.removeAll(set2);
     // System.out.println("After removing elements : "+set1);
      //subset
      System.out.println(set1.containsAll(set2));
	}
}
