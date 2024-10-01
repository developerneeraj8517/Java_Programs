package com.multithreading;
class NewThread extends Thread{
	NewThread(String name, int priority){
	
		super(name);
		// set priority
		setPriority(priority);
	}
	// execution
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(getName()+"numbers "+i);		
//			try {
//				Thread.sleep(500)
//			}
//			catch(InterruptedException){
//				e.printStackTrace();
//			}
			}
	}
}
public class ExPriority {

public static void main(String[] args) {
System.out.println("HELLO");
NewThread t1=new NewThread("High priority thread",Thread.MAX_PRIORITY);
NewThread t2=new NewThread("mid level priority", Thread.NORM_PRIORITY);
 NewThread t3=new NewThread("low priority thread ",Thread.MIN_PRIORITY);
 t1.start();
 t2.start();
 t3.start();
}}
 