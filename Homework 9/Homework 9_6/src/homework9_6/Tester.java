package homework9_6;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in, "UTF-8");
		String str = null;
		Device device = null;
		
		System.out.print("Choose a device: ");
		str = sc.nextLine();
		device = DeviceFactory.getDevice(str);
		device.getInfo();
		
		sc.close();
	}

}
