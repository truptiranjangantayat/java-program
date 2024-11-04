package classworks;

public class A4Q39 {

	public static void main(String[] args) {
		
		for (int i =1; i <= 500; i++) {
			int sum = 0;
			for(int j =1; j<i; j++) {
				if(i%j == 0) {
					sum = sum+j;
				}
			}
			if(sum == i) {
				System.out.print(i+" ");
			}
		}

	}

}
