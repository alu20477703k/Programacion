class MyThread extends Thread {
	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.out.println("MyThread: " + i);
		}
	}
}

public class MainClass {

	public static void main(String[] arg) {
		MyThread t = new MyThread();
		t.start();
		for (int i = 0; i < 10000; i++) {
			System.out.println("main: " + i);
		}
	}
}