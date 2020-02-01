package mensch;

public class Mensch {
	private int alter;
	private double groesse;
	private double gewicht;
	private String haarfarbe;
	private String name;
	private String geschlecht;
	private String augenfarbe;
	
	public Mensch(){
		
	}
	
	public Mensch(int alter, double groesse, double gewicht, String haarfarbe, String name, String geschlecht, String augenfarbe){
		this.alter = alter;
		this.groesse = groesse;
		this.gewicht = gewicht;
		this.haarfarbe = haarfarbe;
		this.name = name;
		this.geschlecht = geschlecht;
		this.augenfarbe = augenfarbe;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public double getGroesse() {
		return groesse;
	}

	public void setGroesse(double groesse) {
		this.groesse = groesse;
	}

	public double getGewicht() {
		return gewicht;
	}

	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}

	public String getHaarfarbe() {
		return haarfarbe;
	}

	public void setHaarfarbe(String haarfarbe) {
		this.haarfarbe = haarfarbe;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGeschlecht() {
		return geschlecht;
	}

	public void setGeschlecht(String geschlecht) {
		this.geschlecht = geschlecht;
	}

	public String getAugenfarbe() {
		return augenfarbe;
	}

	public void setAugenfarbe(String augenfarbe) {
		this.augenfarbe = augenfarbe;
	}
	
}
