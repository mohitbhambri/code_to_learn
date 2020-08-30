package com.java.threaddemo1;

public class App2 {
	
	private int count=0;
	
	//intrinsic lock - lock while accessing the object state, specifically instance call
	public synchronized void increment() {
		count++;
	}
	
	public static void main(String[] args) {
		App2 appRun = new App2();
		appRun.doWork();

	}

	public void doWork() {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for(int i=0;i<10000;i++) {
					increment();
				}
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for(int i=0;i<10000;i++) {
					increment();
				}
				
			}
		});
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Count is: "+count);
	}

}
