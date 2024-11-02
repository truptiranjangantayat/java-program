package classworks;

import java.util.Scanner;

public class A4Q21 {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter num: ");
		int n = sc.nextInt();
		int sum =0;
		int sign = 1;
		
		 for(int i=1; i <= n; i++) {
			 if(i%2 != 0) {
				 sum= sum+sign*i;
				 sign = -sign;
			 }
		 }
		 System.out.println("Sum of series: "+sum);

	}

}
