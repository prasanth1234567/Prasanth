package com.app1;

public class Test implements Runnable{
	public void main(int a){
		
	}
	public void add(String s){
		System.out.println("child thread");
	}
	public void multi(){
		System.out.println("child thread1");
	}
	@Override
	public void run() {
		main(10);
		add(new String("hemanth"));
	
	}

}
