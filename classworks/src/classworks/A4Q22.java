package classworks;

import java.util.Scanner;

public class A4Q22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter term: ");
		int n = sc.nextInt();
		int fact = 1;
		
		for(int i =0; i <= n; i++) {
			if (i ==0) {
				fact =1;
			}
			else {
				fact = fact*i;
			}
		}
		System.out.println("factorial of "+n+"th term: "+fact);
		sc.close();
	}

}
