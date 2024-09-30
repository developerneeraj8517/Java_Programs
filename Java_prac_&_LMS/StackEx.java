package com.Practice;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		
		// pushing 10 elements to the stack
		for(int i=10; i<=100;i=i+10) {
			s.push(i);
		}
		System.out.println("Initial Stack is:  "+s);
		
//		removing 4 elements from the stack
		for(int i=0;i<4;i++) {
			int remove=s.pop();
			System.out.println("Removed element is : "+remove);
		}
		//display the remaining element in the stack
		System.out.println("Stack after removing four element: "+s);
		
	}
}
