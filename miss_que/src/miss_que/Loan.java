package miss_que;

public class Loan {
	double principal;
	double rate;
	double time;
	double SI;
	
	public Loan(double principal, double rate, double time) {
		this.principal=principal;
		this.rate = rate;
		this.time = time;	
	}
	
	public void calculateInterest() {
		SI = (principal*rate*time);
		System.out.println("simple_interest: "+SI);
	}
}
