package rechteck;

public class Rechteck4 {
	private double seiteA;
	private double seiteB;
	
	public void setSeiteB(double seiteB) {
		this.seiteB = seiteB;
	}

	public void setSeiteA(double seiteA){
		this.seiteA = seiteA;
	}
	
	public void setSeiteAB(double seiteA, double seiteB){
		this.seiteA = seiteA;
		this.seiteB = seiteB;
	}

	public double getSeiteA() {
		return seiteA;
	}

	public double getSeiteB() {
		return seiteB;
	}
	
	public double getUmfang(){
		return ((2 * seiteA) + (2 * seiteB));
	}
	
	public double getFleache(){
		return (seiteA * seiteB);
	}
}
