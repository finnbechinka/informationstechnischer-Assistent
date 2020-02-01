package hausaufgaben;

public class Methoden implements IFmethodenSammlung {

	@Override
	public void saveData(int c, int[] a) {
		for(int i = 0; i < a.length; i++){
			a[i] = c;
		}
	}

	@Override
	public void delData(float[] d) {
		for(int i = 0; i < d.length; i++){
			d[i] = 0;
		}
	}

	@Override
	public void resultMsg() {
		System.out.println("WOW ncie good job, EPIC bro");
	}

	@Override
	public float surfAreaCircle(Kreis k) {
		return (float)(Math.PI * Math.pow(k.getR(), 2));
	}

	@Override
	public Kreis copyCircle(Kreis k) {
		Kreis newKreis = new Kreis(k);
		return newKreis;
	}

	@Override
	public float distPoints(Punkt p1, Punkt p2) {
		return (float) Math.sqrt(Math.pow(p2.getX()-p1.getX(), 2) + Math.pow(p2.getY()-p2.getY(), 2));
	}
}
