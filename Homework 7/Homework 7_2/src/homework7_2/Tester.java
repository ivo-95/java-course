package homework7_2;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in, "UTF-8");
		int num = 0;
		
		System.out.print("Enter a number between 10 and 30000: ");
		num = sc.nextInt();
		
		if (num < 10 || num > 30000) {
			System.out.println("Enter a number between 10 and 30000!");
			sc.close();
			return;
		}
		
		System.out.println("Sum: " + NumberSum.getSum(num, 0));
		sc.close();
	}

}
