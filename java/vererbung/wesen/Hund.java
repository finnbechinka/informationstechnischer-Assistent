package wesen;

public class Hund extends Wesen{
	private String rasse;
	
	public Hund(){
		
	}
	
	public Hund(String rasse){
		this.rasse = rasse;
	}
	
	public void setName(String name){
		super.name = name;
	}
	
	public String getRasse(){
		return this.rasse;
	}
	
	public void showHund(){
		System.out.println("----------");
		System.out.println(super.name);
		System.out.println(super.groesse);
		System.out.println(this.rasse);
	}
}
