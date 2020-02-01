package wuerfel;

public class Wuerfel2 {
	double seiteA;
	
	void showOberfleache(){
		System.out.println(6 * (seiteA * seiteA));
	}
	
	void showVolumen(){
		System.out.println(seiteA * seiteA * seiteA);
	}
}
