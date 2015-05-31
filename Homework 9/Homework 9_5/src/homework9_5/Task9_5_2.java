package homework9_5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Task9_5_2 {

	public static void main(String[] args) {
		Queue<String> words = new LinkedList<String>();
		Scanner sc = new Scanner(System.in, "UTF-8");
		String sentence = null, word = null;
		
		System.out.println("Enter a sentence:");
		sentence = sc.nextLine();
		sc.close();
		sc = new Scanner(sentence);
		
		while (sc.hasNext()) {
			word = sc.next();
			if (word.length() >= 3) {
				words.offer(word);
			}
		}
		
		while (!words.isEmpty()) {
			System.out.print(words.poll() + " ");
		}
		sc.close();
	}

}
