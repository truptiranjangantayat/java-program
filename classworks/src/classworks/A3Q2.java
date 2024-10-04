package classworks;

import java.util.Scanner;

public class A3Q2 {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter the marks:");
		int marks = ob.nextInt();
		
		if (marks >= 40) {
			System.out.println("congratulation! You have passed the exam.");
		}
		else {
			System.out.println("Sorry! You have failed the exam.");
		}
		ob.close();
	}

}


