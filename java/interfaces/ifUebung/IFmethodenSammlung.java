package ifUebung;

public interface IFmethodenSammlung {
	
	public void saveData(int c, int a [], int index);
	public void delData(float d [], int index);
	public void resultMsg();
	public double surfAreaCircle(Kreis k);
	public Kreis copyCircle(Kreis k);
	public double distPoints(Punkt p1, Punkt p2); 
	
}
