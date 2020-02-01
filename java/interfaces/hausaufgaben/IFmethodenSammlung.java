package hausaufgaben;

public interface IFmethodenSammlung {
	
	public void saveData(int c, int a []);
	public void delData(float d []);
	public void resultMsg();
	public float surfAreaCircle(Kreis k);
	public Kreis copyCircle(Kreis k);
	public float distPoints(Punkt p1, Punkt p2); 
	
	/*Die Länge einer Linie entspricht hier dem Abstand
	 * der beiden Punkte und kann einfach wie folgt bestimmt werden:
	 * d=sqrt((x2-x2)^2+(y2-y1)^2)
	 */
}
