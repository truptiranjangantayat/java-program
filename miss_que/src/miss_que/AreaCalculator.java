package miss_que;

public class AreaCalculator {
	public void  calculateArea (double radius) {
		System.out.println("Area of circle: "+Math.PI*radius*radius);
	}
	public void  calculateArea (double length, double width) {
		System.out.println("Area of rectangle: "+length*width);	
		}
	public void  calculateArea (float base, float height) {
		System.out.println("Area of tringle: "+base*height/2);	
		}
}
