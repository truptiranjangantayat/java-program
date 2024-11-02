package classworks;

import java.util.Scanner;

public class A4Q16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of rows: ");
		int n = sc.nextInt();
		
//		*
//		**
//		***
//		****
		for(int i =1; i <= n; i++) {
			for(int j=1; j <= i; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		
//		1
//		12
//		123
//		1234
//		12345
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
//		1
//		22
//		333
//		4444
//		55555
		for(int i = 1; i <= n; i++) {
			for(int j =1; j <= i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		
		
//		1 
//		2 3 
//		4 5 6 
//		7 8 9 10 
//		11 12 13 14 15 
		int count=1;
		for(int i = 1; i <= n; i++ ) {
			for(int j =1; j <= i; j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
		
		sc.close();

	}

}
