package fruechte;

public class Melone extends Frucht{
	private boolean typ;
	private String farbe;
	private double durchmesser;
	
	public Melone(){
		super();
	}
	
	public Melone(boolean t, String f, double d){
		super();
		this.typ = t;
		this.farbe = f;
		this.durchmesser = d;
	}
	
	public Melone(boolean suess, String schale, String form, String herkunft, float preis, boolean t, String f, double d){
		super(suess, schale, form, herkunft, preis);
		this.typ = t;
		this.farbe = f;
		this.durchmesser = d;
	}

	public boolean isTyp() {
		return typ;
	}

	public void setTyp(boolean typ) {
		this.typ = typ;
	}

	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	public double getDurchmesser() {
		return durchmesser;
	}

	public void setDurchmesser(double durchmesser) {
		this.durchmesser = durchmesser;
	}
	
}
