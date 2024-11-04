package classworks;

import java.util.Scanner;

public class A4Q36 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer: ");
		int x= sc.nextInt();
		int count =0;
		
		while (x%10 != 0) {
			count++;
			x = x/10;
		}
		System.out.println("the no of digits in the integer: "+count);
		sc.close();

	}

}
