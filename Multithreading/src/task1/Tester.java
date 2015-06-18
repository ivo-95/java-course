package task1;

public class Tester {

	public static void main(String[] args) {
		CustomThread t1 = new CustomThread();
		CustomThread t2 = new CustomThread();
		CustomThread t3 = new CustomThread();
		CustomThread t4 = new CustomThread();
		CustomThread t5 = new CustomThread();
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t3.setName("Thread 3");
		t4.setName("Thread 4");
		t5.setName("Thread 5");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
