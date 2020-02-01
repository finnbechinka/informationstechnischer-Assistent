package wuerfel;

public class Hauptklasse {

	public static void main(String[] args) {
		double ad = 5;
		int ai = 10;
		String as = "15";
		
		System.out.println("-----Wuerfel1:-----");
		
		Wuerfel1 wuerfel1 = new Wuerfel1();
		wuerfel1.seiteA = ad;
		System.out.println(wuerfel1.seiteA);
		
		System.out.println("-----Wuerfel2:-----");
		
		Wuerfel2 wuerfel2 = new Wuerfel2();
		wuerfel2.seiteA = ad;
		wuerfel2.showOberfleache();
		wuerfel2.showVolumen();
		
		System.out.println("-----Wuerfel3:-----");
		
		Wuerfel3 wuerfel3 = new Wuerfel3();
		wuerfel3.setSeiteA(ad);
		wuerfel3.showOberfleache();
		wuerfel3.showVolumen();
		
		System.out.println("-----Wuerfel4:-----");
		
		Wuerfel4 wuerfel4 = new Wuerfel4();
		wuerfel4.setSeiteA(ad);
		System.out.println(wuerfel4.getSeiteA());
		System.out.println(wuerfel4.getOberflaeche());
		System.out.println(wuerfel4.getVolumen());
		
		System.out.println("-----Wuerfel5:-----");
		
		Wuerfel5 wuerfel5 = new Wuerfel5();
		wuerfel5.setSeiteA(ad);
		System.out.println(wuerfel5.getSeiteA());
		wuerfel5.setSeiteA(ai);
		System.out.println(wuerfel5.getSeiteA());
		wuerfel5.setSeiteA(as);
		System.out.println(wuerfel5.getSeiteA());

	}

}
