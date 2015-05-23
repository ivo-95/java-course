package homework7_7;

public class Main {

	public static void main(String[] args) {
		printSymmetric();
	}
	
	public static final void printSymmetric() {
		String num = null;
		for (int i = 10; i <= 999; i++) {
			num = Integer.toString(i);
			if (num.length() == 2) {
				if (num.charAt(0) == num.charAt(1)) {
					System.out.println(num);
					continue;
				}
			}
			if (num.length() == 3) {
				if (num.charAt(0) == num.charAt(2)) {
					System.out.println(num);
				}
			}
		}
	}

}
