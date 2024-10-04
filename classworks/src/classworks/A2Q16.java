package classworks;

import java.util.Scanner;

public class A2Q16 {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter height and breadth:");
		System.out.print("height:");
		float height = ob.nextFloat();
		System.out.print("breadth:");
		float breadth = ob.nextFloat();
		
		System.out.println();
		float area = height*breadth;
		float perimeter= 2*(height+breadth);
		
		System.out.println("Enter the radius of circle:");
		float radius = ob.nextFloat();
		final float PI = 3.14F;
		float cArea = PI*radius*radius;
		float cCircumference = 2*PI*radius;
		
		System.out.println("area of rectangle:"+area);
		System.out.println("perimeter of rectangle:"+perimeter);
		System.out.println();
		System.out.println("area of circle:"+cArea);
		System.out.println("Circumference of circle:"+cCircumference);
		
		ob.close();
	}

}
