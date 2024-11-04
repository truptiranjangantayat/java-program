package classworks;

import java.util.Scanner;

public class A4Q38 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st: ");
		int x = sc.nextInt();
		
		System.out.println("enter 2nd: ");
		int y = sc.nextInt();
		
		
		
		while (y != 0) {
			int temp = y;
			y = x%y;
			x= temp;
		}
		int gcd=x;
		
		for(int i=2; i <= gcd; i++) {
			if(gcd%i== 0) {
				boolean isprime = true;
				for (int j = 2; j <= i/2; j++) {
					if(i%j == 0) { 
						isprime = false;
						break;
					}
					
				}
				
				if(isprime) {
					System.out.print(i+" ");
				}
				
			}
				
		}
			
		sc.close();	
		
		
	}
	
}


