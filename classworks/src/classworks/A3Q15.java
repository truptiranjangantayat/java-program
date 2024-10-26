package classworks;

import java.util.Scanner;

public class A3Q15 {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		
		System.out.print("What is your gender(M or F): ");
		char gender = ob.next().charAt(0);
		
		System.out.print("First name: ");
		String FirstName = ob.next();
		
		System.out.print("Last name: ");
		String lastNameString = ob.next();
		
		System.out.print("Age: ");
		int age = ob.nextInt();
		
		String designation = null;
		
		if (gender == 'F') {
			if (age>=20) {
				
				System.out.println("Are you married,"+FirstName+"(y or n)?");
				char married = ob.next().charAt(0);
				if (married == 'y') {
					designation = "Mrs.";
				}
				else {
					designation="Ms.";
				}
			}
		}
		else {
			if (age>=20) {
				designation ="Mr.";
			}
		}
		
		if(designation != null) {
			System.out.println("Then I shall call you "+designation+" "+FirstName+".");
			}
		else {
			System.out.println("Then I shall call you "+FirstName+" "+lastNameString+".");
		}
		
		ob.close();
	}

}
