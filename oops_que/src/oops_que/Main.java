package oops_que;

public class Main {

	public static void main(String[] args) {
		Stud s1 = new Stud(316, "Truptiranjan");
		Stud s2 = new Stud(228, "Satya");
		Stud s3 = new Stud(300, "Sudhanshu");
		
		s1.printInfo();
		System.out.println();
		s2.printInfo();
		System.out.println();
		s3.printInfo();
		System.out.println();
		
		Stud.Count();
	}

}
