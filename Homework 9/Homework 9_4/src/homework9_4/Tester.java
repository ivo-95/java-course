package homework9_4;

public class Tester {

	public static void main(String[] args) {
		Library library = new Library("Library", "London");
		Book book1 = new Book("book 1", "author 1", 300);
		library.addBook(book1);
		library.addBook(book1);
		library.addBook(book1);
		library.bookCount(book1);
		
		library.removeBook(book1);
		library.removeBook(book1);
		library.bookCount(book1);
		
		library.removeBook(book1);
		library.bookCount(book1);
	}

}
