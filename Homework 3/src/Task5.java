import java.util.Scanner;


public class Task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in, "UTF-8");
		int n = 0, k = 0;
		long nFact = 1, kFact = 1, tempF = 1;
		
		System.out.print("K = ");
		k = sc.nextInt();
		System.out.print("N = ");
		sc.nextLine();
		n = sc.nextInt();
		
		if (n <= 1 || k <= 1) {
			System.out.println("K and N must be greater than 1.");
			sc.close();
			return;
		} else if (n <= k) {
			System.out.println("N must be greater than K.");
			sc.close();
			return;
		} else {
			for (int i = 1; i <= k; i++) {
				kFact *= i;
			}
			for (int i = 1; i <= n; i++) {
				nFact *= i;
			}
			n -= k;
			for (int i = 1; i <= n; i++) {
				tempF *= i;
			}
			System.out.println("n! * k! / (n - k)! = " + (nFact * kFact) / tempF);
		}

		sc.close();
	}

}
