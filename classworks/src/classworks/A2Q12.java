package classworks;

import java.util.Scanner;

public class A2Q12 {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter a number:");
		int x = ob.nextInt();
		int square= x*x;
		
		System.out.println("Number="+x+"    "+"Square of Number="+square);
		ob.close();
	}

}
