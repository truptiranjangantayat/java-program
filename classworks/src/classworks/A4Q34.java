package classworks;

import java.util.Scanner;

public class A4Q34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter term: ");
		int n = sc.nextInt();
		
		System.out.print("Lucas sequence: ");
		int frist = 1;
		System.out.print(frist+" ");
		int second= 3;
		System.out.print(second+" ");
		int third;
		
		for(int i=3; i <= n; i++) {
			third = frist+second;
			System.out.print(third+" ");
			frist=second;
			second=third;
		}
		System.out.println(".....");
		sc.close();
	}

}
