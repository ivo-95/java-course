package task3;

public class Thread2 extends Thread {
	
	
	public synchronized void run() {
		for (int i = 1; i < 50000; i++) {
			if (i == 25000) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.format("%d ", i);
		}
	}
}
