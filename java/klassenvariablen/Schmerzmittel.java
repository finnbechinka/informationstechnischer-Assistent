package program;

public class Schmerzmittel {
	private static int kaufzähler = 0;
	private String wirkstoff;
	private boolean vertraeglichkeit;
	private float preis;
	
	public Schmerzmittel(){ 
		Schmerzmittel.kaufzähler++;
	}
	
	public Schmerzmittel(String w, boolean v, float p){
		Schmerzmittel.kaufzähler++;
		this.wirkstoff = w;
		this.preis = p;
		this.wirkstoff = w;
	}

	public static int getKaufzähler() {
		return kaufzähler;
	}

	public static void setKaufzähler(int kaufzähler) {
		Schmerzmittel.kaufzähler = kaufzähler;
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
