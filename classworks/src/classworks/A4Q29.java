package classworks;

import java.util.Scanner;

public class A4Q29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter +ve integer: ");
		int n = sc.nextInt();
		int reverse=0;
		
		while (n%10 != 0) {
			int temp = n%10;
			reverse = (reverse*10)+temp;
			n = n/10;
		}
		System.out.println("reverse : "+reverse);
		sc.close();

	}

}
