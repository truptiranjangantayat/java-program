package classworks;

import java.util.Scanner;

public class A4Q26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter term: ");
		int n= sc.nextInt();
		System.out.println("Enter x: ");
		int x=sc.nextInt();
		int fact = 1;
		double sum = 0;
		
		for(int j =0; j<=n; j++) {
			
			for(int i =0; i <= j; i++) {
				if (i ==0) {
					fact =1;
				}
				else {
					fact = fact*i;
				}
			}
			sum = sum+(Math.pow(x, j)/fact);
		}
		System.out.println("value: "+sum);
		sc.close();

	}

}
