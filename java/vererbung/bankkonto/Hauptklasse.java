package bankkonto;
public class Hauptklasse {
	public static void main(String[] args) {
		Sparkonto s1 = new Sparkonto();
		s1.setKontoinhaber("Dirk Meier");
		s1.setKontostand(2000);
		s1.setBankleitzahl(1234);
		s1.setSparbuchnummer(1990973);
		s1.setZinssatz(3);
		s1.showKonto();
		s1.berechneZinsen(10);
		
		System.out.println("\n");
		
		Sparkonto s2 = new Sparkonto();
		s2.setKontoinhaber("Dirk Meier");
		s2.setKontostand(1000000);
		s2.setBankleitzahl(12345);
		s2.setSparbuchnummer(199098763);
		s2.setZinssatz(0.45);
		s2.showKonto();
		s2.showSparbuchnummer();
		
		System.out.println("\n");
		
		Festgeldkonto f1 = new Festgeldkonto();
		f1.setKontoinhaber("Dirk Meier");
		f1.setKontostand(1000000);
		f1.setBankleitzahl(123456);
		f1.setDauer(5);
		f1.setZinssatz(0.41);
		f1.showKonto();
		f1.showDauer();	
	}
}