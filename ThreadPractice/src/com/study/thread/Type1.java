package com.study.thread;

class Runner extends Thread {

	
	static int count =0;
	@Override
	public void run() {

		for (int i = 1; i <= 10; i++) {
			count++;
			System.out.println("thread " + i +" "+ count);
		}
	}

}

public class Type1 {

	public static void main(String[] args) {

		Runner runner = new Runner();
		
		Runner runner2 = new Runner();
		runner.start();
		
	/*	try {
			runner.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		runner2.start();
		

	}

}
