package classworks;

public class A4Q11 {

	public static void main(String[] args) {
		int sum_of_sqr=0, sqr_of_sum=0;
		
		for(int i =1; i<=100; i++) {
			sum_of_sqr=sum_of_sqr+(int)Math.pow(i,2);
			sqr_of_sum=sqr_of_sum+i;
		}
		sqr_of_sum =(int) Math.pow(sqr_of_sum,2);
		int difference = sqr_of_sum-sum_of_sqr;
		
		System.out.println("Difference: "+sqr_of_sum+"-"+sum_of_sqr+"="+difference);

	}

}
