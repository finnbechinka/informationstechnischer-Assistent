package bruch;

public class Bruch2 {
	int zaehler;
	int nenner;
	
	void showBruch(){
		System.out.println(zaehler + "/" + nenner);
	}
	
	void kuerzen(){
		int a = zaehler;
		int b = nenner;
		int ggt;
		int rest;
		while(b != 0){
			rest = a % b;
			a = b;
			b = rest;
		}
		ggt = a;
		
		zaehler = zaehler / ggt;
		nenner = nenner / ggt;
	}
}
