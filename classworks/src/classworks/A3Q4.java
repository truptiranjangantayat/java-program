package classworks;

public class A3Q4 {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int num3 = Integer.parseInt(args[2]);
		
		if(num1 == num2 && num2 == num3) {
			System.out.println("Three are equal.");
		}
		else {
			System.out.println("Not equal.");
		}

	}

}
