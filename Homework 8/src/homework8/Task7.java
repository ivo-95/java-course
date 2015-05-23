package homework8;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in, "UTF-8");
		String text = null;
		int count = 0;
		
		System.out.print("Enter some math text: ");
		text = sc.nextLine();

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == '(') {
				count++;
			} else {
				if (text.charAt(i) == ')') {
					count--;
				}
			}
		}
		
		System.out.println("You entered:\n" + text);
		System.out.println("\nMisplaced priority brackets - " + (count != 0));
		sc.close();
	}

}
