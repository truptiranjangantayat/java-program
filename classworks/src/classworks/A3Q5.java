package classworks;

import java.util.Scanner;

public class A3Q5 {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter the num:");
		double x = ob.nextDouble();
		double y = ob.nextDouble();
		
		if (x>0 && y<1) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		ob.close();
	}

}


