import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		String[] decimals = { "", "ten ", "twenty ", "thirty ", "forty ",
				"fifty ", "sixty ", "seventy ", "eighty ", "ninety " };

		String[] numbers = { "", "one ", "two ", "three ", "four ", "five ",
				"six ", "seven ", "eight ", "nine ", "ten ", "eleven ",
				"twelve ", "thirteen ", "fourteen ", "fifteen ", "sixteen ",
				"seventeen ", "eighteen ", "nineteen " };
		
		String output = null;
		int a = 0;
		Scanner sc = new Scanner(System.in, "UTF-8");

		System.out.print("Enter a number (0-999): ");
		a = sc.nextInt();

		if (a < 0 || a > 999) {
			System.out.println("Incorrect input.");
			sc.close();
			return;
		}
		
		if (a == 0) {
			System.out.println("zero");
			sc.close();
			return;
		}
		
		if (a % 100 < 20) {
			output = numbers[a % 100];
			a /= 100;
		} else {
			output = numbers[a % 10];
			a /= 10;
			
			output = decimals[a % 10] + output;
			a /= 10;
		}
		
		if (a == 0) {
			System.out.println(output);
		} else {
			System.out.println(numbers[a] + "hundred " + output);
		}
		
		sc.close();
	}

}
