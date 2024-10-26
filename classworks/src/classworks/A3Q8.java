package classworks;

import java.util.Scanner;

public class A3Q8 {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter Rahul age:");
		int rage= ob.nextInt();
		
		System.out.println("Enter Ayush age:");
		int ayage= ob.nextInt();
		
		System.out.println("Enter Ajay age:");
		int ajage = ob.nextInt();
		
		if (rage<ajage && rage<ayage) {
			System.out.println("Rahul is youngest.!");
		}
		else if (ajage<rage && ajage<ayage) {
			System.out.println("Ajay is youngest.!");
		}
		else if (ayage<rage && ayage<ajage) {
			System.out.println("Ayush is youngest.!");
		}
		else {
			System.out.println("all have equal age.!");
		}
		ob.close();

	}

}
