package task2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import task1.CustomThread;

public class Tester {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(7);
		
		for (int i = 0; i < 5; i++) {
			CustomThread worker = new CustomThread("Thread " + (i + 1));
			executor.execute(worker);
		}
		
		executor.shutdown();
		while (!executor.isTerminated()) {}
		
		System.out.println("Finished all threads");
	}
}
