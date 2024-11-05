package miss_que;

public class Printer {
	public void printMessage() {
		System.out.println("No massage!");
	}
	
	public void printMessage(String argument) {
		System.out.println("Massage is: "+argument);
	}
	
	public void printMessage(String argument, int n) {
		for(int i=1; i <= n; i++) {
			System.out.println("Massage is: "+argument);
		}
	}
}
