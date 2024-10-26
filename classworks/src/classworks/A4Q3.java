package classworks;

import java.util.Scanner;

public class A4Q3 {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.print("count to:");
		int x= ob.nextInt();
		 for (int i = 0; i <= x; i++) {
			System.out.println(i);
		}
		ob.close();

	}

}
