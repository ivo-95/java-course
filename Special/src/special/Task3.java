package special;

public class Task3 {

	public static void permute(int[] arr, int startindex) {

	    if (arr.length == startindex) {
	         displayArray(arr);
	    } else {
	        for (int i = startindex; i < arr.length; i++) {
	            int[] input = arr.clone();
	            int temp = input[i];
	            input[i] = input[startindex];
	            input[startindex] = temp;
	            permute(input, startindex + 1);
	        }
	    }
	}


	private static void displayArray(int[] arr) {
	    for (int i = 0; i < arr.length; i++) {
	        System.out.print(arr[i]);
	    }
	    System.out.println();
	}

	public static void main(String[] args) {
	    int[] arr = { 3, 12, 8 };
	    permute(arr, 0);
	}

}
