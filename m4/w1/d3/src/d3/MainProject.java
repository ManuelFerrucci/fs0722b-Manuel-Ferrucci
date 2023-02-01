package d3;

import java.util.Scanner;

//import java.util.Scanner;
//import java.util.Arrays;

public class MainProject {

	public static void main(String[] args) {

		// Esercizio 1
		pariDispari("Ciao");
		annoBisestile(2000);
		System.out.println(""); // separatore degli esercizi in console

		// Esercizio 2
		stampaValoreSwitch(3);
		System.out.println(""); // separatore degli esercizi in console

		// Esercizio 3
		separaCaratteri();
		System.out.println(""); // separatore degli esercizi in console

		// Esercizio 4
		contoRovescia(5);
		
	}

	// Esercizio 1
	public static boolean pariDispari(String x) {

		int numeroCaratteri = x.length();

		if (numeroCaratteri % 2 == 0) {
			System.out.println("- Esercizio1 - Pari: true");
			return true;
		} else {
			System.out.println("- Esercizio1 - Pari: false");
			return false;
		}
	}

	public static boolean annoBisestile(int x) {

		if (x % 4 == 0 || (x % 100 == 0 && x % 400 == 0)) {
			System.out.println("- Esercizio1 - Bisestile: true");
			return true;
		} else {
			System.out.println("- Esercizio1 - Bisestile: false");
			return false;
		}
	}

	// Esercizio 2
	public static void stampaValoreSwitch(int x) {

		switch (x) {
		case 0:
			System.out.println("- Esercizio2 - Numero scelto: Zero");
			break;
		case 1:
			System.out.println("- Esercizio2 - Numero scelto: Uno");
			break;
		case 2:
			System.out.println("- Esercizio2 - Numero scelto: Due");
			break;
		case 3:
			System.out.println("- Esercizio2 - Numero scelto: Tre");
			break;
		default:
			System.out.println("- Esercizio2 - Errore, numero non compreso tra 0 e 3!");
		}
	}

	// Esercizio 3
	public static void separaCaratteri() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserire una stringa non vuota. Se vuoi uscire, inserisci :q");
		String x = scanner.nextLine().trim();
		while (!x.equalsIgnoreCase(":q")) {
			System.out.println(String.join(",", x.split("")));
			System.out.println("Inserire una stringa non vuota. Se vuoi uscire, inserisci :q");
			x = scanner.nextLine().trim();
		}
		System.out.println("Hai inserito :q, fine del gioco. Alla prossima!");
	}

	// Esercizio 4
	public static void contoRovescia(int x) {
		for (int i = x; i >= 0; i--) {
			System.out.println("- Esercizio4 - Countdown ciclo numero: " + i);
		}
	}

}
