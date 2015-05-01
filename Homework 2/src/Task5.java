import java.util.Scanner;

public class Task5 {

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
		
		if (a == 0 || b == 0 || c == 0) {
			System.out.println("You can't form a triangle with a side = 0");
		} else if ((a + b) > c && (a + c) > b && (b + c) > a) {
			System.out.println("Your triangle is valid.");
		} else {
			System.out.println("Your triangle is not possible.");
		}
		
		sc.close();
	}

}
