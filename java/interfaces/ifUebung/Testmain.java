package ifUebung;

public class Testmain {

	public static void main(String[] args) {
		Main im = new Main();
		
		Punkt p1 = new Punkt(0,0);
		Punkt p2 = new Punkt(0,4);
		
		System.out.println("---------------------");
		
		System.out.println(im.distPoints(p1, p2));
		
		System.out.println("\n---------------------");

		
		Kreis k = new Kreis(4);
		
		System.out.println(im.surfAreaCircle(k));
		
		System.out.println("\n---------------------");

		
		int a[] = {1,2,3,4,5};
		
		im.saveData(8, a, 2);
		
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
		
		System.out.println("\n---------------------");

		
		float d[] = {1,2,3,4,5};
		
		im.delData(d, 2);
		
		for(int i = 0; i < a.length; i++){
			System.out.println(d[i]);
		}
		
		System.out.println("\n---------------------");
		
		im.resultMsg();
		
		System.out.println("\n---------------------");



	}

}
