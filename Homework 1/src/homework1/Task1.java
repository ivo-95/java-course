package homework1;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		double a = 0, b = 0;
		Scanner sc = new Scanner(System.in, "UTF-8");
		
		System.out.print("a = ");
		a = sc.nextDouble();
		
		System.out.print("b = ");
		// flush buffer
		sc.nextLine();
		b = sc.nextDouble();
		
		System.out.println("Surface area: " + (a * b));
		
		sc.close();
	}
}
