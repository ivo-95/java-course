package homework7_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in, "UTF-8");
		int a = 0, b = 0, c = 0;
		
		System.out.print("a = ");
		a = sc.nextInt();
		
		System.out.print("b = ");
		sc.nextLine();
		b = sc.nextInt();
		
		System.out.print("c = ");
		sc.nextLine();
		c = sc.nextInt();
		
		System.out.println("The largest number is: " + (c > maxNumber(a, b) ? c : maxNumber(a, b)));
	}
	
	public static final int maxNumber(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

}
