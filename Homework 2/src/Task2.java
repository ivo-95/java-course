import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in, "UTF-8");
		double a = 0, b = 0;
		
		System.out.print("a = ");
		a = sc.nextDouble();
		
		System.out.print("b = ");
		sc.nextLine();
		b = sc.nextDouble();
		
		if (b == 0) {
			System.out.println("You can't divide by 0!");
		} else if (a == 0) {
			System.out.println("Result is 0.");
		} else if (a < 0 && b < 0) {
			System.out.println("Result is positive (+).");
		} else if (a < 0 || b < 0) {
			System.out.println("Result is negative (-).");
		} else {
			System.out.println("Result is positive (+).");
		}
		
		sc.close();
	}

}
