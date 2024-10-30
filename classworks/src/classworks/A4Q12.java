package classworks;

public class A4Q12 {
	public static void FunctionGrowth(int n) {
		double logN = Math.log(n);
		double N = n;
		double NlogN = n*Math.log(n);
		double N2 = n*n;
		double N3 = Math.pow(n, 3);
		double _2N = Math.pow(2, n);
		
		System.out.println(logN+"\t"+N+"\t"+NlogN+"\t"+N2+"\t"+N3+"\t"+_2N);
	}

	public static void main(String[] args) {
		System.out.println("logN\tN\tNlogN\tN2\tN3\t_2N");
	
		for(int n = 4,i = 16; i <= 2048; i=(int)Math.pow(2, n)) {
			FunctionGrowth(i);
			n++;
		}
	}

}
