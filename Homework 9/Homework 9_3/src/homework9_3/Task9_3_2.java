package homework9_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Task9_3_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in, "UTF-8");
		HashMap<String, Integer> repeats = new HashMap<String, Integer>();
		String text = null, word = null;
		
		System.out.println("Enter some text:");
		text = sc.nextLine();
		sc.close();
		sc = new Scanner(text);
		while (sc.hasNext()) {
			word = sc.next();
			incrementCount(repeats, word);
		}
		printWords(repeats);
		sc.close();
	}

	public static void incrementCount(HashMap<String, Integer> repeats, String word) {
		if (repeats.containsKey(word)) {
			int count = repeats.get(word);
			count++;
			repeats.replace(word, count);
		}
		else {
			repeats.put(word, 1);
		}
	}
	
	public static void printWords(HashMap<String, Integer> repeats) {
		System.out.println();
		for (Object key : repeats.keySet()) {
			if (repeats.get(key) == 1) {
				System.out.print(key + " ");
			}
		}
	}
}
