package classworks;

import java.util.Scanner;

public class A4Q25 {

	public static void main(String[] args) {
		{
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter the value of x: ");
	        double x = sc.nextDouble();
	        
	        double term = 1.0;
	        double cosX = term;
	        int n = 0;
	        boolean add = false;
	        
	        while (Math.abs(term) >= 1e-6) {
	            n += 2;
	            term = term * (-x * x) / (n * (n - 1));
	            
	            if (add) {
	                cosX += term;
	            } else {
	                cosX -= term;
	            }
	            
	            add = !add;
	        }
	        
	        System.out.println("cos(" + x + ") = " + cosX);
	        
	        sc.close();

		}
	}
}
