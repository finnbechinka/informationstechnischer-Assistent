package program;

public class Aspirin extends Schmerzmittel {
	private String hersteller;
	private float verpackungsgroesse;
	
	public Aspirin(){ super(); }
	
	public Aspirin(String w, boolean v, float p, String h, float vg){
		super(w, v, p);
		this.hersteller = h;
		this.verpackungsgroesse = vg;
	}

	public String getHersteller() {
		return hersteller;
	}

	public void setHersteller(String hersteller) {
		this.hersteller = hersteller;
	}

	public float getVerpackungsgroesse() {
		return verpackungsgroesse;
	}

	public void setVerpackungsgroesse(float verpackungsgroesse) {
		this.verpackungsgroesse = verpackungsgroesse;
	}
}
