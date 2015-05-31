package homework9_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Task9_3_3 {

	public static void main(String[] args) {
		HashSet<String> deck = new HashSet<String>();
		HashMap<String, Integer> userDeck = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in, "UTF-8");
		String card = null;
		
		populateSet(deck);
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter card: ");
			card = sc.nextLine();
			if (!deck.contains(card)) {
				System.out.println("Wrong input");
			} else {
				incrementCount(userDeck, card);
			}
		}
		printResult(userDeck);
		sc.close();
	}

	public static void populateSet(HashSet<String> deck) {
		for (int i = 2; i <= 10; i++) {
			deck.add(Integer.toString(i));
		}
		deck.add("J");
		deck.add("Q");
		deck.add("K");
		deck.add("A");
	}
	
	public static void incrementCount(HashMap<String, Integer> userDeck, String card) {
		if (userDeck.containsKey(card)) {
			int count = userDeck.get(card);
			count++;
			userDeck.replace(card, count);
		}
		else {
			userDeck.put(card, 1);
		}
	}
	
	public static void printResult(HashMap<String, Integer> userDeck) {
		System.out.println();
		int count = -1;
		for (Object key : userDeck.keySet()) {
			if (userDeck.get(key) > count) {
				count = userDeck.get(key);
			}
		}
		switch (count) {
		case 2:
			System.out.println("Pair.");
			break;
		case 3:
			System.out.println("Three of a kind");
			break;
		case 4:
			System.out.println("Four of a kind");
			break;
		default:
				System.out.println("You've got nothing :(");
		}
	}
}
