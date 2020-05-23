package com.study.thread;

class IRunner implements Runnable {
	static int count = 1;

	@Override
	public void run() {
		System.out.println("Thread  " + count);
		for (int i = 1; i <= 10; i++) {
			System.out.println("thread run " + i);
		}
		count++;
	}

}

public class Type2 {

	public static void main(String[] args) {

		Thread t1 = new Thread(new IRunner());
		
		Thread t2 = new Thread(new IRunner());
		
		t1.start();
		
		t2.start();
		
	}

}
