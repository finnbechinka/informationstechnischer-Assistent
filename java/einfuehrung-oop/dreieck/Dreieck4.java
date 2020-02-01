package dreieck;

public class Dreieck4 {
	private double seiteA;
	private double seiteB;
	private double seiteC;
	
	public double getUmfang(){
		return (seiteA + seiteB + seiteC);
	}

	public double getSeiteA() {
		return seiteA;
	}

	public void setSeiteA(double seiteA) {
		this.seiteA = seiteA;
	}
	
	public double getSeiteB() {
		return seiteB;
	}

	public void setSeiteB(double seiteB) {
		this.seiteB = seiteB;
	}

	public double getSeiteC() {
		return seiteC;
	}

	public void setSeiteC(double seiteC) {
		this.seiteC = seiteC;
	}
}
