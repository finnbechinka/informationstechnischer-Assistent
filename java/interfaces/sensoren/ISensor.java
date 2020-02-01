package sensoren;

public interface ISensor {
	public void startMessung();
	public void stopMessung();
	public int sTyp();
	public boolean status();
	public double leistungsaufnahme();
	public void speichereDaten(double d);
}
