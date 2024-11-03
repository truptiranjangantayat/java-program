 package classworks;

import java.util.Scanner;

public class A4Q32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1st integer: ");
		int x= sc.nextInt();
		int prx=x;
		System.out.println("2nd integer: ");
		int y = sc.nextInt();
		int pry=y;
	
		while (y != 0) {
			int temp =y;
			y = x%y;
			x =temp;
		}
		System.out.println("The GCD of " + prx + " and " + pry + " is: " + x);
		sc.close();
	}

}
