package rechteck;

public class Rechteck5 {
	private double seiteA;
	private double seiteB;
	
	public void setSeiteB(double seiteB) {
		this.seiteB = seiteB;
	}
	
	public void setSeiteB(int seiteB){
		this.seiteB = seiteB;
	}
	
	public void setSeiteB(String seiteB){
		this.seiteB = Double.parseDouble(seiteB);
	}

	public void setSeiteA(double seiteA){
		this.seiteA = seiteA;
	}
	
	public void setSeiteA(int seiteA){
		this.seiteA = seiteA;
	}
	
	public void setSeiteA(String seiteA){
		this.seiteA = Double.parseDouble(seiteA);
	}
	
	public void setSeiteAB(double seiteA, double seiteB){
		this.seiteA = seiteA;
		this.seiteB = seiteB;
	}
	
	public void setSeiteAB(int seiteA, int seiteB){
		this.seiteA = seiteA;
		this.seiteB = seiteB;
	}
	
	public void setSeiteAB(String seiteA, String seiteB){
		this.seiteA = Double.parseDouble(seiteA);
		this.seiteB = Double.parseDouble(seiteB);
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
