package classworks;

public class A4Q7 {

	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		double sum=0;
		double random;
		for(int i=1; i <= N; i++) {
			random = Math.random();
			System.out.println(random);
			sum = sum+random;
		}
		double avrage = sum/N;
		System.out.println("avrage: "+ avrage);
	}

}
