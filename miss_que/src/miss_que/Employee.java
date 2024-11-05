package miss_que;

public class Employee {
	private String name;
	private int age;
	private String department;
	private float salary;
	
	public Employee(String name, int age, String department, float salary) {
		this.name = name;
		this.age= age;
		this.department= department;
		this.salary = salary;
	}
	
	public void displayDetails(boolean showname) {
		if(showname)System.out.println("Name: "+name);	}
	
	public void displayDetails(boolean showname, boolean showage) {
		if(showname)System.out.println("Name: "+name);
		if(showage)System.out.println("Age: "+age);
	}
	
	public void displayDetails(boolean showname, boolean showage, boolean showall) {
		if(showname)System.out.println("Name: "+name);
		if(showage)System.out.println("Age: "+age);
		if(showall)	{System.out.println("Department: "+department);
					 System.out.println("Department: "+salary);}
	}
}