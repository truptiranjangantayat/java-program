package classworks;

import java.util.Scanner;

public class A3Q9 {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("x:");
		double x = ob.nextDouble();
		System.out.println("y:");
		double y = ob.nextDouble();
		
		if(x>0 && y>0) {
			System.out.println("("+x+", "+y+"):"+"I Quadrant");
		}
		else if(x<0 && y<0) {
			System.out.println("("+x+", "+y+"):"+"III Quadrant");
		}
		else if(x>0 && y<0) {
			System.out.println("("+x+", "+y+"):"+"IV Quadrant");
		}
		else if(x<0 && y>0) {
			System.out.println("("+x+", "+y+"):"+"II Quadrant");
		}
		else if(x==0 && (y<0 || y>0)) {
			System.out.println("("+x+", "+y+"):"+"on y-axis");
		}
		else if((x<0 || x>0) && y==0) {
			System.out.println("("+x+", "+y+"):"+"on x  -axis");
		}
		else {
			System.out.println("("+x+", "+y+"):"+"on origin");
		}
		
		ob.close();
	}

}
