package exam_ivo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExamClass {

	public int[] processArray(int[][] arr, int len) {
		int[] result = new int[len * len];
		int index = 0;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				result[index] = arr[j][i] * index;
				index++;
			}
		}
		return result;
	}
	
	public int[][] processArray(int[] arr, int len) {
		int[][] result = new int[len][len];
		int r = 0, c = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i != 0 && i % len == 0) {
				r = 0;
				c++;
			}
			result[r][c] = arr[i] * i;
			r++;
		}
		return result;
	}
	
	public int[] populateArray1(int len, Scanner sc) {
		int arr[] = new int[len * len];
		
		System.out.println("Populate 1D array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.format("arr[%d] = ", i);
			arr[i] = sc.nextInt();
			sc.nextLine();
		}
		return arr;
	}
	
	public int[][] populateArray2(int len, Scanner sc) {
		int arr[][] = new int[len][len];
		
		System.out.println("Populate 2D array:");
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				System.out.format("arr[%d][%d] = ", i, j);
				arr[i][j] = sc.nextInt();
				sc.nextLine();
			}
		}
		return arr;
	}
	
	public void writeFile(int[] arr, String fileName) throws IOException {
		FileWriter file = new FileWriter(fileName);
		BufferedWriter writer = new BufferedWriter(file);
		
		for (int i = 0; i < arr.length; i++) {
			writer.write(arr[i] + " ");
		}
		
		writer.close();
	}
	
	public void writeFile(int[][] arr, String fileName) throws IOException {
		FileWriter file = new FileWriter(fileName);
		BufferedWriter writer = new BufferedWriter(file);
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				writer.write(arr[i][j] + " ");
			}
			writer.newLine();
		}
		
		writer.close();
	}
}
