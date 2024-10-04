package classworks;

import java.util.Scanner;

public class A3Q3 {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter the num:");
		int num = ob.nextInt();
		
		if (num%2 == 0) {
			System.out.println("num is even.");
		}
		else {
			System.out.println("num is odd.");
		}
		ob.close();
	}


}


