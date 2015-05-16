package homework5_4;

public class Fruits extends Stock {

	private boolean fresh;
	private double weight;
	
public Fruits() {}
	
	public Fruits(double price, boolean available, boolean fresh, double weight) {
		super(price, available);
		setFresh(fresh);
		setWeight(weight);
	}
	
	public boolean getFresh() {
		return fresh;
	}
	
	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
}
