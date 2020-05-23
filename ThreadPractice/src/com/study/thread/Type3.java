package com.study.thread;

public class Type3 {

	public static void main(String[] args) {

		
		Thread t1= new Thread(
				()->{
					System.out.println("inside lamda expression t1");
					for (int i = 1; i <= 10; i++) {
						System.out.println("thread " + i);
					}
				}
				);
		
		Thread t2= new Thread(
				()->{
					System.out.println("inside lamda expression t2");
					for (int i = 11; i <= 20; i++) {
						System.out.println("thread " + i);
					}
				}
				);
		
		t1.start();
		t2.start();
	}

}
