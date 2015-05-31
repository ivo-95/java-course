package homework9_6;

public class Tablet extends Device {

	public Tablet() {
		super();
	}
	
	public Tablet(String brand, String model) {
		super(brand, model);
	}
	
	public void getInfo() {
		System.out.println("Brand: " + this.getBrand() + "; Model: " + this.getModel());
		System.out.println("This is a tablet.");
	}
}
