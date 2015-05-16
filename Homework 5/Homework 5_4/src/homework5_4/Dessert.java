package homework5_4;

public class Dessert extends Stock {

	private boolean iceCream;
	private double weight;
	
	public Dessert() {}
	
	public Dessert(double price, boolean available, boolean iceCream, double weight) {
		super(price, available);
		setIceCream(iceCream);
		setWeight(weight);
	}
	
	public boolean getIceCream() {
		return iceCream;
	}
	
	public void setIceCream(boolean iceCream) {
		this.iceCream = iceCream;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
}
