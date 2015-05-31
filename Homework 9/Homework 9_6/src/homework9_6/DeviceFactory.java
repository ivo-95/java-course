package homework9_6;

public class DeviceFactory {

	private static DeviceFactory instance = new DeviceFactory();
	
	private DeviceFactory() {}
	
	public static DeviceFactory getInstance() {
		return instance;
	}
	
	public static Device getDevice(String device) {
		if (device.equalsIgnoreCase("phone")) {
			return new Phone();
		} else if (device.equalsIgnoreCase("tablet")) {
			return new Tablet();
		} else if (device.equalsIgnoreCase("laptop")) {
			return new Laptop();
		} else {
			return null;
		}
	}
}
