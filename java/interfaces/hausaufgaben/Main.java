package hausaufgaben;

public class Main {

	public static void main(String[] args) {		
		Methoden m = new Methoden();
		
		// saveData test
		System.out.println("/////saveData/////");
		int[] ia = new int[]{1,1,1,1,1};
		m.saveData(5, ia);
		for(int i = 0; i < ia.length; i++){
			System.out.print(ia[i] + " ");
		}
		System.out.print("\n");

		// delData test
		System.out.println("\n/////delData/////");
		float[] fa = new float[]{1,2,3,4,5};
		m.delData(fa);
		for(int i = 0; i < fa.length; i++){
			System.out.print(fa[i] + " ");
		}
		System.out.print("\n");

		// surfAreaCircle test
		System.out.println("\n/////surfAreaCircle/////");
		Kreis k = new Kreis(69.69);
		System.out.println(m.surfAreaCircle(k));

		// distPoints test
		System.out.println("\n/////distPoints/////");
		Punkt p1 = new Punkt(3.5, 6.9);
		Punkt p2 = new Punkt(15, 30.9);
		System.out.println(m.distPoints(p1, p2));
		
		
		
	}

}
