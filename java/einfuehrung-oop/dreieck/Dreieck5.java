package dreieck;

public class Dreieck5 {
	private double seiteA;
	private double seiteB;
	private double seiteC;
	
	public double getFleache(){
		double s = (seiteA + seiteB + seiteC) / 2;
		return Math.sqrt(s * (s - seiteA) * (s - seiteB) * (s - seiteC));
	}
	
	public double getUmfang(){
		return (seiteA + seiteB + seiteC);
	}

	public double getSeiteA() {
		return seiteA;
	}

	public void setSeiteA(double seiteA) {
		this.seiteA = seiteA;
	}
	
	public void setSeiteA(int seiteA) {
		this.seiteA = seiteA;
	}
	
	public void setSeiteA(java.lang.String seiteA) {
		this.seiteA = Double.parseDouble(seiteA);
	}
	
	public double getSeiteB() {
		return seiteB;
	}

	public void setSeiteB(double seiteB) {
		this.seiteB = seiteB;
	}
	
	public void setSeiteB(int seiteB) {
		this.seiteB = seiteB;
	}
	
	public void setSeiteB(java.lang.String seiteB) {
		this.seiteB = Double.parseDouble(seiteB);
	}

	public double getSeiteC() {
		return seiteC;
	}

	public void setSeiteC(double seiteC) {
		this.seiteC = seiteC;
	}
	
	public void setSeiteC(int seiteC) {
		this.seiteC = seiteC;
	}
	
	public void setSeiteC(java.lang.String seiteC) {
		this.seiteC = Double.parseDouble(seiteC);
	}
}
