package schueler;

public class Schueler {
	private static int anzahlSchueler;
	private int sid;
	private String name;
	private int alter;
	
	public Schueler(){
		anzahlSchueler++;
		sid = anzahlSchueler;
	}
	
	public Schueler(String name, int alter){
		anzahlSchueler++;
		sid = anzahlSchueler;
		this.name = name;
		this.alter = alter;
	}

	public int getSid(){
		return this.sid;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}
	
	
}
