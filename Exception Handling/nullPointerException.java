package com.exception;

public class nullPointerException {
	
public void display() {
	System.out.println("DISPALY.......");
}
	
		
	
	  public static void main(String[] args) {
		  nullPointerException obj=null;
		  try {
		  obj.display();
		  }
		  catch(NullPointerException e){
			  System.out.println(e);
		  }
	  }
}
