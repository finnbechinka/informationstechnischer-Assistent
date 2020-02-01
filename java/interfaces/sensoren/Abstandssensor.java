package sensoren;

import java.util.Random;

public class Abstandssensor implements ISensor {
	public double daten;
	
	@Override
	public void startMessung() {
		System.out.println("Abstandssensor start!");
	}

	@Override
	public void stopMessung() {
		System.out.println("Abstandssensor stop!");
	}

	@Override
	public int sTyp() {
		return 3;
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
