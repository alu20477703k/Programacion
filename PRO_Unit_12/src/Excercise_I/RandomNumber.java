package Excercise_I;

public class RandomNumber implements Runnable {

	int num = 0;
	int numTens = 0;
	int numTrys = 0;

	public void run() {

		numTens = 0;
		numTrys = 0;

		while (numTrys < 1000) {

			num = (int)(Math.random() * 11);
			numTrys++;

			if (num == 10)
				numTens++;
			if (numTens == 10) { 
				System.out.println("(" + Thread.currentThread().getName()
						+ ")" + " is the Winner! - Generated Numbers: "
						+ numTrys);
				Thread.currentThread().stop();

			}
		}
	}

	public int getNum() {
		return num;
	}

	public int getNumTens() {
		return numTens;
	}

	public int getNumTrys() {
		return numTrys;
	}
}
