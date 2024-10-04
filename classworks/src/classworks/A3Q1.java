package classworks;
import java.util.*;

public class A3Q1 {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter the height in (feet):");
		int height = ob.nextInt();
		
		if (height >= 6) {
			System.out.println("the person is tall.!");
		}
		ob.close();
	}
	

}
