package com.multithreading;

class Thread1 extends Thread{
	public void run() {
		System.out.println("myfirst threadd is running.....");
//	
//	for(int i=1; i<=20; i++) {
//		if(i%2==0) {
//			System.out.println(i);
//		}
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	}
}

public class MyThread extends Thread{
	public static void main(String[] args) {
		
		//object
		Thread1 t1=new Thread1();
		
		//start method
		t1.start();
		System.out.println("main thread is running...");
	}

}
