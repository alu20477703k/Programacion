package Atletas;

public class Atleta extends Thread {

	private static int META = 3;

	public void run() {

		for (int i = 0; i <= META; i++) {
			System.out.println(Thread.currentThread().getName()
					+ " -> Kilometro: " + i);
		}
	}
}
