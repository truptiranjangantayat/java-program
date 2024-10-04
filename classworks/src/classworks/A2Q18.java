package classworks;
import java.util.Scanner;

public class A2Q18 {

	public static void main(String[] args) {
		 Scanner ob = new Scanner(System.in);
		 
		 System.out.print("Enter the no. of eggs:");
	     int eggs = ob.nextInt();
	     
	     int gross = eggs / 144;
	     int remainingEggs = eggs % 144;
         int dozen = remainingEggs / 12;
         int leftover = remainingEggs % 12;

         System.out.println("Your no. of eggs is "+gross+"gross, "+dozen+"dozen, "+"and "+leftover+" left.");
         
         ob.close();
	}

}
