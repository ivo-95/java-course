package homework5_3;

import java.util.Random;

public class Tester {

	public static void main(String[] args) {
		Car[] cars = new Car[10];
		Random r = new Random();
		BubbleSort sort = new BubbleSort();
		double randomPrice = 0, randomFuelCons = 0;
		
		for (int i = 0; i < 5; i++) {
			randomPrice = 30000 * r.nextDouble();
			randomFuelCons = 10 * r.nextDouble();
			cars[i] = new Automobile(randomPrice, randomFuelCons);
		}
		
		for (int i = 5; i < 10; i++) {
			randomPrice = 30000 * r.nextDouble();
			cars[i] = new SUV(randomPrice, r.nextBoolean());
		}
		
		System.out.println("All cars:");
		for (int i = 0; i < cars.length; i++) {
			System.out.println("Car " + (i + 1) + ": price = " + cars[i].getPrice());
		}
		
		sort.sort(cars);
		System.out.println("\nCars sorted by price:");
		for (int i = 0; i < cars.length; i++) {
			System.out.println("Car " + (i + 1) + ": price = " + cars[i].getPrice());
		}
	}

}
