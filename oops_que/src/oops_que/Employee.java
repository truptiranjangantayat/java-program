package oops_que;

public class Employee {
	static String companyName = "Tech Solutions";
	static int employeeCount;
	int id;
	String name;
	
	static {
		System.out.println("Welcome to Tech Solutions");
	}
	public Employee(int id, String name) {
		this.id= id;
		this.name= name;
		employeeCount++;
	}
	public Employee(int id) {
		this.id= id;
		this.name= "Unknown";
	}
	public void displayInfo() {
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Company Name: "+companyName);
	}
	public static void displayEmployeeCount() {
		System.out.println("No of Employee: "+ employeeCount);
	}
}

