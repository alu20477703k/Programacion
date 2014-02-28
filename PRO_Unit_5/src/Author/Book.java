package Author;
import java.util.*;

public class Book {

	private static String title;
	private Author author;
	private static double price;
	private static int qtyInStock;

	public Book(String newName, Author newAuthor, double newPrice) {

		title = newName;
		author = newAuthor;
		price = newPrice;

	}

	public Book(String newName, Author newAuthor, double newPrice,
			int newQtyInStock) {

		title = newName;
		author = newAuthor;
		price = newPrice;
		qtyInStock = newQtyInStock;

	}

	public String getName() {
		return title;
	}

	public Author getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQtyInStock() {
		return qtyInStock;
	}

	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}

	@Override
	public String toString() {
		return title + " by " + author;
	}

	public String getAuthorName() {
		return author.getName();
	}

	public String getAuthorEmail() {
		return author.getEmail();
	}

	public char getAuthorGnder() {
		return author.getGender();
	}

	public static Book inputBook() {

		Scanner inputValue = new Scanner(System.in);

		do {
			System.out.println("Title: ");
			title = inputValue.next();
		} while (title.isEmpty());

		System.out.println("Author");
		Author anAuthor = new Author("", "", 'a');
		anAuthor.inputAuthor();

		System.out.println("Price: ");

		do {
			price = inputValue.nextDouble();
		} while (price < 0);
		
		do {
			qtyInStock = inputValue.nextInt();
		}while(qtyInStock<0);

		return new Book(title,anAuthor,price,qtyInStock);

	}
}
