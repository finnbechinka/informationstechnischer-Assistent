package program;

public class Schmerzmittel {
	private static int kaufz�hler = 0;
	private String wirkstoff;
	private boolean vertraeglichkeit;
	private float preis;
	
	public Schmerzmittel(){ 
		Schmerzmittel.kaufz�hler++;
	}
	
	public Schmerzmittel(String w, boolean v, float p){
		Schmerzmittel.kaufz�hler++;
		this.wirkstoff = w;
		this.preis = p;
		this.wirkstoff = w;
	}

	public static int getKaufz�hler() {
		return kaufz�hler;
	}

	public static void setKaufz�hler(int kaufz�hler) {
		Schmerzmittel.kaufz�hler = kaufz�hler;
	}

	public String getWirkstoff() {
		return wirkstoff;
	}

	public void setWirkstoff(String wirkstoff) {
		this.wirkstoff = wirkstoff;
	}

	public boolean isVertraeglichkeit() {
		return vertraeglichkeit;
	}

	public void setVertraeglichkeit(boolean vertraeglichkeit) {
		this.vertraeglichkeit = vertraeglichkeit;
	}

	public float getPreis() {
		return preis;
	}

	public void setPreis(float preis) {
		this.preis = preis;
	}
}
