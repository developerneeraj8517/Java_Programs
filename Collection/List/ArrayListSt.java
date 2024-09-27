package com.ListInterface;
import java.util.*;
public class ArrayListSt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1=new ArrayList<>();
		a1.add("Kolkata");
		a1.add("Mumbai");
		a1.add("Bhopal");
		a1.add("Indore");
		a1.add("Banglore");
		
		for(Object o:a1) {
			System.out.println(o+" ");
		}
		Collections.sort(a1);
		System.out.println(a1);
		System.out.println(a1.isEmpty());

		a1.removeAll(a1);
		System.out.println(a1.isEmpty());

	}

}
