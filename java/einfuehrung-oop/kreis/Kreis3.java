package kreis;
import java.lang.Math;

public class Kreis3 {
	private double radius;
	
	void showFlaeche(){
		System.out.println(Math.PI * (radius * radius));
	}
	
	void showUmfang(){
		System.out.println(2 * Math.PI * radius);
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}
