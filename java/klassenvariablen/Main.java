package program;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Ibuprofen i1 = new Ibuprofen();
		System.out.println(Schmerzmittel.getKaufz�hler());
		
		Ibuprofen i2 = new Ibuprofen("ASTF", false, 150, 50, 100);
		System.out.println(Ibuprofen.getKaufz�hler());
		
		Aspirin a1 = new Aspirin();
		System.out.println(Schmerzmittel.getKaufz�hler());
		
		Aspirin a2 = new Aspirin("NALS", true, 300, "Bayer", 25);
		System.out.println(Aspirin.getKaufz�hler());
	}

}
