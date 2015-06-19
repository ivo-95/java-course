package special;

public class Task1 {

	public static void main(String[] args) {
		int[] arr = { 5, 17, 13, 9, 5, 8, 11, 6, 3, 1, 5, 12 };
		//int[] arr = { 1, 2, 5, 6, 3, 2, 5 };
		//int[] arr = { 8, 7, 6, 5, 10, 12, 15, 11, 10, 9, 8, 7 };
		int count = 0, temp = 0;
		String str = printSeries(arr);
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ',') {
				count++;
			}
			if (str.charAt(i) == '\n') {
				if (count > temp) {
					temp = count;
					count = 0;
				}
			}
		}
		count = temp;
		
		String[] series = str.split("\\r?\\n");
		
		for (int i = 0; i < series.length; i++) {
			int current = 0;
			for (int j = 0; j < series[i].length(); j++) {
				if (series[i].charAt(j) == ',') {
					current++;
				}
			}
			if (current == count) {
				if (series[i].endsWith(",")) {
					System.out.println(series[i].substring(0, series[i].length() - 1));
				} else {
					System.out.println(series[i].substring(0, series[i].length() - 2));
				}
			}
		}
		
	}
	
	public static String printSeries(int[] arr) {
		StringBuilder strb = new StringBuilder();
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				if (i == arr.length - 2) {
					strb.append(arr[i] + ", " + arr[i + 1] + ", ");
				} else {
					strb.append(arr[i] + ", ");
				}
			} else {
				if (i >= 1) {
					if ((arr[i] < arr[i - 1])) {
						strb.append(arr[i] + ",\n");
					}
				}
			}
		}
		strb.append("\n");
		return strb.toString();
	}
}
