package classworks;

import java.util.Scanner;

public class A4Q19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of num: ");
		int n =sc.nextInt();
		double sum =0;
		
		System.out.println("Enter the num: ");
		for(int i=1; i<=n; i++) {
			double num = sc.nextDouble();
			sum+=num;
		}
		
		double avg = (n>0)? sum/n : 0;
		
		System.out.println("Sum: "+sum);
		System.out.println("Average: "+avg);
		
		sc.close();
	}
}
