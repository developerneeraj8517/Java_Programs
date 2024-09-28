package com.inheritance;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//object
//		ActivaPlus a1=new ActivaPlus();
//		a1.bill("Activa", 8000.5);
//		System.out.println(a1.Name_of_comp="ActivaPlus");
//		System.out.println(a1.price=900.5);
		
//		Scanner sc=new Scanner(System.in);
//		Student s1=new Student();
//		Employee e1=new Employee();
//		System.out.println("Enter name and  city ");
//		String name=sc.nextLine();
//		String city=sc.nextLine();
////		int id=sc.nextInt();
//		s1.msg(name, city);
//	    int id=sc.nextInt();
//	    s1.info2(id);
//	    
//	    double salary=sc.nextDouble(); 
//	    e1.info(salary);
	    
		
		Business b1=new Business();
		b1.msg();
		LocalBusiness b2= new LocalBusiness();
		b2.msg();
		InternationalBusiness b3=new InternationalBusiness();
		b3.msg();
	}
}
