package bankkonto;

public class Sparkonto extends Bankkonto {
	private int sparbuchnummer;
	
	public Sparkonto() {
		super();
	}
	
	public void showSparbuchnummer() {
		System.out.println("Sparbuchnummer: " + this.sparbuchnummer);
	}

	public int getSparbuchnummer() {
		return sparbuchnummer;
	}

	public void setSparbuchnummer(int sparbuchnummer) {
		this.sparbuchnummer = sparbuchnummer;
	}
	
	
}
