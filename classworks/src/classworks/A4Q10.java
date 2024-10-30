package classworks;

import java.util.Scanner;

public class A4Q10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a no. for which you want to find the multiplication table: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			System.out.println(n+"x"+i+"="+n*i);
		}
		sc.close();

	}

}
