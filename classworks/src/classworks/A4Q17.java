package classworks;

public class A4Q17 {

	public static void main(String[] args) {
		  for (int i = 1; i <= 10; i++) {
	            for (int j = 1; j <= 10; j++) {
	                if (i == j || i == 1 || j == 1 || j%i ==0 || i%j ==0) {
	                    System.out.print("*  ");
	                } else {
	                    System.out.print("   ");
	                }
	            }
	            
	            System.out.print(i);
	            System.out.println();
	        }
	}

}
