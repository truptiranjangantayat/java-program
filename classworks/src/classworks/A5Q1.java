package classworks;
class Commission{
	double sales;
	
	public Commission(double sales) {
		this.sales = sales;
	}
	
	public void getCommission() {
		if (sales<500 && sales>=0) {
			System.out.println("Commission is:"+sales*2/100);
		}
		else if (sales>=500 && sales<5000) {
			System.out.println("Commission is:"+sales*5/100);
		}
		else if (sales>=5000) {
			System.out.println("Commission is:"+sales*8/100);
		}
		else {
			System.out.println("Invalid Input!");
		}
	}
	
}


public class A5Q1 {

	public static void main(String[] args) {
		Commission c1 = new Commission(-1.2);
		c1.getCommission();

	}

}
