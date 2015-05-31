package homework9_6;

public class Laptop extends Device {

	public Laptop() {
		super();
	}
	
	public Laptop(String brand, String model) {
		super(brand, model);
	}
	
	public void getInfo() {
		System.out.println("Brand: " + this.getBrand() + "; Model: " + this.getModel());
		System.out.println("This is a laptop.");
	}
}
