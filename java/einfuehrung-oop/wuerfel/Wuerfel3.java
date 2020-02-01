package wuerfel;

public class Wuerfel3 {
	private double seiteA;
	
	void showOberfleache(){
		System.out.println(6 * (seiteA * seiteA));
	}
	
	void showVolumen(){
		System.out.println(seiteA * seiteA * seiteA);
	}

	public void setSeiteA(double seiteA) {
		this.seiteA = seiteA;
	}
}
