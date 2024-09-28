package com.Practice;
import java.util.*;

public class StrongNumber {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int org_num=num;
	int res=0;
	while(num!=0) {
		 int a=num%10;
		 int fact=1;
		for(int i=1;i<=a;i++) {
			fact=fact*i;
		}
		res+=fact;
		num=num/10;
	}
	if(res==org_num) {
		System.out.println(" is a Strong number");
	}
	else {
		System.out.println("Not a strong number");
	}
}
}
