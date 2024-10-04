package classworks;

public class CmdEx3 {

	public static void main(String[] args) {
		int i = 0;
		int count = 0;
		if(args.length > 0) {
			while(i < args.length) {
				System.out.println(i+1+" "+args[i]);
				i++;
				count++;
			}
			System.out.println("total argument:"+count);
		}
		else {
			System.out.println("pls provide the argument");
		}
	}

}
