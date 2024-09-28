package com.string;

public class StringBuilderEx {

	
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		sb.append("Hii");
		sb.append("Neeraj");
		sb.insert(3, "I am");
		sb.delete(3, 7);
		String msg=sb.toString();
		System.out.println(msg);
	}
}
