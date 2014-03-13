package Interruptions;
public class ThreadInterrupted2 {

	public static void main(String[] arg) throws InterruptedException {
		Runnable r = new MessageLog();
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("main: " + i);
			Thread.sleep(1000);
		}
		t.interrupt();
		System.out.println("Thread interrupted");
		for (int i = 5; i < 15; i++) {
			System.out.println("main: " + i);
			Thread.sleep(1000);
		}
	}
}
