import java.util.Scanner;


public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in, "UTF-8");
		int len = 0, num = 0, index = -1;
		int[] arr = null;
		
		System.out.print("Enter array length: ");
		len = sc.nextInt();
		arr = new int[len];
		
		for (int i = 0; i < len; i++) {
			System.out.print("arr[" + i + "] = ");
			sc.nextLine();
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter a number to search for: ");
		sc.nextLine();
		num = sc.nextInt();
		
		for (int i = 0; i < len; i++) {
			if (arr[i] == num) {
				index = i;
				break;
			}
		}
		
		if (index != -1) {
			System.out.println("The number " + num + " was found at index = " + index + ".");
		} else {
			System.out.println("No matching number found.");
		}
		sc.close();
	}

}
