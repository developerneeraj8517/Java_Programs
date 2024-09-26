package com.Array;
import java.util.*;
public class ArrayProduct {
	      //static // main function
	
	
	    public static void main(String args[])
	    {
	    	  Scanner sc=new Scanner(System.in);
	        int arr1[][]
	            = new int[2][2];
            int arr2[][]= new int[2][2];
	        
	        for (int i = 0; i < 2; i++) {
	        	for(int j=0; j<2; j++) {
	                arr1[i][j] =sc.nextInt();
	        	}
	          
	        	}
	        for (int i = 0; i < 2; i++) {
	        	for(int j=0; j<2; j++) {
	        		 arr2[i][j] =sc.nextInt();
	        	}
	        	}
	        
	    
	    
	    int res[][]=new int[2][2];
	    for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++)
                    res[i][j] += arr1[i][k] * arr2[k][j];
            }
        }
	    for(int i=0; i<2; i++) {
	    	for(int j=0; j<2; j++) {
	    		System.out.print(res[i][j] +" ");
	    	}
	    	System.out.println();
	    }
	    }
	    
}
