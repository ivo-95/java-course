import java.util.Scanner;


public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in, "UTF-8");
		int n = 0;
		
		System.out.print("Enter a number: ");
		n = sc.nextInt();
		
		if (n < 1) {
			System.out.println("Enter a number >= 1");
			sc.close();
			return;
		}
		
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
		}
		
		sc.close();
	}

}
