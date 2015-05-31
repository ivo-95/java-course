package homework9_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Task_9_3_1 {

	public static void main(String[] args) {
		//ArrayList<String> words = new ArrayList<String>();
		HashSet<String> words = new HashSet<String>();
		HashMap<String, Integer> repeats = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in, "UTF-8");
		String word = null;
		
		for (int i = 0; i < 20; i++) {
			System.out.print("Enter a word: ");
			word = sc.nextLine();
			if (!words.add(word)) {
				incrementCount(repeats, word);
			}
		}
		
		System.out.println(repeats);
		sc.close();
	}

	public static void incrementCount(HashMap<String, Integer> repeats, String word) {
		if (repeats.containsKey(word)) {
			int count = repeats.get(word);
			count++;
			repeats.replace(word, count);
		}
		else {
			repeats.put(word, 2);
		}
	}
}
