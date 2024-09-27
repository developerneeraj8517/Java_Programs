package com.ListInterface;
import java.util.*;
public class ArrayListEx1 {

	public static void main(String[] args) {
	ArrayList<Integer> a1=new ArrayList<>();
	a1.add(1);
	a1.add(8);
	a1.add(7);
	a1.add(100);
	System.out.println(a1);
	
	System.out.println(a1.size());
	//retrival
	System.out.println(a1.get(2));
	//replace
	a1.set(0, 9);
	System.out.println(a1);
	
	//contain
	System.out.println(a1.contains(7));
             System.out.println("Size of Array "+a1.size());
             a1.ensureCapacity(15);
             System.out.println("Size of Array "+a1.size());

	//
	for(Object o:a1) {
		System.out.println("Elements in a list "+o);
	}
//	addAll
//	ArrayList a1_duplicate=new ArrayList();
//	a1_duplicate.addAll(a1);
//	System.out.println(a1_duplicate);
//	a1_duplicate.removeAll(a1);
//	System.out.println(a1_duplicate);
	
	// sort collection
	
	Collections.sort(a1);
	System.out.println(a1);
	}
	
}
