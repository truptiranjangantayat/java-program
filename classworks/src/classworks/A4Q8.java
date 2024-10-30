package classworks;

import java.util.Scanner;

public class A4Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of line: ");
		int n = sc.nextInt();
		String one = "1";
		System.out.println(one);
		
		for(int i=2; i<=n; i++) {
			one = one + i + one;
			System.out.println(one);
		}
		sc.close();

	}

}
