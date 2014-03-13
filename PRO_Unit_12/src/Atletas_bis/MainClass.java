package Atletas_bis;

public class MainClass {

	public static void main(String[] args) {
	
		Thread t0 = new Thread(new Atleta());
		Thread t1 = new Thread(new Atleta1());
		Thread t2 = new Thread(new Atleta2());
		Thread t3 = new Thread(new Atleta3());
		
		t0.start();
		t1.start();
		t2.start();
		t3.start();
		
	}

}
