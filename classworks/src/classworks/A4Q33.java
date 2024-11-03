package classworks;

import java.util.Scanner;

public class A4Q33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter terms: ");
		int n = sc.nextInt();
		int fact=1;
		int sum=0;
		
		for(int j =0; j<=n; j++) {
					
			for(int i =0; i <= j; i++) {
				if (i ==0) {
					fact =1;
				}
				else {
					fact = fact*i;
				}
			}
			sum=sum+fact;
			
		}
		System.out.println("value: "+sum);
		sc.close();
	}

}
