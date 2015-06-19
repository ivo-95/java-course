package special;

public class Task2 {

	public static void main(String[] args) {
		int[] a = { 4 };
		int[] b = { 3 };
		int n = 20;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j <= n; j++) {
				if (j % a[i] == 0 && j % b[i] != 0) {
					System.out.print(j + " ");
				}
			}
		}
		
		// Second example
		int[] a2 = { 3, 2 };
		int[] b2 = { 2, 3 };
		n = 9;
		System.out.println();
		
		for (int i = 0; i < a2.length; i++) {
			for (int j = 1; j <= n; j++) {
				if (j % a2[i] == 0 && j % b2[i] != 0) {
					System.out.print(j + " ");
				}
			}
		}
	}
}
