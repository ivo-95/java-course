package homework1;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		int a = 0, b = 0, c = 0, d = 0;
		Scanner sc = new Scanner(System.in, "UTF-8");
		
		System.out.print("a = ");
		a = sc.nextInt();
		
		System.out.print("b = ");
		sc.nextLine();
		b = sc.nextInt();
		
		System.out.print("c = ");
		sc.nextLine();
		c = sc.nextInt();
		
		System.out.print("d = ");
		sc.nextLine();
		d = sc.nextInt();
		
		System.out.println("Sum = " + (a + b + c + d));
		
		sc.close();
	}

}
