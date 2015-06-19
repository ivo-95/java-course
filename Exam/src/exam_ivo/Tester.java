package exam_ivo;

import java.io.IOException;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		ExamClass test = new ExamClass();
		String opt = null, fileName = null;
		Scanner sc = new Scanner(System.in, "UTF-8");
		int len = 0;
		
		System.out.println("Choose an option:\n1. Convert 1D to 2D array.\n2. Convert 2D to 1D array.\n---(1/2)---");
		
		opt = sc.nextLine();
		if (opt.equals("1")) {
			// case 1
			System.out.print("Enter a number between 2 and 9: ");
			len = sc.nextInt();
			if (len < 2 || len > 9) {
				System.out.println("Wrong input!");
				sc.close();
				return;
			}
			
			int arr[] = test.populateArray1(len, sc);
			int arr2[][] = test.processArray(arr, len);
			
			System.out.println("Result is:");
			for (int i = 0; i < len; i++) {
				for (int j = 0; j < len; j++) {
					System.out.format("%d ", arr2[i][j]);
				}
				System.out.println();
			}
			
			System.out.print("Enter file name: ");
			fileName = sc.next();
			try {
				test.writeFile(arr2, fileName);
			} catch (IOException e) {
				System.out.println("File error.");
				e.printStackTrace();
			} finally {
				System.out.println("Program completed!");
			}
			
		} else if (opt.equals("2")) {
			// case 2
			System.out.print("Enter a number between 2 and 9: ");
			len = sc.nextInt();
			if (len < 2 || len > 9) {
				System.out.println("Wrong input!");
				sc.close();
				return;
			}
			
			int[][] arr = test.populateArray2(len, sc);
			int[] arr2 = test.processArray(arr, len);
			
			System.out.println("Result is:");
			for (int i = 0; i < arr2.length; i++) {
				System.out.format("%d ", arr2[i]);
			}
			
			System.out.print("\nEnter file name: ");
			fileName = sc.next();
			try {
				test.writeFile(arr2, fileName);
			} catch (IOException e) {
				System.out.println("File error.");
				e.printStackTrace();
			} finally {
				System.out.println("Program completed!");
			}
		} else {
			System.out.println("Wrong input!");
		}
		
		sc.close();
	}

}
