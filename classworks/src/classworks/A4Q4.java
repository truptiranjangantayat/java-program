package classworks;

import java.util.Scanner;

public class A4Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Count from: ");
		int x = sc.nextInt();
		System.out.print("Count to: ");
		int y= sc.nextInt();
		System.out.print("Count by: ");
		int z= sc.nextInt();
		
		for (int i = x; i <= y; i=i+z) {
			System.out.print(i+" ");
		}
		sc.close();
	}

}