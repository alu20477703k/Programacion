package Atletas_bis;

public class Atleta2  extends Thread {

	private static int META = 10;

	public void run() {

		for (int i = 0; i <= META; i++) {
			System.out.println(Thread.currentThread().getName()+" -> Kilometro: " + i);
		}

	}
}
