import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in, "UTF-8");
		int[] arr = null;
		int len = 0, num = 0, left = 0, right = 0, middle = 0;
		
		System.out.print("Enter array length: ");
		len = sc.nextInt();
		arr = new int[len];
		for (int i = 0; i < len; i++) {
			arr[i] = i + 1;
		}
		System.out.println("You array is:");
		for (int i = 0; i < len; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.print("\nEnter a number to search for: ");
		sc.nextLine();
		num = sc.nextInt();
		
		left = 0;
		right = len - 1;
		middle = (left + right) / 2;
		
		while (left <= right) {
			if (arr[middle] == num) {
				System.out.println("The number " + num + " was fount at index = " + middle + ".");
				sc.close();
				return;
			} else if (arr[middle] < num) {
				left = middle + 1;
			} else {
				right = middle - 1;
			}
			middle = (left + right) / 2;
		}
		
		System.out.println("The number " + num + " was not found.");
		sc.close();
	}

}
