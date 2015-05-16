package homework5_3;

public class Automobile extends Car {

	private double fuelCons;
	
	public Automobile() {}
	
	public Automobile(double price, double fuelCons) {
		super(price);
		setFuelCons(fuelCons);
	}
	
	public double getFuelCons() {
		return fuelCons;
	}
	
	public void setFuelCons(double fuelCons) {
		this.fuelCons = fuelCons;
	}
}
