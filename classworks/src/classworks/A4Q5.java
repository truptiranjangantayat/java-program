package classworks;

import java.util.Scanner;

public class A4Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter num: ");
		double x= sc.nextDouble();
		
		for (double i = -2; i <= x; i=i+0.5) {
			System.out.println(i);
		}
		sc.close();
	}

}