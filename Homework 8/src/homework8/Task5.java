package homework8;

import java.util.Scanner;
import java.util.regex.*;

public class Task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in, "UTF-8");
		String word = null, text = null;
		int count = 0;
		Pattern pattern = null;
		Matcher matcher = null;
		
		System.out.print("Enter some text: ");
		text = sc.nextLine();
		System.out.print("Enter a word: ");
		word = sc.nextLine();
		
		pattern = Pattern.compile(word, Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher(text);
		while(matcher.find()) {
			count++;
		}
		
		System.out.println("Count: " + count);
		sc.close();
	}

}
