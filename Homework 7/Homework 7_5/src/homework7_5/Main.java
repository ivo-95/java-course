package homework7_5;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int a = 0, b = 0, c = 0;
		Random rand = new Random();
		
		for (int i = 0; i < 20; i++) {
			a = rand.nextInt(Integer.MAX_VALUE);
			b = rand.nextInt(Integer.MAX_VALUE);
			c = rand.nextInt(Integer.MAX_VALUE);
			System.out.println(multiply(a, b, c));
		}
	}
	
	public static final int multiply(int a, int b, int c) {
		return a * b * c;
	}

}
