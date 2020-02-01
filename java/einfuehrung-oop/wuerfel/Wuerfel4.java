package wuerfel;

public class Wuerfel4 {
	private double seiteA;

	public void setSeiteA(double seiteA) {
		this.seiteA = seiteA;
	}
	
	public double getSeiteA(){
		return seiteA;
	}
	
	public double getOberflaeche(){
		return (6 * (seiteA * seiteA));
	}
	
	public double getVolumen(){
		return (seiteA * seiteA * seiteA);
	}
}
