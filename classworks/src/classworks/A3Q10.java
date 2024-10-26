package classworks;

import java.util.Scanner;

public class A3Q10 {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter a:");
		double a = ob.nextDouble();
		
		System.out.println("Enter b:");
		double b = ob.nextDouble();
		
		System.out.println("Enter c:");
		double c = ob.nextDouble();
		
		if (a == 0) {
			if (b != 0) {
				double root = -c/b;
				System.out.println("Equation root: "+root);
			}
			else {
				System.out.println("no solution, a and b both can't be zero.");
			}
		}
		else {
			double discriminant = (b*b)-4*a*c;
			
			if (discriminant>0) {
				double root1 = (-b+Math.sqrt(discriminant))/(2*a);
				double root2 = (-b-Math.sqrt(discriminant))/(2*a);
				
				System.out.println("Roots are real and different.");
				System.out.println("root 1: "+root1);
				System.out.println("root 2: "+root2);
			}
			else if(discriminant == 0) {
				double root = -b/(2*a);
				System.out.println("Roots are real and same.");
				System.out.println("root: "+root);
			}
			else {
				System.out.println("No real roots, discriminant is -ev.");
			}
		}
		ob.close();

	}

}
