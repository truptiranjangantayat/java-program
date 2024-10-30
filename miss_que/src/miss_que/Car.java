package miss_que;


public class Car {
	String model;
	int make_year;
	double price_after_discount;
	
	public Car(String model, int make_year) {
		this.model = model;
		this.make_year = make_year;
	}
	
	public void calculatePrice(float original_price, float discount_percentage) {
		price_after_discount = original_price - ((discount_percentage/100)*original_price);
	}
	public void dispaly() {
		System.out.println("Car: "+model);
		System.out.println("Year of lunch: "+make_year);
		System.out.println("Final Price: "+price_after_discount);
	}
}
