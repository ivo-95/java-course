import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in, "UTF-8");
		String input = null;
		
		System.out.print("Enter card: ");
		input = sc.next();
		
		switch (input) {
			case "2":
			case "3":
			case "4":
			case "5":
			case "6":
			case "7":
			case "8":
			case "9":
			case "10":
			case "j":
			case "J":
			case "q":
			case "Q":
			case "k":
			case "K":
			case "a":
			case "A":
				System.out.println("Valid card.");
				break;
			default:
				System.out.println("Invalid card.");
		}
		
		sc.close();
	}

}
