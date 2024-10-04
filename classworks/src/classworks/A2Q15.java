package classworks;

import java.util.Scanner;

public class A2Q15 {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the temperature in fahrenheit:");
		float Fahrenheit = ob.nextFloat();
		
		float Centigrade = (float)5/9*(Fahrenheit-32);
		System.out.println("Temperature of a city in Centigrade:"+Centigrade);
		
		ob.close();
	}

}
