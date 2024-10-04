package classworks;

import java.util.Scanner;

public class A3Q6 {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter the characters:");
		char ch = ob.next().charAt(0);
		int c = ch;
		
		if (c>= 65 && c<= 90) {
			System.out.println("Capital case letter.");
		}
		else if(c>=97 && c<=122) {
			System.out.println("Small case letter.");
		}
		else if(c>=48 && c<=57) {
			System.out.println("digit.");
		}
		else if((c>=0 && c<=47) || (c>=58 && c<=64) || (c>=91 && c<=96) || (c>=123 && c<=127)) {
			System.out.println("special symbol");
		}
		else {
			System.out.println("not a character!");
		}
		ob.close();
	}

}
