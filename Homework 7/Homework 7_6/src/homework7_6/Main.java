package homework7_6;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int num = 0;
		Random rand = new Random();
		
		for (int i = 0; i < 20; i++) {
			num = rand.nextInt(100);
			evenNumber(num);
		}
	}

	public static final void evenNumber(int num) {
		if (num % 2 == 0) {
			System.out.format("The number %d is even.\n", num);
		} else {
			System.out.format("The number %d is odd.\n", num);
		}
	}
}
