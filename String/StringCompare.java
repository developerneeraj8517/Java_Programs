package com.string;

public class StringCompare {
	
	
	public static void main(String[] args) {
		
		String data1="java";
		String data2="java";
		
		String data3=new String("java");
		
		//== ope  --> memory address
		System.out.println(data1==data2);
		System.out.println(data1==data3);
		
		
		//equals method always check the content
		boolean result=data1.equals(data2);
		System.out.println(result);


		
	}

}
