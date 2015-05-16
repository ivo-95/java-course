package homework5_4;

public class Meat extends Stock {

	private boolean cooked;
	private double weight;
	
	public Meat() {}
	
	public Meat(double price, boolean available, boolean cooked, double weight) {
		super(price, available);
		setCooked(cooked);
		setWeight(weight);
	}
	
	public boolean getCooked() {
		return cooked;
	}
	
	public void setCooked(boolean cooked) {
		this.cooked = cooked;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
}
