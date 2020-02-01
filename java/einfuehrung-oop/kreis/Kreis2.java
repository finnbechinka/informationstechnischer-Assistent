package kreis;
import java.lang.Math;

public class Kreis2 {
	double radius;
	
	void showFlaeche(){
		System.out.println(Math.PI * (radius * radius));
	}
	
	void showUmfang(){
		System.out.println(2 * Math.PI * radius);
	}
}
