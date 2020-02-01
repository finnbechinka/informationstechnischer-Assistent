package sensoren;

public class Main {

	public static void main(String[] args) {
		Abstandssensor as = new Abstandssensor();
		System.out.println(as.sTyp());
		as.startMessung();
		System.out.println(as.status());
		as.stopMessung();
	}

}
