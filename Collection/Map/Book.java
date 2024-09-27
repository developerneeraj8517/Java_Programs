package com.HashMap;
import java.util.*;
import java.util.Map.Entry;
public class Book {
	public static void main(String[] args) {
		HashMap<String,Double>hs=new HashMap<>();
		
		hs.put("ABC",145.20);
		hs.put("Wild",451.45);
		hs.put("Pqr",214.20);
		hs.put("XYZ",512.54);
		System.out.println(hs);
		
		Set<Map.Entry<String, Double>> s=hs.entrySet();
		for(Map.Entry<String, Double> it:s) {
			System.out.println("Entry of books:  "+it.getKey()+" "+it.getValue());
		}
		
		for(Map.Entry<String, Double> it:s) {
			it.setValue(123.22);
		}
		System.out.println(s);
	}

}
