package bruch;

public class Hauptklasse {

	public static void main(String[] args) {
		
		System.out.println("-----Bruch1:-----");
		
		Bruch1 bruch1 = new Bruch1();
		bruch1.nenner = 4;
		bruch1.zaehler = 3;
		System.out.println(bruch1.nenner + "\n" + bruch1.zaehler);
		
		System.out.println("-----Bruch1:-----");
		
		Bruch2 bruch2 = new Bruch2();
		bruch2.nenner = 12;
		bruch2.zaehler = 16;
		bruch2.kuerzen();
		System.out.println(bruch2.nenner + "\n" + bruch2.zaehler);

	}

}
