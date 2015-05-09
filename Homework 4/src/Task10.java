import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		int len = 0, i = 0, j = 0, current = 0;
		int[][] arr = null;
		Scanner sc = new Scanner(System.in, "UTF-8");

		System.out.print("Enter array size: ");
		len = sc.nextInt();

		if (len <= 1) {
			System.out.println("Enter a size > 1!");
			sc.close();
			return;
		} 

		
		arr = new int[len][len];
		while (current != len - 1) {
			i = j = current;
			for (; j < len - current; j++) {
				System.out.print("arr[" + i + "][" + j + "] = ");
				sc.nextLine();
				arr[i][j] = sc.nextInt();
			}
			j--;
			i++;
			for (; i < len - current; i++) {
				System.out.print("arr[" + i + "][" + j + "] = ");
				sc.nextLine();
				arr[i][j] = sc.nextInt();
			}
			i--;
			j--;
			for (; j >= current; j--) {
				System.out.print("arr[" + i + "][" + j + "] = ");
				sc.nextLine();
				arr[i][j] = sc.nextInt();
			}
			j++;
			i--;
			for (; i > current; i--) {
				System.out.print("arr[" + i + "][" + j + "] = ");
				sc.nextLine();
				arr[i][j] = sc.nextInt();
			}
			i++;
			current++;
		}

		
		for (int a = 0; a < len; a++) {
			for (int b = 0; b < len; b++) {
				System.out.print(arr[a][b] + "\t");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
