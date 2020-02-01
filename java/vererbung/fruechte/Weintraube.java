package fruechte;

public class Weintraube extends Frucht{
	private boolean kernlos;
	private String farbe;
	
	public Weintraube(){
		super();
	}
	
	public Weintraube(boolean k, String f){
		super();
		this.kernlos = k;
		this.farbe = f;
	}
	
	public Weintraube(boolean suess, String schale, String form, String herkunft, float preis, boolean k, String f){
		super(suess, schale, form, herkunft, preis);
		this.kernlos = k;
		this.farbe = f;
	}

	public boolean isKernlos() {
		return kernlos;
	}

	public void setKernlos(boolean kernlos) {
		this.kernlos = kernlos;
	}

	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	
}
