package homework5_3;

public class BubbleSort {
	
	private boolean flag;
	private double temp;
	
	public BubbleSort() {
		flag = true;
	}

	public Car[] sort(Car[] cars) {
		while (flag) {
			flag = false;
			for (int i = 0; i < cars.length - 1; i++) {
				if (cars[i].getPrice() > cars[i + 1].getPrice()) {
					temp = cars[i].getPrice();
					cars[i].setPrice(cars[i + 1].getPrice());
					cars[i + 1].setPrice(temp);
					flag = true;
				}
			}
		}
		
		return cars;
	}
}
