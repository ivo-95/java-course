import java.util.Scanner;


public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in, "UTF-8");
		int n = 0, min = 0, max = 0;
		int[] arr = null;

		System.out.print("Enter a number: ");
		n = sc.nextInt();
		arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Num. " + (i + 1) + " = ");
			sc.nextLine();
			arr[i] = sc.nextInt();
		}
		
		min = arr[0];
		for (int i = 1; i < n; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		
		max = arr[0];
		for (int i = 1; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.format("Min = %d\nMax = %d\n", min, max);
		sc.close();
	}

}
