package sensoren;

import java.util.Random;

public class Drucksensor implements ISensor {
	public double daten;
	
	@Override
	public void startMessung() {
		System.out.println("Drucksensor start!");
	}

	@Override
	public void stopMessung() {
		System.out.println("Drucksensor stop!");
	}

	@Override
	public int sTyp() {
		return 1;
	}

	@Override
	public boolean status() {
		Random rdm = new Random();
		return rdm.nextBoolean();
	}

	@Override
	public double leistungsaufnahme() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void speichereDaten(double d) {
		this.daten = d;
	}

}
