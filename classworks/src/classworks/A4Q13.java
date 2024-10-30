package classworks;

import java.util.Scanner;

public class A4Q13 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		int sum = 0;
		
		while (n%10 != 0) {
			int num = n%10;
			sum = sum+num;
			n= n/10;
			
		}
		if (sum%9 == 0) {
			System.out.println("Divisible by 9.");
		}
		else {
			System.out.println("not divisible by 9.");
		}
		sc.close();

	}

}
