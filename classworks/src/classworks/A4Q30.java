package classworks;

import java.util.Scanner;

public class A4Q30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a positive integer: ");
		int n = sc.nextInt();
		
		String s = Integer.toBinaryString(n);
		System.out.println("Binary representation of " + n +" is: " + s);
		sc.close();
	}

}
