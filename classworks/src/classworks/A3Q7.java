package classworks;

import java.util.Scanner;

public class A3Q7 {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter x1 and y1:");
		System.out.println("x1:");
		double x1 = ob.nextDouble();
		System.out.println("y1:");
		double y1 = ob.nextDouble();
		
		System.out.println("Enter x2 and y2:");
		System.out.println("x2:");
		double x2 = ob.nextDouble();
		System.out.println("y2:");
		double y2 = ob.nextDouble();
		
		System.out.println("Enter x3 and y3:");
		System.out.println("x3:");
		double x3 = ob.nextDouble();
		System.out.println("y3:");
		double y3 = ob.nextDouble();
		
		//m1 is 1st slope of (x1,y1) and (x2,y2) 
		double m1 = (y2-y1)/(x2-x1);
		
		//m2 is 1st slope of (x2,y2) and (x3,y3) 
		double m2 = (y3-y2)/(x3-x2);
		
		//Three points are collinear if slope of one set of points = slope of other set of  points.
		if(m1 == m2) {
			System.out.println("Three points are collinear.");}
		
		else {
			System.out.println("not collinear.");}
		
		ob.close();
		}
	}


