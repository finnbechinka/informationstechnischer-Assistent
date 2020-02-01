package wesen;

public class Wesen {
	protected String name;
	protected double groesse;
	
	protected String getName(){
		return this.name;
	}
	
	protected double getGroesse(){
		return this.groesse;
	}
	
	protected void setGroesse(double gr){
		this.groesse = gr;
	}
}
