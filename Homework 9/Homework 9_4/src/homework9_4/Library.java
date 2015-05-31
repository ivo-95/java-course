package homework9_4;

import java.util.HashMap;

public class Library {

	private String name;
	private String address;
	private HashMap<Book, Integer> books;
	
	public Library() {}
	
	public Library(String name, String address) {
		setName(name);
		setAddress(address);
		books = new HashMap<Book, Integer>();
	}
	
	public Library(String name, String address, HashMap<Book, Integer> books) {
		setName(name);
		setAddress(address);
		setBooks(books);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public HashMap<Book, Integer> getBooks() {
		return books;
	}

	public void setBooks(HashMap<Book, Integer> books) {
		this.books = books;
	}
	
	public void addBook(Book book) {
		int count = 0;
		if (books.containsKey(book)) {
			count = books.get(book);
			count++;
			books.replace(book, count);
			System.out.println("Copy added.");
		} else {
			books.put(book, 1);
			System.out.println("Original added.");
		}
	}
	
	public void removeBook(Book book) {
		int count = 0;
		if (books.get(book) > 1) {
			count = books.get(book);
			count--;
			books.replace(book, count);
			System.out.println("Copy removed.");
		} else {
			books.remove(book);
			System.out.println("Original removed.");
		}
	}
	
	public void bookCount(Book book) {
		if (books.containsKey(book)) {
			System.out.println("Count: " + books.get(book));
		} else {
			System.out.println("Count: 0");
		}
	}
}
