import java.util.Scanner;


public class Task9 {

	public static void main(String[] args) {
		int m = 0, n = 0;
		int[][] arr = null;
		Scanner sc = new Scanner(System.in, "UTF-8");
		
		System.out.print("m = ");
		m = sc.nextInt();
		System.out.print("n = ");
		sc.nextLine();
		n = sc.nextInt();
		
		if (m <= 0 || n <= 0) {
			System.out.println("Enter a positive array length!");
			sc.close();
			return;
		} else if (m != n) {
			System.out.println("m must equal n!");
			sc.close();
			return;
		}
		
		arr = new int[m][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("arr[" + j + "][" + i + "] = ");
				sc.nextLine();
				arr[j][i] = sc.nextInt();
			}
		}
		System.out.println("\nVertical array:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		arr = new int[m][n];
		System.out.println("Enter the new array:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("arr[" + i + "][" + j + "] = ");
				sc.nextLine();
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("\nHorizontal array:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
