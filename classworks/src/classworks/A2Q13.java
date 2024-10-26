package classworks;

import java.util.Scanner;

public class A2Q13 {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter age:");
		int age = ob.nextInt();
		
		System.out.println("Enter height:");
		float height= ob.nextFloat();
		
		System.out.println("Enter Weight");
		int weight= ob.nextInt();
		
		System.out.println("So, you're "+age+" years old, "+height+"\" tall and "+weight+"KG heavy.");
		ob.close();
	}

}
