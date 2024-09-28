package com.practice;
import java.util.Scanner;

public class MaxNum {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number ");
		int n1=sc.nextInt();
		
		System.out.println("Enter Second Number ");
		int n2=sc.nextInt();
		
		String max;
		max=(n1==n2 )?"Both are Equal":(max=(n1>n2) ? "Max Number is"+n1 : "Max number is " +n2);
		
		System.out.println(max);
	}

}
