package homework9_5;

import java.util.Scanner;
import java.util.Stack;

public class Task9_5_1 {

	public static void main(String[] args) {
		Stack<String> words = new Stack<String>();
		Scanner sc = new Scanner(System.in, "UTF-8");
		String sentence = null, word = null;
		
		System.out.println("Enter a sentence:");
		sentence = sc.nextLine();
		sc.close();
		sc = new Scanner(sentence);
		
		while (sc.hasNext()) {
			word = sc.next();
			words.push(word);
		}
		
		while (!words.isEmpty()) {
			System.out.print(words.pop() + " ");
		}
		sc.close();
	}

}
