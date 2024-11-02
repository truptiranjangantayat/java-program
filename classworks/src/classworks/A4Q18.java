package classworks;

import java.util.Scanner;

public class A4Q18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		
		for(int i =0; i <= n; i++) {
			System.out.println(i+"\t"+(int)Math.pow(2, i));
		}
		sc.close();

	}

}
