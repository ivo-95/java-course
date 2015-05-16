package homework5_5;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		double degreesC = 0, degreesF;
		Scanner sc = new Scanner(System.in, "UTF-8");
		Converter convert = new Converter();
		
		System.out.print("Enter degrees (°C): ");
		degreesC = sc.nextDouble();
		System.out.println("°F: " + convert.toFahrenheit(degreesC));
		
		System.out.print("Enter degrees (°F): ");
		sc.nextLine();
		degreesF = sc.nextDouble();
		System.out.println("°C: " + convert.toCelsius(degreesF));
		
		sc.close();
	}

}
