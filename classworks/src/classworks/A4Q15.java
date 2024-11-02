package classworks;

import java.util.Scanner;

public class A4Q15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row: ");
		int row = sc.nextInt();
		System.out.println("Enter col: ");
		int col = sc.nextInt();
		
		 for(int i =1; i <= row; i++) {
			 for(int j=1; j <= col; j++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		 sc.close();

	}

}
