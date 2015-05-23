package homework8;

import java.io.*;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		String[] countries = null;
		String[] capitals = null;
		Scanner sc = new Scanner(System.in, "UTF-8");
		
		try {
			countries = readFile("Countries.txt");
		} catch (IOException e) {
			System.err.println("Error reading from file.");
			e.printStackTrace();
		}
		
		capitals = new String[5];
		for (int i = 0; i < countries.length; i++) {
			System.out.format("The capital of %s is: ", countries[i]);
			capitals[i] = sc.nextLine();
		}
		
		try {
			writeFile(capitals, "Cities.txt");
		} catch (IOException e) {
			System.err.println("Error writing to file.");
			e.printStackTrace();
		}
		
		sc.close();
	}

	public static final String[] readFile(String path) throws IOException {
		String[] text = new String[5];
		FileReader file = new FileReader(path);
		BufferedReader reader = new BufferedReader(file);
		int i = 0;
		
		while (reader.ready()) {
			text[i] = reader.readLine();
			i++;
		}
		
		reader.close();
		file.close();
		return text;
	}
	
	public static final void writeFile(String[] capitals, String path) throws IOException {
		FileWriter file = new FileWriter(path);
		BufferedWriter writer = new BufferedWriter(file);
		
		for (int i = 0; i < capitals.length; i++) {
			writer.write(capitals[i]);
			writer.newLine();
		}
		
		writer.close();
		file.close();
	}
}
