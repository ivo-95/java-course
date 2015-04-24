package homework1;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		int a = 0;
		boolean res = false;
		Scanner sc = new Scanner(System.in, "UTF-8");
		char exit = 0;
		
		// Repeat cycle if wanted
		do {
			System.out.print("Enter a number: ");
			a = sc.nextInt();
			res = (a % 2 == 0);
			System.out.println("Your number is even: " + res);
			System.out.println("\nRepeat? (y/n): ");
			sc.nextLine();
			exit = sc.next().charAt(0);
			if (exit != 'y' && exit != 'Y') {
				break;
			}
			sc.nextLine();
		} while (true);
		
		sc.close();
	}

}
