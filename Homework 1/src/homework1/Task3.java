package homework1;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		String firstName = null, lastName = null;
		byte years = 0;
		char gender = 0;
		long ID = 0, tel = 0;
		Scanner sc = new Scanner(System.in, "UTF-8");
		
		System.out.print("First name: ");
		// get input before space
		firstName = sc.next();
		
		System.out.print("Last name: ");
		// flush buffer
		sc.nextLine();
		// get input before space
		lastName = sc.next();
		
		// repeat cycle until correct input
		do {
			System.out.print("Years: ");
			// flush buffer
			sc.nextLine();
			years = sc.nextByte();
			if (years >= 0 && years <= 120) {
				break;
			}
			else {
				System.out.println("Enter a number between 0 and 120.");
			}
		} while (true);
		
		// same as above
		do {
			System.out.print("Gender: ");
			// flush buffer
			sc.nextLine();
			gender = sc.next().charAt(0);
			if (gender == 'm' || gender == 'M' || gender == 'f' || gender == 'F') {
				break;
			}
			else {
				System.out.println("Incorrect input for gender.");
			}
		} while (true);
		
		System.out.print("ID: ");
		// flush buffer
		sc.nextLine();
		ID = sc.nextLong();
		
		System.out.print("Phone number: ");
		// flush buffer
		sc.nextLine();
		tel = sc.nextLong();
		
		// Print data
		System.out.println("\nEmployee: " + firstName + " " + lastName);
		System.out.println("Years: " + years);
		if (gender == 'm' || gender == 'M') {
			System.out.println("Gender: male");
		}
		else {
			System.out.println("Gender: female");
		}
		System.out.println("ID: " + ID + "\nPhone number: 0" + tel);
		
		sc.close();
	}

}
