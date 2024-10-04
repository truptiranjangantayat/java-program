package classworks;

import java.util.Scanner;

public class A2Q14 {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter salary:");
		double salary = ob.nextDouble();
		double DA = (double)40/100;
		double HRA = (double)20/100;
		
		double gross= salary+ salary*DA + salary*HRA ;
		System.out.println("Gross Salary: "+gross);
		ob.close();
	}

}
