package mobil;

public class Mobilgeraet {
	private double speicher;
	private String hersteller;
	private boolean hatDreiG;
	private double preis;
	
	public Mobilgeraet(){
		
	}
	
	public Mobilgeraet(double speicher, String hersteller, boolean hatDreiG, double preis){
		this.speicher = speicher;
		this.hersteller = hersteller;
		this.hatDreiG = hatDreiG;
		this.preis = preis;
	}

	public double getSpeicher() {
		return speicher;
	}

	public void setSpeicher(double speicher) {
		this.speicher = speicher;
	}

	public String getHersteller() {
		return hersteller;
	}

	public void setHersteller(String hersteller) {
		this.hersteller = hersteller;
	}

	public boolean isHatDreiG() {
		return hatDreiG;
	}

	public void setHatDreiG(boolean hatDreiG) {
		this.hatDreiG = hatDreiG;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}
}
