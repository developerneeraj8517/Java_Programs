package com.multithreading;

class Thread2 implements Runnable{
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("i am using runnable interface.."
				);
		
		for(int i=1; i<=10;i++) {
			
			System.out.println(i);
			
			//sleep method
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
public class MyThread2 {

	public static void main(String[] args)
	{	
		//object
		Thread2 runnable=new Thread2();
		
		//object thread
	
		Thread th=new Thread(runnable);
		
		th.start();
	}

}
