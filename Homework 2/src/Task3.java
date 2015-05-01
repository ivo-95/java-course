import java.util.Scanner;

public class Task3 {

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

		if (b > a) {
			a = b;
		}
		if (c > a) {
			a = c;
		}

		System.out.println("The largest number is " + a);
		
		sc.close();
	}

}
