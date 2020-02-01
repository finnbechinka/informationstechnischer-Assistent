package ifUebung;

public class Main implements IFmethodenSammlung {

	public void saveData(int c, int[] a, int index) {
		a[index] = c;
	}

	public void delData(float[] d, int index) {
		d[index] = Float.NaN;
	}

	public void resultMsg() {
		System.out.print("Done! ;-)");
	}

	public double surfAreaCircle(Kreis k) {
		
		return Math.PI * Math.pow(k.getRadius(), 2);
	}

	public Kreis copyCircle(Kreis k) {

		return k;
	}

	public double distPoints(Punkt p1, Punkt p2) {
		return Math.sqrt(Math.pow(p2.getX()-p1.getX(), 2) + Math.pow(p2.getY()-p1.getY(), 2));
	}
	
}
