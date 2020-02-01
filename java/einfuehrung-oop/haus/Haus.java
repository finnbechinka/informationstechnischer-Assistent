package haus;

public class Haus {
	private double hoehe;
	private double breite;
	private double laenge;
	private int baujahr;
	
	public Haus() {};
	
	public Haus(double Hoehe, double Breite, double Laenge, int Baujahr){
		this.hoehe = Hoehe;
		this.breite = Breite;
		this.laenge = Laenge;
		this.baujahr = Baujahr;
	}

	public double getHoehe() {
		return hoehe;
	}

	public void setHoehe(double hoehe) {
		this.hoehe = hoehe;
	}

	public double getBreite() {
		return breite;
	}

	public void setBreite(double breite) {
		this.breite = breite;
	}

	public double getLaenge() {
		return laenge;
	}

	public void setLaenge(double laenge) {
		this.laenge = laenge;
	}

	public int getBaujahr() {
		return baujahr;
	}

	public void setBaujahr(int baujahr) {
		this.baujahr = baujahr;
	}
	
}


