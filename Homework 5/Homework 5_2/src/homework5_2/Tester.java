package homework5_2;

public class Tester {

	public static void main(String[] args) {
		Cat[] cats = new Cat[10];
		
		for (int i = 0; i < cats.length; i++) {
			cats[i] = new Cat("Cat " + Integer.toString(i + 1), i + 1);
			cats[i].say();
		}
	}

}
