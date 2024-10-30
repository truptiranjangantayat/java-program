package miss_que;

public class Book {
	String title;
	String author;
	double price;
	
	public Book(String title, String author) {
		this.title = title;
		this.author= author;
	}
	public void setPrice(double price) {
		this.price =price;
		this.showDetails();
	}
	public void showDetails() {
		System.out.println("Book: "+title);
		System.out.println("Author: "+author);
		System.out.println("Price: "+price);
	}
	
}
