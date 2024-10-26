package classworks;

import java.util.Scanner;

public class A3Q13 {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = ob.nextInt();
        String grade;

        int range = marks / 10;

        switch (range) {
            case 10:
            case 9:
                grade = "O";
                break;
            case 8:
                grade = "A";
                break;
            case 7:
                grade = "B";
                break;
            case 6:
                grade = "C";
                break;
            case 5:
                grade = "D";
                break;
            case 4:
                grade = "E";
                break;
            default:
                grade = "F";
        }

        System.out.println("Grade: " + grade);
        ob.close();


	}

}
