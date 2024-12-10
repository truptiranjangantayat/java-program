package classworks;

class Complex{
	int real;
	int imag;
	
	public void setData(int real, int imag) {
		this.real=real;
		this.imag=imag;
	}
	
	public void display() {
		System.out.println("Addition: "+real+"+i"+imag);
	}
	
	public Complex add(Complex c1, Complex c2) {
		Complex c3 = new Complex();
		c3.real = c1.real+c2.real;
		c3.imag = c1.imag+c2.imag;
		return c3;
	}
}

public class A5Q2 {

	public static void main(String[] args) {
		Complex c1 = new Complex();
		c1.setData(2, 5);
		Complex c2 = new Complex();
		c2.setData(6, 3);
		Complex c3 = new Complex();
		c3= c3.add(c1, c2);
		c3.display();

	}

}
