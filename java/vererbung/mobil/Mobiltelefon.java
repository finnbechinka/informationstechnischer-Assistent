package mobil;

public class Mobiltelefon extends Mobilgeraet{
	private boolean hatKlinkenstecker;
	private boolean sdSlot;
	private double akkuKapazitaet;
	
	public Mobiltelefon(){
		
	}
	
	public Mobiltelefon(boolean hatKlinkenstecker, boolean sdSlot, double akkuKapazitaet){
		super();
		this.hatKlinkenstecker = hatKlinkenstecker;
		this.sdSlot = sdSlot;
		this.akkuKapazitaet = akkuKapazitaet;
	}

	public boolean isHatKlinkenstecker() {
		return hatKlinkenstecker;
	}

	public void setHatKlinkenstecker(boolean hatKlinkenstecker) {
		this.hatKlinkenstecker = hatKlinkenstecker;
	}

	public boolean isSdSlot() {
		return sdSlot;
	}

	public void setSdSlot(boolean sdSlot) {
		this.sdSlot = sdSlot;
	}

	public double getAkkuKapazitaet() {
		return akkuKapazitaet;
	}

	public void setAkkuKapazitaet(double akkuKapazitaet) {
		this.akkuKapazitaet = akkuKapazitaet;
	}
	
	
}
