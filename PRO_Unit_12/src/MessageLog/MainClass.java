package MessageLog;

import Interruptions.MessageLog;

public class MainClass {

	public static void main(String[] args) throws InterruptedException {

		int waitInterrupt = Integer.parseInt(args[0]) * 1000;
		int acum = 0;

		MessageLog m = new MessageLog("Message 1", "Message 2", "Message 3",
				"Message 4");
		Thread t = new Thread(m);
		t.start();

		while (t.isAlive()) {
			
			Thread.sleep(1000);
			acum += 1000;
			
			if (acum == waitInterrupt)
				t.interrupt();
		}
		// t.sleep(waitInterrupt);
		t.interrupt();

	}

}
