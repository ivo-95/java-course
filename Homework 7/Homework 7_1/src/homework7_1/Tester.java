package homework7_1;

public class Tester {
	public static void main(String[] args) {
		int[] arr = new int[10];
		char[] charArr = new char[26];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		for (int i = 0; i < charArr.length; i++) {
			charArr[i] = (char) (65 + i);
		}
		
		ReverseArray.reverseArray(arr);
		System.out.println();
		ReverseArray.reverseArray(charArr);
	}
}
