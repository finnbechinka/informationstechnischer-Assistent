package rechteck;

public class Rechteck3 {
	private double seiteA;
	private double seiteB;

	void showFlaeche(){
		System.out.println(seiteA * seiteB);
	}
	
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
}
