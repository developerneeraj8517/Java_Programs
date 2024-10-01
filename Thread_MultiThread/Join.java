package com.multithreading;

class Thread3 extends Thread{
	
	//execution
	public void run() {
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(500);
				System.out.println("Currently thread working: "+Thread.currentThread().getName());
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class Join {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread3 t1=new Thread3();
		Thread3 t2=new Thread3();
		Thread3 t3=new Thread3();
		
		// start with t1
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//t2 start
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//t2dead t3 start
		t3.start();
		try {
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
