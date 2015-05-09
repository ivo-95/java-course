import java.util.Scanner;


public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in, "UTF-8");
		int len = 0, sum = 0;
		int[] arr = null;
		
		System.out.print("Enter array length: ");
		len = sc.nextInt();
		arr = new int[len];
		
		for (int i = 0; i < len; i++) {
			System.out.print("array[" + i + "] = ");
			sc.nextLine();
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < len; i++) {
			if (arr[i] % 2 == 0) {
				sum += arr[i];
			}
		}
		
		System.out.println("Sum of even numbers: " + sum);
		sc.close();
	}

}
