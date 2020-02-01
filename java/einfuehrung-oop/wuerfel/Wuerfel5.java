package wuerfel;

public class Wuerfel5 {
	private double seiteA;

	public void setSeiteA(double seiteA) {
		this.seiteA = seiteA;
	}
	
	public void setSeiteA(int seiteA){
		this.seiteA = seiteA;
	}
	
	public void setSeiteA(String seiteA){
		this.seiteA = Double.parseDouble(seiteA);
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
