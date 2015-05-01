import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in, "UTF-8");
		byte num = 0;
		
		System.out.print("Enter a number between 0 and 9: ");
		num = sc.nextByte();
		
		if (num < 0 || num > 9) {
			System.out.println("Incorrect input.");
			sc.close();
			return;
		}
		
		switch (num) {
		case 0:
			System.out.println("Zero.");
			break;
		case 1:
			System.out.println("One.");
			break;
		case 2:
			System.out.println("Two.");
			break;
		case 3:
			System.out.println("Three.");
			break;
		case 4:
			System.out.println("Four.");
			break;
		case 5:
			System.out.println("Five.");
			break;
		case 6:
			System.out.println("Six.");
			break;
		case 7:
			System.out.println("Seven.");
			break;
		case 8:
			System.out.println("Eight.");
			break;
		case 9:
			System.out.println("Nine.");
		}
		
		sc.close();
	}

}
