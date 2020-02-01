package program;

public class Ibuprofen extends Schmerzmittel {
	float dosis;
	float masse;
	
	public Ibuprofen(){ super(); }
	
	public Ibuprofen(String w, boolean v, float p, float d, float m){
		super(w, v, p);
		this.dosis = d;
		this.masse = m;
	}

	public float getDosis() {
		return dosis;
	}

	public void setDosis(float dosis) {
		this.dosis = dosis;
	}

	public float getMasse() {
		return masse;
	}

	public void setMasse(float masse) {
		this.masse = masse;
	}
}
