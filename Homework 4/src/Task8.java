import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in, "UTF-8");
		int len = 0, temp = 0;
		int[] arr = null;
		boolean flag = true;

		System.out.print("Enter array length: ");
		len = sc.nextInt();
		arr = new int[len];

		for (int i = 0; i < len; i++) {
			System.out.print("arr[" + i + "] = ");
			sc.nextLine();
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Your array is:");
		for (int i = 0; i < len; i++) {
			System.out.print(arr[i] + " ");
		}
		
		while (flag) {
			flag = false;
			for (int i = 0; i < len - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					flag = true;
				}
			}
		}
		System.out.println("\nArray in ascending order:");
		for (int i = 0; i < len; i++) {
			System.out.print(arr[i] + " ");
		}
		
		flag = true;
		while (flag) {
			flag = false;
			for (int i = 0; i < len - 1; i++) {
				if (arr[i] < arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					flag = true;
				}
			}
		}
		System.out.println("\nArray in descending order:");
		for (int i = 0; i < len; i++) {
			System.out.print(arr[i] + " ");
		}
		
		sc.close();
	}
	
	

}
