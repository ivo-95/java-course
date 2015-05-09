import java.util.Scanner;


public class Task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in, "UTF-8");
		int a = 0, b = 0, j = 0;
		int[] arr = null;
		
		System.out.print("a = ");
		a = sc.nextInt();
		System.out.print("b = ");
		sc.nextLine();
		b = sc.nextInt();
		
		if (b < a) {
			System.out.println("Enter b > a");
			sc.close();
			return;
		}
		
		arr = new int[b - a + 1];
		for (int i = a; i <= b; i++) {
			arr[j] = i;
			j++;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 3 == 0 && arr[i] != 0) {
				System.out.print(arr[i] + " ");
			}
		}
		
		sc.close();
	}

}
