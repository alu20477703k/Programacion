package Excercise_I;

/**
 * 
 * Write a program that launches 10 threads. Each thread will enter a loop
 * generating random numbers between 0 and 10. We want to know which thread got
 * first 1.000 tens. The program must display the number of the winner thread
 * and the number of random numbers generated by that thread to get those 1.000
 * tens. ! The rest of threads will print their data as well (number of tens and
 * number of random numbers generated). ! Note: When the winner thread finishes
 * the rest of the threads must finish too.
 * 
 */

public class MainClass extends Thread {

	public static void main(String[] args) throws InterruptedException {

		Thread t = new Thread(new RandomNumber());
		Thread t1 = new Thread(new RandomNumber());
		Thread t2 = new Thread(new RandomNumber());
		Thread t3 = new Thread(new RandomNumber());
		Thread t4 = new Thread(new RandomNumber());
		Thread t5 = new Thread(new RandomNumber());
		Thread t6 = new Thread(new RandomNumber());
		Thread t7 = new Thread(new RandomNumber());
		Thread t8 = new Thread(new RandomNumber());
		Thread t9 = new Thread(new RandomNumber());

		t.start();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();

	}

}
