package com.practice;

public class Bank {
	
	double amount;
	
	public Bank(double amount){
		this.amount=amount;
	}
	public void withdraw(double withdrawalAmount) {
		String message = ( withdrawalAmount<=amount)?"Withdrawal Successful": "Insufficient Balance";
		System.out.println(message);
		
		amount=(withdrawalAmount<=amount)?amount =amount- withdrawalAmount : amount;
	
	}
	
	public void deposit(double depositAmount) {
		amount+=depositAmount;
		
		System.out.println( "Desposit Successful");
		
		 System.out.println("Total balance: " + amount);
	}
	
	public static void main (String[] args) {
		Bank b=new Bank(10000);
		b.withdraw(2000);
		b.deposit(5000);
		
	}
}
