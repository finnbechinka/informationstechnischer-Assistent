package rechteck;

public class Hauptklasse {

	public static void main(String[] args) {
		
		double ad = 10;
		double bd = 15;
		int ai = 20;
		int bi = 25;
		String as = "30";
		String bs = "35";
		
		
		System.out.println("-----Rechteck1:-----");
		
		Rechteck1 rechteck1 = new Rechteck1();
		rechteck1.seiteA = ad;
		rechteck1.seiteB = bd;
		System.out.println(rechteck1.seiteA  + "\n" + rechteck1.seiteB);
		
		System.out.println("-----Rechteck2:-----");
		
		Rechteck2 rechteck2 = new Rechteck2();
		rechteck2.seiteA = ad;
		rechteck2.seiteB = bd;
		rechteck2.showFlaeche();
		
		System.out.println("-----Rechteck3:-----");
		
		Rechteck3 rechteck3 = new Rechteck3();
		rechteck3.setSeiteA(ad);
		rechteck3.setSeiteB(bd);
		rechteck3.showFlaeche();
		rechteck3.setSeiteAB(ad+30, bd+30);
		rechteck3.showFlaeche();
		
		System.out.println("-----Rechteck4:-----");
		
		Rechteck4 rechteck4 = new Rechteck4();
		rechteck4.setSeiteA(ad);
		rechteck4.setSeiteB(bd);
		System.out.println(rechteck4.getSeiteA());
		System.out.println(rechteck4.getSeiteB());
		System.out.println(rechteck4.getUmfang());
		System.out.println(rechteck4.getFleache());
		
		System.out.println("-----Rechteck5:-----");

		Rechteck5 rechteck5 = new Rechteck5();
		rechteck5.setSeiteA(ad);
		rechteck5.setSeiteB(bd);
		System.out.println(rechteck5.getSeiteA() + "\n" + rechteck5.getSeiteB());
		rechteck5.setSeiteA(ai);
		rechteck5.setSeiteB(bi);
		System.out.println(rechteck5.getSeiteA() + "\n" + rechteck5.getSeiteB());
		rechteck5.setSeiteA(as);
		rechteck5.setSeiteB(bs);
		System.out.println(rechteck5.getSeiteA() + "\n" + rechteck5.getSeiteB());
	}

}
