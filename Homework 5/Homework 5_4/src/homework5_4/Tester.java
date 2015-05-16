package homework5_4;

public class Tester {

	public static void main(String[] args) {
		Shop shop = new Shop();
		Stock[] stock = new Stock[10];
		Stock[] stock2 = new Stock[10];
		
		for (int i = 0; i < 2; i++) {
			stock[i] = new Meat(5 + i, true, true, 800);
		}
		
		for (int i = 2; i < 4; i++) {
			stock[i] = new Vegetables(5 + i, true, true, 800);
		}
		
		for (int i = 4; i < 6; i++) {
			stock[i] = new Fruits(5 + i, true, true, 800);
		}
		
		for (int i = 6; i < 8; i++) {
			stock[i] = new Dessert(5 + i, true, true, 800);
		}
		
		for (int i = 8; i < 10; i++) {
			stock[i] = new Beverage(5 + i, true, true, 800);
		}
		
		// Initialize shop fields
		shop.setName("My shop");
		shop.setLocation("Mladost 1");
		shop.setStock(stock);
		
		// Change product availability
		for (int i = 0; i < 10; i++) {
			shop.removeProduct(stock[i]);
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Price: " + stock[i].getPrice() + "\tAvailable: " + stock[i].getAvailable());
		}
		
		System.out.println();
		for (int i = 0; i < 10; i++) {
			shop.addProduct(stock[i]);
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Price: " + stock[i].getPrice() + "\tAvailable: " + stock[i].getAvailable());
		}
		
	}

}
