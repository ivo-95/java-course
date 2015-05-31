package homework9_1;

import java.util.HashSet;

public class Tester {

	public static void main(String[] args) {
		HashSet<Town> towns = new HashSet<Town>();

		for (int i = 0; i < 5; i++) {
			towns.add(new Town("Town " + Integer.toString(i), "Country", (100 + i) * (i + 1)));
		}

		Town varna = new Town("Varna", "Bulgaria", 330000);
		towns.add(varna);
		System.out.println("Contains \"Varna\": " + towns.contains(varna));
		towns.remove(varna);
		System.out.println("Contains \"Varna\": " + towns.contains(varna));
	}

}
