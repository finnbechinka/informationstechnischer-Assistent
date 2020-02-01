package wesen;

public class Zwerg extends Wesen{
	private boolean hatZipfelmuetze;
	
	public Zwerg(){
	}
	
	public Zwerg(String name){
		super.name = name;
	}
	
	public void setGroesse(int gr){
		super.groesse = gr;
	}
	
	public void setGroesse(String gr){
		super.groesse = Double.parseDouble(gr);
	}
	
	public void setHatZipfelmuetze(boolean hatZM){
		this.hatZipfelmuetze = hatZM;
	}
	
	public void showZwerg(){
		System.out.println("----------");
		System.out.println(super.name);
		System.out.println(super.groesse);
		System.out.println(this.hatZipfelmuetze);
	}
}
