package homework11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task2 {

	public static void main(String[] args) {
		String text = null;
		
		try {
			text = readFile("task2_read.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (SentenceNotCompletedException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		if (text != null) {
			System.out.println(text);
		}
	}

	public static String readFile(String fileName) throws FileNotFoundException,
			IOException, SentenceNotCompletedException {
		FileReader file = new FileReader(fileName);
		BufferedReader reader = new BufferedReader(file);
		StringBuilder strb = new StringBuilder();
		String line = null;
		
		while (reader.ready()) {
			line = reader.readLine();
			if (line.endsWith(".")
					|| line.endsWith("!")
					|| line.endsWith("?")) {
				strb.append(line);
			} else {
				reader.close();
				file.close();
				throw new SentenceNotCompletedException("Incomplete sentence!");
			}
		}
		reader.close();
		file.close();
		return strb.toString();
	}
}
