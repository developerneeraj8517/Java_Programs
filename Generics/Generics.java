package com.genericDemo;

public class Generics {
	public static<E> void printArray(E[] elements) {
		for(E e:elements) {
			System.out.println(e);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Integer[] intArray= {10,20,30,40};
		Character[] charArray= {'a','s','f','h'};
		System.out.println("Print int array:  ");
		printArray(intArray);
		
		System.out.println("Print char array:  ");
		printArray(charArray);

	}
	
}
