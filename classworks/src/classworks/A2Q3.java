package classworks;
//import java.math.*;

public class A2Q3 {
	public static void main(String args[]) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
//		Random ob = new Random();
		int random = (int)(Math.random()*(b-a)+a);
		System.out.println(random);
	}

}
