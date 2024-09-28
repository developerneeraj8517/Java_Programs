package com.string;

public class StringExample {
	public static void main(String[] args) {
		String s="ms";
		s=s.concat("dhoni");
		System.out.println(s);
		String s1=new String("Kohli");
		String s2=s.concat(s1);
		System.out.println(s2);
	}

}
