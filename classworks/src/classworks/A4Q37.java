package classworks;

import java.util.Scanner;

public class A4Q37 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer: ");
		int x= sc.nextInt();
		int sum =0;
		
		while (x%10 != 0) {
			int temp = x%10;
			sum= sum+temp;
			x = x/10;
		}
		System.out.println("the sum of digits in the integer: "+sum);
		sc.close();

	}

}
