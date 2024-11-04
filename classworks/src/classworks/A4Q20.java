package classworks;

import java.util.Scanner;

public class A4Q20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of num: ");
		int n = sc.nextInt();
		
		double sum =0;
		System.out.println("Enter num: ");
		for(int i=1; i <= n; i++) {
			double num = sc.nextDouble();
			sum+=1/num;
		}
		double H = n/sum;
		System.out.println("Harmonic mean: "+H);
		sc.close();
	}

}
