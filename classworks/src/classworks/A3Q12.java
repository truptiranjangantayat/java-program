package classworks;

import java.util.Scanner;

public class A3Q12 {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter year of birth: ");
		int year = ob.nextInt();
		
		if(year<1966) {
			System.out.println("O");
		}
		else if (year>=1966 && year<=1980) {
			System.out.println("x");
		}
		else if (year>=1981 && year<=1999) {
			System.out.println("y");
		}
		else if (year>=2000 && year<=2012) {
			System.out.println("Z");
		}
		else {
			System.out.println("k");
		}
		ob.close();
	}

}
