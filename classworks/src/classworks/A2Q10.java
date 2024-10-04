package classworks;

public class A2Q10 {

	public static void main(String[] args) {
		double random1=Math.random();
		double random2=Math.random();
		double random3=Math.random();
		double random4=Math.random();
		double random5=Math.random();
		
		double avg = (random1+random2+random3+random4+random5)/5;
		System.out.println(random1);
		System.out.println(random2);
		System.out.println(random3);
		System.out.println(random4);
		System.out.println(random5);
		System.out.println("average random:"+avg);
		System.out.println("min random:"+Math.min(Math.min(Math.min(Math.min(random1, random2), random3), random4),random5));
		System.out.println("max random:"+Math.max(Math.max(Math.max(Math.max(random1, random2), random3), random4),random5));
	}

}
