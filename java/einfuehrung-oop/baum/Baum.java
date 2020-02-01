package baum;

public class Baum {
	private int alter;
	private String art;
	private boolean bewohnt;
	private boolean unterBaumschutz;
	private double hoehe;
	private double wurzelTiefe;
	private double maxStammBeite;
	
	public Baum(){
		
	}
	
	public Baum(int alter, String art, boolean bewohnt, boolean unterBaumschutz, double h, double wt, double msb){
		this.alter = alter;
		this.art = art;
		this.bewohnt = bewohnt;
		this.unterBaumschutz = unterBaumschutz;
		this.hoehe = h;
		this.wurzelTiefe = wt;
		this.maxStammBeite = msb;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public String getArt() {
		return art;
	}

	public void setArt(String art) {
		this.art = art;
	}

	public boolean isBewohnt() {
		return bewohnt;
	}

	public void setBewohnt(boolean bewohnt) {
		this.bewohnt = bewohnt;
	}

	public boolean isUnterBaumschutz() {
		return unterBaumschutz;
	}

	public void setUnterBaumschutz(boolean unterBaumschutz) {
		this.unterBaumschutz = unterBaumschutz;
	}

	public double getHoehe() {
		return hoehe;
	}

	public void setHoehe(double hoehe) {
		this.hoehe = hoehe;
	}

	public double getWurzelTiefe() {
		return wurzelTiefe;
	}

	public void setWurzelTiefe(double wurzelTiefe) {
		this.wurzelTiefe = wurzelTiefe;
	}

	public double getMaxStammBeite() {
		return maxStammBeite;
	}

	public void setMaxStammBeite(double maxStammBeite) {
		this.maxStammBeite = maxStammBeite;
	}
	
}
