package homework9_6;

public class Phone extends Device {

	public Phone() {
		super();
	}
	
	public Phone(String brand, String model) {
		super(brand, model);
	}
	
	public void getInfo() {
		System.out.println("Brand: " + this.getBrand() + "; Model: " + this.getModel());
		System.out.println("This is a phone.");
	}
}
