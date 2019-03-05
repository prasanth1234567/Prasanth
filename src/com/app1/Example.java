package com.app1;

public class Example {

public static void main(String[] args) {
	Test t = new Test();
	t.run();
	System.out.println("main thread");
	t.hashCode();
}
}
