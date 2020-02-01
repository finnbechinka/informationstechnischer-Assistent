package fruechte;

public class Frucht {
	private boolean suess;
	private String schale;
	private String form;
	private String herkunft;
	private float preis;
	
	public Frucht(){
		
	}
	
	public Frucht(boolean suess, String schale, String form, String herkunft, float preis){
		this.suess = suess;
		this.schale = schale;
		this.form = form;
		this.herkunft = herkunft;
		this.preis = preis;
	}

	public boolean isSuess() {
		return suess;
	}

	public void setSuess(boolean suess) {
		this.suess = suess;
	}

	public String getSchale() {
		return schale;
	}

	public void setSchale(String schale) {
		this.schale = schale;
	}

	public String getForm() {
		return form;
	}

	public void setForm(String form) {
		this.form = form;
	}

	public String getHerkunft() {
		return herkunft;
	}

	public void setHerkunft(String herkunft) {
		this.herkunft = herkunft;
	}

	public float getPreis() {
		return preis;
	}

	public void setPreis(float preis) {
		this.preis = preis;
	}
	
}
