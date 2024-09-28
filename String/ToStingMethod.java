package com.string;

public class ToStingMethod {
	
		
		int rollno;
		String name;
		
		ToStingMethod(int rollno, String name){
			this.rollno=rollno;
			this.name=name;
		
	}
		public String toString() {
			return rollno+" "+name;
		}
		
		public static void main(String[] args) {
			ToStingMethod s1=new ToStingMethod(1,"abc");
			ToStingMethod s2=new ToStingMethod(2,"pqr");
			System.out.println(s1);
			System.out.println(s2);


		}

}
