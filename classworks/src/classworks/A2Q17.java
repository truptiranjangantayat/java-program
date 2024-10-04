package classworks;

import java.util.Scanner;

public class A2Q17 {

	public static void main(String[] args) {
		Scanner ob= new Scanner(System.in);
		
		System.out.println("no. of 25 paisa coin:");
		int p25 = ob.nextInt();
		
		System.out.println("no. of 50 paisa coin:");
		int p50 = ob.nextInt();
		
		System.out.println("no. of 1 rupee coin:");
		int rs1= ob.nextInt();
		
		double amount= (p25*0.25)+(p50*0.50)+rs1;
		System.out.println("Total amount:"+amount);
		
		ob.close();

	}

}
