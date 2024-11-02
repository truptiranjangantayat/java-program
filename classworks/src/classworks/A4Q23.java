package classworks;

import java.util.Scanner;

public class A4Q23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		System.out.println("Enter x: ");
		int x = sc.nextInt();
		int fact = 1;
		
		for(int i =0; i <= n; i++) {
			if (i ==0) {
				fact =1;
			}
			else {
				fact = fact*i;
			}
		}
		System.out.println("Value: "+(int)Math.pow(x, n)/fact);
		sc.close();
	}
	

}
