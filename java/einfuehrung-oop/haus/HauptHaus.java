package haus;

public class HauptHaus {

	public static void main(String[] args) {
		Haus haus1 = new Haus();
		
		haus1.setBaujahr(1994);
		haus1.setBreite(30);
		haus1.setHoehe(15);
		haus1.setLaenge(50);
	    
		System.out.println("Baujahr: " + haus1.getBaujahr());
		System.out.println("Breite: " + haus1.getBreite());
		System.out.println("Hoehe: " + haus1.getHoehe());
		System.out.println("Laenge: " + haus1.getLaenge());
	}

}
