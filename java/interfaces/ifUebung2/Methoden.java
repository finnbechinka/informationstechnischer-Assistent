package ifUebung2;

public class Methoden implements IMaschinenSteuerung {

	@Override
	public boolean maschienStatus(int status) {
		switch(status){
			case 0:
				return false;
			case 1:
				return true;
			default:
				return false;
		}
		
	}

	@Override
	public float leistungsBerechnung(float strom, float spannung) {
		return spannung * strom;
	}

	@Override
	public float[] verarbeiteWerte(float[] messdaten) {
		float[] tmp = new float[messdaten.length - 1];
		for(int i = 0; i < tmp.length; i++){
			tmp[i] = messdaten[i+1] - messdaten[i];
		}
		return tmp;
	}

	@Override
	public void fehlerzustand(Zustand z) {
		if(z.getZustandnr() == 3) System.out.println("Fehlerzustand");
	}

}
