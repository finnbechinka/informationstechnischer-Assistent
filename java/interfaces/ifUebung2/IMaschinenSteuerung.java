package ifUebung2;

public interface IMaschinenSteuerung {
	public boolean maschienStatus(int status); //1: Maschine startet 0:Maschine stoppt.
	public float leistungsBerechnung(float strom, float spannung); //Kennst du aus der Elektrotechnik ;-)
	public void fehlerzustand(Zustand z); //Nur Zustandnr. 3 löst den Fehlerzustand aus. Wie diese Zustandsklasse auszusehen hat, musst du jetzt selber wissen ;-)
	public float [] verarbeiteWerte(float [] messdaten); /* Bildet  Differenzen von aufeinanderfolgenden Werten 
															und schreibt diese in ein neues Array, welches dann zurückgegeben wird. So soll die Veränderung der Messwerte
															überwacht werden. Z.B. Eingabearray:[2,4,6,3,9] Rückgabearray: [4-2,6-4,3-6,9-3], also [2,2,-3,6].*/
}