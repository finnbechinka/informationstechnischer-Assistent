package kreis;

public class Hauptklasse {

	public static void main(String[] args) {
		double rd = 5;
		int ri = 10;
		String rs = "15";
		
		System.out.println("-----Kreis1-----");
		
		Kreis1 kreis1 = new Kreis1();
		kreis1.radius = rd;
		System.out.println(kreis1.radius);

		System.out.println("-----Kreis2-----");
		
		Kreis2 kreis2 = new Kreis2();
		kreis2.radius = rd;
		kreis2.showFlaeche();
		kreis2.showUmfang();

		System.out.println("-----Kreis3-----");
		
		Kreis3 kreis3 = new Kreis3();
		kreis3.setRadius(rd);
		kreis3.showFlaeche();
		kreis3.showUmfang();
		
		
		System.out.println("-----Kreis4-----");
		
		Kreis4 kreis4 = new Kreis4();
		kreis4.setRadius(rd);
		System.out.println(kreis4.getRadius());
		System.out.println(kreis4.getFlaeche());
		System.out.println(kreis4.getUmfang());
		
		
		System.out.println("-----Kreis5-----");
		
		Kreis5 kreis5 = new Kreis5();
		kreis5.setRadius(rd);
		System.out.println(kreis5.getRadius());
		kreis5.setRadius(ri);
		System.out.println(kreis5.getRadius());
		kreis5.setRadius(rs);
		System.out.println(kreis5.getRadius());
		
		
		
		
		
		
	}

}
