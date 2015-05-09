
public class Task6 {

	public static void main(String[] args) {
		int[] arr = new int[30];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
			if (arr[i] % 6 == 0) {
				System.out.println();
			}
			
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[arr.length - 1 - i] + "\t");
			if (arr[i] % 6 == 0) {
				System.out.println();
			}
			
		}
	}

}
