package schueler;

import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Schueler s1 = new Schueler();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Alter:");
		s1.setAlter(scanner.nextInt());
		System.out.println("\nName:");
		scanner.nextLine();
		s1.setName(scanner.nextLine());
		
		System.out.println("\nid: " + s1.getSid() + "\nName: " + s1.getName() + "\nAlter: " + s1.getAlter());
	}

}
