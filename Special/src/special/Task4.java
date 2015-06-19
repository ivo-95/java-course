package special;

public class Task4 {

	public static void main(String args[]) {
		int[] arr = { 4, 3, 9 };
		variations(arr);
	}

	public static void variations(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (j == i) {
					continue;
				} else {
					System.out.print(arr[i] + "" + arr[j] + " ");
				}
			}
		}
	}
}
