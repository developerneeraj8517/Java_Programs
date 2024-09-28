package com.Practice;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		
		s.push(10);
		s.push(15);
		s.push(20);
		s.push(25);
		s.push(30);
		s.push(35);
		s.push(40);
		s.push(45);
		s.push(50);
		s.push(55);
		
		System.out.println(s);
		
		s.remove(s.peek());
		s.remove(s.peek());
		s.remove(s.peek());
		s.remove(s.peek());
		System.out.println(s);
	}
}
