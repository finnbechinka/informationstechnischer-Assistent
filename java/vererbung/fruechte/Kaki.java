package fruechte;

public class Kaki extends Frucht{
	private float co2abdruck;
	private int reifegrad;
	
	public Kaki(){
		super();
	}
	
	public Kaki(float c, int r){
		super();
		this.co2abdruck = c;
		this.reifegrad = r;
	}
	
	public Kaki(boolean suess, String schale, String form, String herkunft, float preis, float c, int r){
		super(suess, schale, form, herkunft, preis);
		this.co2abdruck = c;
		this.reifegrad = r;
	}

	public float getCo2abdruck() {
		return co2abdruck;
	}

	public void setCo2abdruck(float co2abdruck) {
		this.co2abdruck = co2abdruck;
	}

	public int getReifegrad() {
		return reifegrad;
	}

	public void setReifegrad(int reifegrad) {
		this.reifegrad = reifegrad;
	}
	
}
