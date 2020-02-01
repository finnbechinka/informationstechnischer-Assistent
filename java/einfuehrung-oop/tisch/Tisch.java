package tisch;

public class Tisch {
	private int anzBeine = 4;
	private double laengeBeine;
	private double dickeBeine;
	private double laengePlatte;
	private double breitePlatte;
	private double dickePlatte;
	
	public Tisch(){
		
	}
	
	public Tisch(double lb, double db, double lp, double bp, double dp){
		this.laengeBeine = lb;
		this.dickeBeine = db;
		this.laengePlatte = lp;
		this.breitePlatte = bp;
		this.dickePlatte = dp;
	}

	public int getAnzBeine() {
		return anzBeine;
	}

	public void setAnzBeine(int anzBeine) {
		this.anzBeine = anzBeine;
	}

	public double getLaengeBeine() {
		return laengeBeine;
	}

	public void setLaengeBeine(double laengeBeine) {
		this.laengeBeine = laengeBeine;
	}

	public double getDickeBeine() {
		return dickeBeine;
	}

	public void setDickeBeine(double dickeBeine) {
		this.dickeBeine = dickeBeine;
	}

	public double getLaengePlatte() {
		return laengePlatte;
	}

	public void setLaengePlatte(double laengePlatte) {
		this.laengePlatte = laengePlatte;
	}

	public double getBreitePlatte() {
		return breitePlatte;
	}

	public void setBreitePlatte(double breitePlatte) {
		this.breitePlatte = breitePlatte;
	}

	public double getDickePlatte() {
		return dickePlatte;
	}

	public void setDickePlatte(double dickePlatte) {
		this.dickePlatte = dickePlatte;
	}
}