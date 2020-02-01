package dreieck;

public class Hauptklasse {

	public static void main(String[] args) {
		double ad = 10;
		double bd = 5;
		double cd = 10;
		int ai = 20;
		int bi = 10;
		int ci = 20;
		java.lang.String as = "40";
		java.lang.String bs = "20";
		java.lang.String cs = "40";
		
		System.out.println("-----Dreieck1-----");
		
		Dreieck1 dreieck1 = new Dreieck1();
		dreieck1.seiteA = ad;
		dreieck1.seiteB = bd;
		dreieck1.seiteC = cd;
		System.out.println(dreieck1.seiteA);
		System.out.println(dreieck1.seiteB);
		System.out.println(dreieck1.seiteC);
		
		System.out.println("-----Dreieck2-----");
		
		Dreieck2 dreieck2 = new Dreieck2();
		dreieck2.seiteA = ad;
		dreieck2.seiteB = bd;
		dreieck2.seiteC = cd;
		dreieck2.showUmfang();
		
		System.out.println("-----Dreieck3-----");
		
		Dreieck3 dreieck3 = new Dreieck3();
		dreieck3.setSeiteA(ad);
		dreieck3.setSeiteB(bd);
		dreieck3.setSeiteC(cd);
		dreieck3.showUmfang();
		
		System.out.println("-----Dreieck4-----");
		
		Dreieck4 dreieck4 = new Dreieck4();
		dreieck4.setSeiteA(ad);
		dreieck4.setSeiteB(bd);
		dreieck4.setSeiteC(cd);
		System.out.println(dreieck4.getSeiteA());
		System.out.println(dreieck4.getSeiteB());
		System.out.println(dreieck4.getSeiteC());
		System.out.println(dreieck4.getUmfang());
		
		System.out.println("-----Dreieck5-----");
		
		Dreieck5 dreieck5 = new Dreieck5();
		dreieck5.setSeiteA(ad);
		dreieck5.setSeiteB(bd);
		dreieck5.setSeiteC(cd);
		System.out.println(dreieck5.getSeiteA());
		System.out.println(dreieck5.getSeiteB());
		System.out.println(dreieck5.getSeiteC());
		dreieck5.setSeiteA(ai);
		dreieck5.setSeiteB(bi);
		dreieck5.setSeiteC(ci);
		System.out.println(dreieck5.getSeiteA());
		System.out.println(dreieck5.getSeiteB());
		System.out.println(dreieck5.getSeiteC());
		dreieck5.setSeiteA(as);
		dreieck5.setSeiteB(bs);
		dreieck5.setSeiteC(cs);
		System.out.println(dreieck5.getSeiteA());
		System.out.println(dreieck5.getSeiteB());
		System.out.println(dreieck5.getSeiteC());
		System.out.println(dreieck5.getFleache());

	}

}
