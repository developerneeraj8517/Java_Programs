package com.Practice;

public class OutofBoundException {
	public static void main(String [] args) {
		int[] arr= {2,4,6,8,10,12,16};
		
		try {
			for(int i=7; i<10;i++) {
				System.out.println(arr[i]+ " ");
			}
		}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
				System.out.println(e.getMessage());
				e.printStackTrace();
				System.out.println(e.toString());



			}
		
		
	}

}
