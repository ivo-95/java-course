package homework8;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in, "UTF-8");
		String word = null;
		
		System.out.print("Enter a word: ");
		word = sc.nextLine();
		StringBuilder strb = new StringBuilder(word);
		strb.reverse();
		System.out.println("Your word backwards: " + strb.toString());
		
		sc.close();
	}

}
