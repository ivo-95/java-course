package homework5_3;

public class SUV extends Car {

	private boolean offroad;
	
	public SUV() {}
	
	public SUV(double price, boolean offroad) {
		super(price);
		setOffroad(offroad);
	}
	
	public boolean getOffroad() {
		return offroad;
	}
	
	public void setOffroad(boolean offroad) {
		this.offroad = offroad;
	}
}
