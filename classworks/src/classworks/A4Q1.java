package classworks;

import java.util.Scanner;

public class A4Q1 {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("enter the word:");
		String word= ob.next();
		System.out.print("enter the no. of word :");
		int x = ob.nextInt();
		
		if(x<1000) {
			for(int i=1; i<=x; i++ ) {
				if (i%10==1 || i%100==1) {
					System.out.println(i+"st "+word);
				}
				else if (i%10==2 || i%100==2) {
					System.out.println(i+"nd "+word);
				}
				else if (i%10==3 || i%100==3) {
					System.out.println(i+"rd "+word);
				}
				else {
					System.out.println(i+"th "+word);
				}
			}
		}
		else {
			System.out.println("Invalid no.!");
		}
		ob.close();
	}

}