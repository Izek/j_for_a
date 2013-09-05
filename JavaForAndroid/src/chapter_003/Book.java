package chapter_003;

public class Book {

	private static int counter = 0;

	private final int ID = ++counter;

	private String name;
	private String author;
	private String isbn;

	Book(String name, String author, String isbn) {
		this.name = name;
		this.author = author;
		this.isbn = isbn;
	}

	public String getName() {
		return this.name;
	}

	public String getAuthor() {
		return this.author;
	}

	public String getISBN() {
		return this.isbn;
	}

	public int getID() {
		return this.ID;
	}

	public static void getBook(Book b) {
		System.out.println("Printing book info... ");
		System.out.println("Book's ID is : " + b.getID());
		System.out.println("Author: " + b.getAuthor());
		System.out.println("Name  : " + b.getName());
		System.out.println("ISBN  : " + b.getISBN());
	}

	public static void main(String[] args) {

		System.out.println("Creating a library...");
		System.out.println();

		Book[] library = {
				new Book("Alice in Wonderland", "Luis Carrol",
						"984-3-4848-6472-9"),
				new Book("Thinking in Java", "Bruce Eckel", "987-5-5484-7878-4"),
				new Book("Learn Java for Android Development", "Jeff Friesen",
						"978-1-4302-5722-6") };

		System.out.println();
		System.out.println("Library's content is...");

		for (int i = 0; i < library.length; i++) {
			System.out.println();
			getBook(library[i]);
			System.out.println();
		}

		System.out.println("EOL =)");
	}
}
