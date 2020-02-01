package bankkonto;

public class Festgeldkonto extends Bankkonto {
	private int dauer;

	public Festgeldkonto() {
		super();
	}
	
	public void showDauer() {
		System.out.println("Dauer in Monaten: " + this.dauer);
	}
	
	public int getDauer() {
		return dauer;
	}

	public void setDauer(int dauer) {
		this.dauer = dauer;
	}
	
	
}