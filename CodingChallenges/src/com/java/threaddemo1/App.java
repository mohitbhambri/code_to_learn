package com.java.threaddemo1;

import java.util.Scanner;

class Processor extends Thread{
	
	private volatile boolean running = true; // used volatile as on some systems thread caches the value of variables thinking its theo only thread running
	// if you want to change variable from another thread, make it volatile
	public void run() {
		while(running)
			System.out.println(Thread.currentThread().getName()+" Hello");
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void shutdown() {
		running = false;
	}
}

public class App {

	public static void main(String[] args) {
		Processor proc1 = new Processor();
		proc1.start();
		
		System.out.println("Press Enter to stop the thread..");
		Scanner input = new Scanner(System.in);
		input.nextLine();
		
		proc1.shutdown();
	}

}
