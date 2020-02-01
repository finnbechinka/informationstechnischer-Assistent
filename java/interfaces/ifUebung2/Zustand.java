package ifUebung2;

public class Zustand {
	private int zustandnr;
	private String beschreibung;
	
	public Zustand(int znr, String b){
		this.zustandnr = znr;
		this.beschreibung = b;
	}

	public int getZustandnr() {
		return zustandnr;
	}

	public void setZustandnr(int zustandnr) {
		this.zustandnr = zustandnr;
	}

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}
}
