import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in, "UTF-8");
		double a = 0, b = 0, c = 0, D = 0, x1 = 0, x2 = 0;

		System.out.print("a = ");
		a = sc.nextDouble();

		System.out.print("b = ");
		sc.nextLine();
		b = sc.nextDouble();

		System.out.print("c = ");
		sc.nextLine();
		c = sc.nextDouble();
		
		if (a == 0) {
			x1 = -c / b;
			System.out.println("x = " + x1);
			sc.close();
			return;
		}
		
		D = Math.pow(b, 2) - 4 * a * c;
		
		if (D > 0) {
			x1 = (-b + Math.sqrt(D)) / (2 * a);
			x2 = (-b - Math.sqrt(D)) / (2 * a);
			System.out.println("x1 = " + x1 + "\nx2 = " + x2);
		} else if (D == 0) {
			x1 = -b / (2 * a);
			System.out.println("x1 = x2 = " + x1);
		} else {
			D = Math.abs(D);
			D = Math.sqrt(D);
			System.out.println("x1 = (" + (-b) + " + " + D + "i) / " + (2 * a));
			System.out.println("x2 = (" + (-b) + " - " + D + "i) / " + (2 * a));
		}
		
		sc.close();
	}

}
