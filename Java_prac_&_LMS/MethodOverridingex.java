package com.inheritance;
import java.util.*;

class Animal{
	public void makeSound() {
		System.out.println("The animal makes a sound ");
	}
	
}
 
class Dog extends Animal{
	
	public void makeSound() {
		System.out.println("The dog Barks ");
	}
	
}
class Cat extends Animal{
	public void makeSound() {
		System.out.println("The Cat meows ");
	}
	
	
}

public class MethodOverridingex {
	
	public static void main(String[] args) {
	Animal o1=new Animal();
	o1.makeSound();
	Animal o2=new Dog();
	o2.makeSound();
	Animal o3=new Cat();
	o3.makeSound();
		
//		Animal A;
//		System.out.println("Enter Choice 1 for Dog 2 for Cat and 3 for Animal ");
//		Scanner sc=new Scanner(System.in);
//		int choice=sc.nextInt();
//		switch(choice) {
//		case 1:
//			A=new Dog();
//		break;
//		case 2:  
//			A=new Cat();
//			break;
//		
//		default : 
//			A=new Animal();
//		}
//		A.makeSound();
	
	}

}
