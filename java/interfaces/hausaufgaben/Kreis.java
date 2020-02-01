package hausaufgaben;

public class Kreis {
	private double r;
	
	public Kreis(double r){
		this.r = r;
	}
	
	public Kreis(Kreis k){
		this.r = k.getR();
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}
}
