package homework7_4;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in, "UTF-8");
		String name = null;
		
		System.out.print("Enter your name: ");
		name = sc.nextLine();
		greet(name);
	}
	
	public static final void greet(String name) {
		System.out.println("Greetings, " + name + "!");
	}

}
