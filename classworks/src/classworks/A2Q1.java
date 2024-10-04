package classworks;
//import java.util.*;

public class A2Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner ob = new Scanner(System.in);
//		System.out.print("enter 1st num:");
//		int x = ob.nextInt();
//		System.out.print("enter 2nd num:");
//		int y = ob.nextInt();
		
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		
		if(x % y == 0) {
				System.out.println("true");
			}
		else {
			System.out.println("false");
			}
//		ob.close();
	}

}
