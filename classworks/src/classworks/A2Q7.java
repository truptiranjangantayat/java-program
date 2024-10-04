package classworks;


public class A2Q7 {

	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		int day = Integer.parseInt(args[1]);
		
		int []daysInMonth= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (day<1 || day>daysInMonth[month-1]) {
			System.out.println("invalid!");
		}
		else {
			if((month == 3 && day >= 20) || (month ==6 && day <= 20)||(month>3 && month<6)) {
				System.out.println(true);
			}
			else {
				System.out.println(false);
			}
		}
	}

}
