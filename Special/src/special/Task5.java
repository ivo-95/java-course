package special;

public class Task5 {

	public static void main(String args[]) {
		int[] arr = { 3, 6, 7 };
		variations(arr);
	}

	public static void variations(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				System.out.print(arr[i] + "" + arr[j] + " ");
			}
		}
	}

}
