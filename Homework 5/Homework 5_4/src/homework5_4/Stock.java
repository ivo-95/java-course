package homework5_4;

public abstract class Stock {

	private double price;
	private boolean available;
	
	public Stock() {}
	
	public Stock(double price, boolean available) {
		setPrice(price);
		setAvailable(available);
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public boolean getAvailable() {
		return available;
	}
	
	public void setAvailable(boolean available) {
		this.available = available;
	}
}
