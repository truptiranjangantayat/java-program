package classworks;

import java.util.Scanner;

public class A4Q14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N: ");
		int N = sc.nextInt();
		int countpow = 1;
		
		while (countpow*2 <= N) {
			countpow*=2;
		}
		System.out.println("Largest power of two less than or equal to"+N+": "+countpow);
		sc.close();
	}

}
