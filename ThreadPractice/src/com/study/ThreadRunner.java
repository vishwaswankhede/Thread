package com.study;

class Task1 extends Thread {

	public void run() {
		System.out.println("task1 started");
		for (int i = 101; i <= 200; i++)
			System.out.print(i + " ");
		System.out.println("task1 done");
		
	}

}


class Task2 implements Runnable{

	@Override
	public void run() {
		System.out.println("task2 started");
		for (int i = 201; i <= 300; i++)
			System.out.print(i + " ");
		System.out.println("task2 done");
		
	}
	
}

public class ThreadRunner {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("task 1 kicked off");
		// task1
		/*for (int i = 101; i <= 200; i++)
			System.out.print(i + " ");*/
		Task1 t1 = new Task1();
		t1.start();
		
		t1.wait();

		System.out.println("\ntask 2 kicked off");

		// task2
		/*for (int i = 201; i <= 300; i++)
			System.out.print(i + " ");*/
		
		Task2 t2 = new Task2();
		Thread thread2 = new Thread(t2);
		thread2.start();
		
		t1.join();
	//	thread2.join();
		
		
		
		System.out.println("\ntask 3 kicked off");
		Thread tt = new Thread(()->{
			System.out.println("task3 started");
			for (int i = 301; i <= 400; i++)
				System.out.print(i + " ");
			System.out.println("task3 done");
		});
		tt.start();

		
		// task3
		/*for (int i = 301; i <= 400; i++)
			System.out.print(i + " ");*/

	}

}
