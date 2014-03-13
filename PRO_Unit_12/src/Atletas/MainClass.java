package Atletas;

public class MainClass extends Thread {

	public static void main(String[] args) throws InterruptedException {

		Thread t0 = new Thread(new Atleta());
		Thread t1 = new Thread(new Atleta());
		Thread t2 = new Thread(new Atleta());
		Thread t3 = new Thread(new Atleta());

		t0.start();
		t1.start();
		t2.start();
		t3.start();

	}

}
