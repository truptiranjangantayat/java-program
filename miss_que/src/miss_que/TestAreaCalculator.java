package miss_que;

public class TestAreaCalculator {

	public static void main(String[] args) {
		AreaCalculator circle1 = new AreaCalculator();
		circle1.calculateArea(6);
		
		AreaCalculator rectangle1 = new AreaCalculator();
		rectangle1.calculateArea(22.5,65.36);
		
		AreaCalculator triangle1 = new AreaCalculator();
		triangle1.calculateArea(6.22F,4.1F);

	}

}
