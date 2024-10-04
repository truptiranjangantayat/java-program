package classworks;

public class A2Q8 {
	public static void main(String []args) {
		double t = Double.parseDouble(args[0]);
		double P = Double.parseDouble(args[1]);
		double r = Double.parseDouble(args[2]);
		
		System.out.println("Total amount:"+P*(Math.exp(r*t)));
		System.out.println("Monthly amount:"+(P*(Math.exp(r*t)))/(t*12));
	}
}
