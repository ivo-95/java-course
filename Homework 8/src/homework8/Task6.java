package homework8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in, "UTF-8");
		String word = null, text = null, regex = null;
		Pattern pattern = null;
		Matcher matcher = null;
		
		System.out.print("Enter some text: ");
		text = sc.nextLine();
		System.out.print("Enter a word: ");
		word = sc.nextLine();
		
		regex = "([A-Z][^.?!]*?)?(?<!\\w)(?i)(" + word + "|" + word + "s)(?!\\w)[^.?!]*?[.?!]{1,2}\"?";
		pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher(text);
		
		while(matcher.find()) {
			System.out.println(matcher.group());
			
		}
		
		sc.close();
	}

}
