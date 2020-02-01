package fruechte;

public class Main {

	public static void main(String[] args) {
		Melone meineMelone = new Melone(true, "dick", "rund", "spanien", 7, true, "gruen", 30);
		Kaki meineKaki = new Kaki(true, "duenn", "ei", "china", 3, 500, 60);
		Weintraube meineWeintraube = new Weintraube(false, "sehr duenn", "rund", "deutschland", 4, true, "gruen");
		
		System.out.println(meineMelone.getHerkunft());
		System.out.println(meineMelone.getDurchmesser()+"\n");
		
		System.out.println(meineKaki.getForm());
		System.out.println(meineKaki.getReifegrad()+"\n");
		
		System.out.println(meineWeintraube.isSuess());
		System.out.println(meineWeintraube.getFarbe());
	}

}
