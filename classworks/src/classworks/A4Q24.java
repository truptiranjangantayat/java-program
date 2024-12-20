package classworks;

import java.util.Scanner;

public class A4Q24 {


	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter the value of x: ");
	        double x = sc.nextDouble();
	        
	        double term = x; 
	        double sinX = x;
	        int n = 1; 
	        boolean add = false; 
	        
	        while (Math.abs(term) >= 1e-6) {
	            n += 2; 
	            term = term * (-x * x) / (n * (n - 1));
	            
	            if (add) {
	                sinX += term;
	            } else {
	                sinX -= term; 
	            }
	            
	            add = !add;
	        }
	        
	        System.out.println("sin(" + x + ") = " + sinX);
	        sc.close();
	}

}
