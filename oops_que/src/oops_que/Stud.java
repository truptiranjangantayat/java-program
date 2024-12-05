package oops_que;

public class Stud {
	int rollno;
	String name;
	static String college = "SOA";
	static int count;
	
	public Stud(int rollno, String name) {
		this.rollno=rollno;
		this.name=name;
		count++;
	}
	
	public void printInfo() {
		System.out.println("Name: "+name);
		System.out.println("Roll.no: "+rollno);
		System.out.println("College: "+college);
	}
	
	static void Count() {
		System.out.println("No of Stud: "+count);
	}

}
