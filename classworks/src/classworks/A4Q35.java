package classworks;

import java.util.Scanner;

public class A4Q35 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter term: ");
		int n = sc.nextInt();
		
		System.out.print("Sequence: ");
		int frist = 0;
		System.out.print(frist+" ");
		int second= 1;
		System.out.print(second+" ");
		int third= 1;
		System.out.print(third+" ");
		int fourth;
		
		for(int i=4; i <= n; i++) {
			fourth = frist+second+third;
			System.out.print(fourth+" ");
			
			frist=second;
			second=third;
			third=fourth;
		}
		System.out.println(".....");
		sc.close();

	}

}
