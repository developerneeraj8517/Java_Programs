package com.abstraction;

public class MainClass implements CalCulator{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=10;
	 System.out.println("ADD IS " +(a+b));
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		int a=8;
		int b=7;
		System.out.println("Result is "+(a-b));
		
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		MainClass m1=new MainClass();
		m1.add();	
	m1.sub();	
	}

}
