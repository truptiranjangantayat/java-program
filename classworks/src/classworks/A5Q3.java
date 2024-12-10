package classworks;

class Student{
	int roll;
	String name;
	String course;
	
	public void input_Student(int roll, String name, String course) {
		this.roll=roll;
		this.name=name;
		this.course=course;
	}
	public void display_Student() {
		System.out.println("Name: "+name);
		System.out.println("Roll: "+roll);
		System.out.println("Course: "+course);
	}
}
class Exam extends Student{
	int mark1;
	int mark2;
	int mark3;
	
	public void input_marks(int mark1, int mark2, int mark3) {
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
	}
	public void display_Result() {
		System.out.println("Result: "+((mark1+mark2+mark3)/3.00));
	}
}

public class A5Q3 {

	public static void main(String[] args) {
		Exam s1 = new Exam();
		s1.input_Student(228, "Satya", "MCA");
		s1.input_marks(98, 95, 92);
		s1.display_Student();
		s1.display_Result();
		System.out.println();
		
		Exam s2 = new Exam();
		s2.input_Student(300, "Sudhanshu", "MCA");
		s2.input_marks(80, 89, 90);
		s2.display_Student();
		s2.display_Result();
		System.out.println();
		
		Exam s3 = new Exam();
		s3.input_Student(300, "Amit", "MCA");
		s3.input_marks(56, 40, 16);
		s3.display_Student();
		s3.display_Result();
		

	}

}
