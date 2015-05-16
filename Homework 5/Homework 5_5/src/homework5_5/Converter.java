package homework5_5;

public class Converter {
	
	public Converter() {}
	
	public double toFahrenheit(double degreesC) {
		double degreesF = degreesC * 9;
		degreesF /= 5;
		degreesF += 32;
		return degreesF;
	}
	
	public double toCelsius(double degreesF) {
		double degreesC = degreesF - 32;
		degreesC *= 5;
		degreesC /= 9;
		return degreesC;
	}
}
