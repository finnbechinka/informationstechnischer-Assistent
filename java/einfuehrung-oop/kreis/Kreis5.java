package kreis;

public class Kreis5 {
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
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void setRadius(String radius) {
		this.radius = Double.parseDouble(radius);
	}
}
