package w2_d1;

import java.util.Scanner;

public class Automobile {
	String marca;
	String modello;

	public Automobile(String marca, String modello) {
		this.marca = marca;
		this.modello = modello;
	}

	public void calcoloConsumi() {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Quanti km ha fatto l'autovettura?");
			int km = scanner.nextInt();
			System.out.println("Quanti litri ha consumato l'autovettura?");
			int litri = scanner.nextInt();
			System.out.println("La macchina ha percorso " + (km / litri) + " km per litro.");
			System.out.println("Grazie per aver partecipato. Programma di calcolo terminato.");
		} catch (ArithmeticException err) {
			System.out.println("Non puoi dividere per 0");
			calcoloConsumi();
		}
	}
}
