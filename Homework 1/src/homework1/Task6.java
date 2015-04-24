package homework1;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		double rad = 0;
		Scanner sc = new Scanner(System.in, "UTF-8");
		
		System.out.print("r = ");
		rad = sc.nextDouble();
		
		System.out.println("Perimeter = " + (2 * Math.PI * rad));
		System.out.println("Area = " + (Math.PI * Math.pow(rad, 2)));
		
		sc.close();
	}

}
