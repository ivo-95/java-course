package homework8;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in, "UTF-8");
		String word = null, text = null;
		
		System.out.print("Enter a word: ");
		word = sc.nextLine();
		System.out.print("Enter some text: ");
		text = sc.nextLine();
		
		if (!text.contains(word)) {
			System.out.println("Your text does not contain the word \"" + word + "\"");
		} else {
			text = text.replace(word, word.toUpperCase());
			System.out.println("Your text with the word \"" + word + "\" in upper case:\n" + text);
		}
		
		sc.close();
	}
}
