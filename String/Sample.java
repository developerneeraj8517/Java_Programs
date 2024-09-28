package com.string;

public class Sample {
		
		public static void main(String[] args) {
			String s1="Welcome";
			System.out.println(s1.charAt(1));
			System.out.println(s1.toLowerCase());
			System.out.println(s1.toUpperCase());
			System.out.println(s1.replace('e','E'));
			
		System.out.println(s1.length());
		
		
		String st="SATIVIDISHA";
		String t=st.substring(2,4);
		System.out.println(t);
		
		boolean b=st.contains("SATI");
		System.out.println(b);

		String date=String.join("/", "13","09","2024");
		System.out.println(date);

		String a="This is Training";
		int I=a.indexOf("is");
		System.out.println(I);
		
		System.out.println(a.split(" "));

	}
}
