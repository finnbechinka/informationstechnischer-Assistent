package kreis;
import java.lang.Math;

public class Kreis4 {
	private double radius;
	
	
	public double getFlaeche(){
		return (Math.PI * (radius * radius)); 
	}
	
	public double getUmfang(){
		return (2 * Math.PI * radius);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}
