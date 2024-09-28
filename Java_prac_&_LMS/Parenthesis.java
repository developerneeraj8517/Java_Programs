package com.Practice;
import java.util.*;

public class Parenthesis {
	
	public static int findParenthesis(String st,int open) {
		int count=1;
		for(int i=open+1; i<st.length();i++) {
			char current=st.charAt(i);
			if(current=='(') {
				count++;
			}
			if(current==')') {
				count--;
			}
			if(count==0) {
				return i;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		int a=10;
		System.out.println(a);
		Scanner sc=new Scanner(System.in);
		String st="Sometimes (when I nest my parenthesis (also called parentheticals) too many times (like this (and this))) they get quite confusing.";
		
		int closingPosition=findParenthesis(st,10);
		System.out.println(closingPosition);
		
		
		
	}
	
	
}
