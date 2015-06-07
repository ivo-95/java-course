package homework10;

import java.util.ArrayList;

public class SortNumbers {

	public static void main(String[] args) {
		ArrayList<Integer> evenList = new ArrayList<Integer>();
		ArrayList<Integer> oddList = new ArrayList<Integer>();
		int[] numbers = { 26, 10, -99, 33, 651, -3, 3, 3, 8, 22 };
		int[] even = null, odd = null;
		Sorting sorter = new Sorting();
		
		System.out.println("Initial array:");
		for (int i : numbers) {
			System.out.print(i + " ");
		}
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				evenList.add(numbers[i]);
			} else {
				oddList.add(numbers[i]);
			}
		}
		
		even = new int[evenList.size()];
		odd = new int[oddList.size()];
		for (int i = 0; i < even.length; i++) {
			even[i] = evenList.get(i);
		}
		for (int i = 0; i < odd.length; i++) {
			odd[i] = oddList.get(i);
		}
		
		System.out.println("\n\nArray with even numbers:");
		for (int i : even) {
			System.out.print(i + " ");
		}
		System.out.println("\n\nArray with odd numbers:");
		for (int i : odd) {
			System.out.print(i + " ");
		}
		
		sorter.qsort(even);
		bubbleSortDes(odd);
		System.out.println("\n\nSorted array with even numbers (ascending):");
		for (int i : even) {
			System.out.print(i + " ");
		}
		System.out.println("\n\nSorted array with odd numbers (descending):");
		for (int i : odd) {
			System.out.print(i + " ");
		}
	}
	
	private static void bubbleSortDes(int []inputArr) {
		boolean flag = true;
		int temp = 0;
		while (flag) {
			flag = false;
			for (int i = 0; i < inputArr.length - 1; i++) {
				if (inputArr[i] < inputArr[i + 1]) {
					temp = inputArr[i];
					inputArr[i] = inputArr[i + 1];
					inputArr[i + 1] = temp;
					flag = true;
				}
			}
		}
	}

}
