package miss_que;

public class Main {

	public static void main(String[] args) {
		
		//Loan info.
		Loan l1 = new Loan(60000, 2, 6);
		l1.calculateInterest();
		
		System.out.println();
		
		//Car info.
		Car c1 = new Car("BMW",2020 );
		c1.calculatePrice(8000000, 20);
		c1.dispaly();
		
		System.out.println();
		
		//Book info.
		Book b1 = new Book("I Found peace in Love", "Truptiranjan");
		b1.setPrice(220.50);
	}

}
