package com.genericDemo;

class Test<T>{
	T obj;
	
	Test(T obj){
		this.obj=obj;
	}
	public T getObject() {
		return obj;
	}
	
}

public class genericExample {
	public static void main(String[] args) {
		Test<Integer> O=new Test<Integer>(15);
		System.out.println(O.getObject());
		
		Test<String> O1=new Test<String>("Welcome");
		System.out.println(O1.getObject());
	}

}
