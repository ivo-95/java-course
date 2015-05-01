import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in, "UTF-8");
		int a = 0, b = 0, c = 0, d = 0, e = 0, max = 0;

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
		
		System.out.print("e = ");
		sc.nextLine();
		e = sc.nextInt();
		
		// Same as "Task3" but with 5 numbers
		max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		if (d > max) {
			max = d;
		}
		if (e > max) {
			max = e;
		}
		
		System.out.println("The largest number is " + max);
		
		sc.close();
	}

}
