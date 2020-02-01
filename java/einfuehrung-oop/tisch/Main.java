package tisch;

public class Main {

	public static void main(String[] args) {
		Tisch t1 = new Tisch();
		Tisch t2 = new Tisch(1,2,3,4,5);
		
		System.out.println(t1.getLaengeBeine());
		System.out.println(t2.getLaengeBeine());
	}

}
