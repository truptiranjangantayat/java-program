package classworks;

import java.util.Scanner;

public class A4Q28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter term: ");
		int n = sc.nextInt();
		
		int frist = 0;
		int second=1;
		System.out.print("Fibonacci Series is: ");
		if(n >=1)System.out.print(frist);
		if(n >=2)System.out.print(", "+second);
		int third;
		
		for(int i=3; i <= n; i++) {
			third = frist+second;
			System.out.print(", "+third);
			frist=second;
			second=third;
		}
		System.out.println();
		sc.close();

	}

}
