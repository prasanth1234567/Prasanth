package com.app;

public class TheradExample extends Thread {

public void run(){
	System.out.println("this is child thread");
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
//	try {
//		wait(100);
//	} catch (InterruptedException e) {
//		e.printStackTrace();
//	}
	System.out.println("this is after child thread");
}
	
	}
	


