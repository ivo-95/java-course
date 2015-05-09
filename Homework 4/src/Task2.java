import java.util.Scanner;


public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in, "UTF-8");
		int len = 0;
		int[] arr = null;
		
		System.out.print("Enter array length: ");
		len = sc.nextInt();
		if (len <= 2) {
			System.out.println("Enter a length greater than 2.");
			sc.close();
			return;
		}
		arr = new int[len];
		arr[0] = 1;
		arr[1] = 1;
		
		for (int i = 2; i < len; i++) {
			arr[i] = arr[i - 2] + arr[i - 1];
		}
		
		for (int i = 0; i < len; i++) {
			System.out.print(arr[i] + " ");
		}
		
		sc.close();
	}

}
