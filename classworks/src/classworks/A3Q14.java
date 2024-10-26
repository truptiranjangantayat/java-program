package classworks;

import java.util.Scanner;

public class A3Q14 {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter the length of triangle side AB: ");
		double AB= ob.nextDouble();
		
		System.out.println("Enter the length of triangle side AC: ");
		double AC= ob.nextDouble();
		
		System.out.println("Enter the length of triangle side BC: ");
		double BC= ob.nextDouble();
		
		if(AB == BC && AB == AC) {
			System.out.println("Regular Triangle");
		}
		else if(AB == BC || AB == AC || BC == AC) {
			System.out.println("Symmetric Triangle");
		}
		else {
			System.out.println("irregular Triangle");
		}
		ob.close();

	}

}
