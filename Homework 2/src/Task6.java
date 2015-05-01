import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in, "UTF-8");
		int points = 0;
		
		System.out.print("Enter your points (0-9): ");
		points = sc.nextInt();
		
		if (points < 0 || points > 9) {
			System.out.println("Incorrect input.");
			sc.close();
			return;
		}
		
		if (points >= 1 && points <= 3) {
			points *= 5;
		} else if (points >= 4 && points <= 6) {
			points *= 10;
		} else {
			points *= 50;
		}
		
		System.out.println("Your points: " + points);
		
		sc.close();
	}

}
