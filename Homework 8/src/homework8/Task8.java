package homework8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task8 {

	public static void main(String[] args) {
		StringBuilder text = null;
		String[] words = null;
		
		try {
			text = readFile("task8_read.txt");
		} catch (IOException e) {
			System.err.println("Error reading from file.");
			e.printStackTrace();
		}
		
		words = text.toString().replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
		try {
			writeFile(words, "task8_write.txt");
		} catch (IOException e) {
			System.err.println("Error writing to file.");
			e.printStackTrace();
		}
	}

	public static final StringBuilder readFile(String path) throws IOException {
		StringBuilder text = new StringBuilder();
		FileReader file = new FileReader(path);
		BufferedReader reader = new BufferedReader(file);
		
		while (reader.ready()) {
			text.append(reader.readLine());
		}
		
		reader.close();
		file.close();
		return text;
	}
	
	public static final void writeFile(String[] text, String path) throws IOException {
		FileWriter file = new FileWriter(path);
		BufferedWriter writer = new BufferedWriter(file);
		
		for (int i = 0; i < text.length; i++) {
			writer.write(text[i]);
		}
		System.out.println("Done writing!");
		
		writer.close();
		file.close();
	}
}
