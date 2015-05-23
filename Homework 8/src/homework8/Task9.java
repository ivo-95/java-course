package homework8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Task9 {

	
	
	public static void main(String[] args) {
		String[] text = null;
		String path = null;
		
		System.out.println("Choose a file to read from:");
		path = openFile();
		try {
			text = readFile(path);
		} catch (IOException e) {
			System.err.println("Error reading from file.");
			e.printStackTrace();
		}
		
		System.out.println("Choose the first file to save to:");
		path = saveFile();
		try {
			writeFileOdd(text, path);
		} catch (IOException e) {
			System.err.println("Error writing to file.");
			e.printStackTrace();
		}
		
		System.out.println("Choose the second file to save to:");
		path = saveFile();
		try {
			writeFileOdd(text, path);
		} catch (IOException e) {
			System.err.println("Error writing to file.");
			e.printStackTrace();
		}
	}

	public static final String[] readFile(String path) throws IOException {
		String[] text = null;
		FileReader file = new FileReader(path);
		BufferedReader reader = new BufferedReader(file);
		int len = 0, i = 0;
		
		while (reader.readLine() != null) {
			len++;
		}
		
		reader.close();
		file.close();
		file = new FileReader(path);
		reader = new BufferedReader(file);
		
		text = new String[len];
		while (reader.ready()) {
			text[i] = reader.readLine();
			i++;
		}
		
		reader.close();
		file.close();
		return text;
	}
	
	public static final void writeFileOdd(String[] text, String path) throws IOException {
		FileWriter file = new FileWriter(path);
		BufferedWriter writer = new BufferedWriter(file);
		
		writer.write("--------------Odd lines--------------");
		writer.newLine();
		
		for (int i = 0; i < text.length; i++) {
			if (i % 2 == 0) {
				writer.write(text[i]);
				writer.newLine();
			}
		}
		System.out.println("Done writing!");
		
		writer.close();
		file.close();
	}
	
	public static final void writeFileEven(String[] text, String path) throws IOException {
		FileWriter file = new FileWriter(path);
		BufferedWriter writer = new BufferedWriter(file);
		
		writer.write("--------------Even lines--------------");
		writer.newLine();
		
		for (int i = 0; i < text.length; i++) {
			if (i % 2 != 0) {
				writer.write(text[i]);
				writer.newLine();
			}
		}
		System.out.println("Done writing!");
		
		writer.close();
		file.close();
	}
	
	public static final String openFile() {
		final JFileChooser fc = new JFileChooser(System.getProperty("user.dir"));
		fc.setFileFilter(new FileNameExtensionFilter("Text Files", "txt"));
		int retValue = fc.showOpenDialog(fc);
		
		if (retValue == JFileChooser.APPROVE_OPTION) {
			File file = fc.getSelectedFile();
			return file.getName();
		} else {
			return null;
		}
	}
	
	public static final String saveFile() {
		final JFileChooser fc = new JFileChooser(System.getProperty("user.dir"));
		fc.setFileFilter(new FileNameExtensionFilter("Text Files", "txt"));
		int retValue = fc.showSaveDialog(fc);
		
		if (retValue == JFileChooser.APPROVE_OPTION) {
			File file = fc.getSelectedFile();
			if (file.getName().endsWith(".txt")) {
				return file.getName();
			} else {
				return file.getName() + ".txt";
			}
		} else {
			return null;
		}
	}
}
