package wesen;

public class Hauptklasse {

	public static void main(String[] args) {
		Gummibaerchen g1 = new Gummibaerchen("rosarot");
		g1.setName("Peter");
		g1.setGroesse(1.80);
		g1.setTiefe(15.00);
		g1.setBreite(40.00);
		g1.setGeschmacksrichtung("zuckersüß");
		g1.setKonsistenz("fluffig");
		g1.showGummibaerchen();
		g1.getVolumen();
		
		System.out.println("\n");
		
		Zwerg z1 = new Zwerg("Olga");
		z1.setGroesse(120.00);
		z1.setHatZipfelmuetze(true);
		z1.showZwerg();
		
		System.out.println("\n");
		
		Hund h1 = new Hund("Rasse");
		h1.setName("Bello");
		h1.setGroesse(40.00);
		h1.showHund();
	}

}