package com.abstraction;

public class Child implements Father, Mother {
	
public void m1() {
	System.out.println("Inherit features from father....");
}

public void m2() {
	System.out.println("Inherit features from Mother...");

}

public static void main(String[] args) {
	Child c=new Child();
	c.m1();
	c.m2();
}

}
