package com.encapsulation;
import java.util.*;

public class Circle {

	private double pi=3.14;
	public double get_pi() {
		return pi;
	}
	public void area() {
		
		System.out.println("The method to claculate Area of CIRCLE :  ");
	}
	public static void main(String[] args) {
		Circle c=new Circle();
		
		int r ;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of r: ");
		r=sc.nextInt();
	
		double area=(c.get_pi()*r*r);
		System.out.println("Area of circle is "+area);
	}
}
