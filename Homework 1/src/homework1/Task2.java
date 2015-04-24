package homework1;

public class Task2 {

	public static void main(String[] args) {
		int a = 1, b = 3;
		
		System.out.println("a = " + a + ", b = " + b);
		
		// Swap values
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("a = " + a + ", b = " + b);
	}
}
