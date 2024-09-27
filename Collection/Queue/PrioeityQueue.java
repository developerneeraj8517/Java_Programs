package com.Queue;

import java.util.PriorityQueue;

public class PrioeityQueue {

	  public static void main(String[] args) {
		  PriorityQueue q=new PriorityQueue();
		  
//		  q.add(1);
//		  q.add(2);
//		  q.add(3);
//		  q.add(8);
//		  q.add(10);
//		  System.out.println(q);
//		 
//		  
//		 // q.remove();
//		//  System.out.println(q);
//		 
//		  //System.out.println(q);
//		
//		//  System.out.println(q.poll());
//		  
////		  q.element();
//		  System.out.println(q.peek());
		  
		  PriorityQueue<String> p=new PriorityQueue<>();
		  p.add("Java");
		  p.add("Php");
		  p.add("C++");
		  p.add("SQL");
		  
		  System.out.println(p);
		  
		  p.remove();
		  System.out.println(p);
		  
		  p.offer("JavaScript");
		  p.poll();
		  System.out.println(p);
		  
		  p.element();
		  System.out.println(p);
		  p.add("ReactJs");
		  System.out.println(p);
		  
		  p.peek();
		  System.out.println(p);
		  
	  }
}
