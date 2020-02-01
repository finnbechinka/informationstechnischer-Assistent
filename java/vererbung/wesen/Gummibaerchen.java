package wesen;

public class Gummibaerchen extends Wesen{
	private String farbe;
	private double breite;
	private double tiefe;
	private String geschmacksrichtung;
	private String konsistenz;
	
	public Gummibaerchen(String farbe){
		this.farbe = farbe;
	}
	
	public double getVolumen(){
		return super.groesse * this.breite * this.tiefe;
	}
	
	public void showGummibaerchen(){
		System.out.println("name:" + super.name);
		System.out.println("farbe:" + this.farbe);
		System.out.println("groesse:" + super.groesse);
		System.out.println("breite:" + this.breite);
		System.out.println("tiefe:" + this.tiefe);
		System.out.println("geschmacksrichtung:" + this.geschmacksrichtung);
		System.out.println("konsistenz:" + this.konsistenz);
	}

	public void setName(String name) {
		super.name = name;
	}

	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	public double getBreite() {
		return breite;
	}

	public void setBreite(double breite) {
		this.breite = breite;
	}

	public double getTiefe() {
		return tiefe;
	}

	public void setTiefe(double tiefe) {
		this.tiefe = tiefe;
	}

	public String getGeschmacksrichtung() {
		return geschmacksrichtung;
	}

	public void setGeschmacksrichtung(String geschmacksrichtung) {
		this.geschmacksrichtung = geschmacksrichtung;
	}

	public String getKonsistenz() {
		return konsistenz;
	}

	public void setKonsistenz(String konsistenz) {
		this.konsistenz = konsistenz;
	}
}
