package homework11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task1 {

	public static void main(String[] args) {
		String text = null;
		
		try {
			text = readFile("task1_read.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		try {
			writeFile("task1_write.txt", text);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	private static String readFile(String fileName) throws FileNotFoundException, IOException {
		FileReader file = new FileReader(fileName);
		BufferedReader reader = new BufferedReader(file);
		StringBuilder strb = new StringBuilder();
		while (reader.ready()) {
			strb.append(reader.readLine());
		}
		reader.close();
		file.close();
		return strb.toString();
	}
	
	private static void writeFile(String fileName, String text) throws FileNotFoundException, IOException {
		FileWriter file = new FileWriter(fileName);
		BufferedWriter writer = new BufferedWriter(file);
		
		writer.write(text);
		writer.close();
		file.close();
	}
}
