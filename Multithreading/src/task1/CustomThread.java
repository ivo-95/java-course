package task1;

import java.util.Random;

public class CustomThread extends Thread {
	
	public CustomThread() {
		super();
	}
	
	public CustomThread(String string) {
		this.setName(string);
	}

	public void run() {
		System.out.println("The thread is started!");
		Random r = new Random();
		long time = (long) (r.nextInt(10) + 1);
		System.out.println("Thread name: " + this.getName());
		try {
			Thread.sleep(time * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("The thread completed!");
	}
}
