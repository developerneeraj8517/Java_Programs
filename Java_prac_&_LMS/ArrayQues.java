package com.Practice;

import java.util.Arrays;

public class ArrayQues {

	public static void main(String[] args) {
		int arr[]= {2,4,5,3,6,7,9,4,5,6};
		
		for(int i=2; i<=6; i++) {
			System.out.print(arr[i]+" ");
		}
		Arrays.sort(arr);
		System.out.println("\n"+arr[arr.length-2]);
	}
}
