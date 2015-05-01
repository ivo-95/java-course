import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in, "UTF-8");
		int a = 0;
		
		System.out.print("a = ");
		a = sc.nextInt();
		
		if (a >= 1 && a <= 5) {
			System.out.println("Number is even: " + (a % 2 == 0));
		} else if (a >= 6 && a <= 15) {
			System.out.println("a % 3 == 0 - " + (a % 3 == 0));
		} else {
			if (a > 0) {
				System.out.println("Number is positive.");
			} else if (a < 0) {
				System.out.println("Number is negative.");
			} else {
				System.out.println("Number is zero.");
			}
		}
		
		sc.close();
	}

}
