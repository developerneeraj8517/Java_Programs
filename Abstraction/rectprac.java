package com.abstraction;

public class rectprac extends practice {
	
	public int length;
	public int breadth;
	
	rectprac(int length, int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	public double area() {
	System.out.println("Area of Reactangle..... " );
		return length*breadth;
	}
	public double perimeter() {
		System.out.println("Perimeter of Restangle ");
		return 2*(length+breadth);
	}



public static void main(String[] args) {
	practice r=new rectprac(5,8);
	System.out.println("Area of Reactangle "+r.area() );
	System.out.println(r.perimeter());
	}
}