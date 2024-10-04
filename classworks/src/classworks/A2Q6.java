package classworks;

public class A2Q6 {

	public static void main(String[] args) {
		double x0 = Double.parseDouble(args[0]);
		double v0 = Double.parseDouble(args[1]);
		double t = Double.parseDouble(args[2]);
		
		final double g = 9.78033;
		System.out.println(x0+v0+(g*Math.pow(t, 2)));

	}

}
