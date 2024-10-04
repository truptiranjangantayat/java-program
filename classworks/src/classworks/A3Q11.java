package classworks;

public class A3Q11 {

	public static void main(String[] args) {
		double weight = Double.parseDouble(args[0]);
		double height = Double.parseDouble(args[1]);
		double BMI = weight/(Math.pow(height,2));
		
		if (BMI<18.5) {
			System.out.println("underweight");
		}
		else if (18.5>=BMI && BMI<24.9) {
			System.out.println("Normal weight");
		}
		else if (25.0>= BMI && BMI<29.9) {
			System.out.println("Overweight");
		}
		else {
			System.out.println("Obese");
		}

	}

}
