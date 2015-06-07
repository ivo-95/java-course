package homework10;

public class TestSpeed {

	public static void main(String[] args) {
		Sorting sorter = new Sorting();
		int size = 1000000;
		int[] arr1 = new int[size], arr2 = new int[size];
		long startTime = 0, endTime = 0;
		double result = 0;
		
		for (int i = 0; i < size; i++) {
			arr1[i] = arr2[i] = size - i;
		}
		
		startTime = System.nanoTime();
		sorter.qsort(arr1);
		endTime = System.nanoTime();
		result = (endTime - startTime) / Math.pow(10, 9);
		System.out.println("Quick sort time: " + result + " s");
		
		startTime = System.nanoTime();
		sorter.bsort(arr2);
		endTime = System.nanoTime();
		result = (endTime - startTime) / Math.pow(10, 9);
		System.out.println("Bubble sort time: " + result + " s");
	}

}
