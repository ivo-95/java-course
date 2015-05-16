package homework5_4;

public class Beverage extends Stock {

	private boolean alcoholic;
	private double weight;
	
	public Beverage() {}
	
	public Beverage(double price, boolean available, boolean alcoholic, double weight) {
		super(price, available);
		setAlcoholic(alcoholic);
		setWeight(weight);
	}
	
	public boolean getAlcoholic() {
		return alcoholic;
	}
	
	public void setAlcoholic(boolean alcoholic) {
		this.alcoholic = alcoholic;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
}
