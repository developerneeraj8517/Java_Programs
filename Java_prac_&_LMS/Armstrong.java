package com.practice;
import java.util.*;

public class Armstrong {
	int num;
	Armstrong(int num){
		this.num=num;
	}
	public boolean arm(int num) {
		int originalnum=num;
		int ans=0;
		while(num!=0) {
			int rem=num%10;
			 ans +=rem*rem*rem;
			 num=num/10;
			
		}
		if(ans==originalnum) {
		
		return true;
	}
		else {
		return false ;
		}
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		
		Armstrong a=new Armstrong(num);
		System.out.println(a.arm(num));
	}
		
	}


