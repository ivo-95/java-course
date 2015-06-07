package homework10;

import java.util.Scanner;

public class SortWords {

	public static void main(String[] args) {
		String sentence = null;
		String[] words = null;
		Scanner sc = new Scanner(System.in, "UTF-8");

		System.out.println("Enter a sentence:");
		sentence = sc.nextLine();
		words = getWords(sentence);
		sort(words);
		for (String i : words) {
			System.out.print(i + "; ");
		}
		
		sc.close();
	}

	private static String[] getWords(String sentence) {
		String[] words = sentence.split("\\s+");
		for (int i = 0; i < words.length; i++) {
			words[i] = words[i].replaceAll("[^\\w]", "");
		}
		return words;
	}

	private static void sort(String[] words) {
		boolean flag = true;
		String temp = null;
		while (flag) {
			flag = false;
			for (int i = 0; i < words.length - 1; i++) {
				if (words[i].compareToIgnoreCase(words[i + 1]) > 0) {
					temp = words[i];
					words[i] = words[i + 1];
					words[i + 1] = temp;
					flag = true;
				}
			}
		}
	}
}
