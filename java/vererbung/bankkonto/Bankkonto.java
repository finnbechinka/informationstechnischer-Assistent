package bankkonto;

import java.text.NumberFormat;

public class Bankkonto {
	private int kontonummer = 0;
	private static int naechsteKontonummer;
	private String kontoinhaber;
	private double kontostand;
	private int bankleitzahl;
	private double zinssatz;

	
	public Bankkonto() {
		naechsteKontonummer = naechsteKontonummer +1;
		this.kontonummer = naechsteKontonummer;
		}
	
	public void showKonto(){
		System.out.println("Kontonummer: " + this.kontonummer);
		System.out.println("Kontoinhaber: " + this.kontoinhaber);
		System.out.println("Kontostand: " + this.kontostand);
		System.out.println("Bankleitzahl: " + this.bankleitzahl);
		System.out.println("Zinssatz: " + this.zinssatz);
	}
	
	public void einzahlen(double Betrag) {
		this.kontostand = this.kontostand + Betrag;
	}
	
	public void abheben(double Betrag) {
		this.kontostand = this.kontostand + Betrag;
	}
	
	public void berechneZinsen(int Jahre) {

		double zinsbetrag = 0;
		zinsbetrag = this.kontostand * Math.pow( (1 + this.zinssatz / 100) , 			Jahre);
		NumberFormat zwei = NumberFormat.getInstance();
		zwei.setMaximumFractionDigits(2);
		System.out.println("Nach " + Jahre + " Jahren beträgt ihr Kontostand " + 		zwei.format(zinsbetrag) + "€");
	}
	
	public void showKontostand() {
		System.out.println("Kontostand" + this.kontostand);
	}

	public int getKontonummer() {
		return this.kontonummer;
	}

	public void setKontonummer(int kontonummer) {
		this.kontonummer = kontonummer;
	}

	public String getKontoinhaber() {
		return kontoinhaber;
	}

	public void setKontoinhaber(String kontoinhaber) {
		this.kontoinhaber = kontoinhaber;
	}

	public double getKontostand() {
		return kontostand;
	}

	public void setKontostand(double kontostand) {
		this.kontostand = kontostand;
	}

	public int getBankleitzahl() {
		return bankleitzahl;
	}

	public void setBankleitzahl(int bankleitzahl) {
		this.bankleitzahl = bankleitzahl;
	}

	public double getZinssatz() {
		return zinssatz;
	}

	public void setZinssatz(double zinssatz) {
		this.zinssatz = zinssatz;
	}
	
	
}