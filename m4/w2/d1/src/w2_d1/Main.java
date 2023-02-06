package w2_d1;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// ESERCIZIO 1
		int[] arrayNumeriCasuali = new int[5];
		generaArray(arrayNumeriCasuali);
		cambiaNumeroInArray(arrayNumeriCasuali);

		// ESERCIZIO 2
		Automobile fordKuga = new Automobile("Ford", "Kuga");
		fordKuga.calcoloConsumi();

	}

	static void generaArray(int[] x) {
		boolean z = false;
		for (int i = 0; i < x.length; i++) {
			Random random = new Random();
			int numeroRandom = random.nextInt(1, 10);
			for (int j = 0; j < x.length; j++) {
				if (x[j] == numeroRandom) {
					i--;
					z = true;
				}
			}
			if (z == true) {
				z = false;
				continue;
			}
			x[i] = numeroRandom;
		}
		System.out.println("Array di numeri casuali generato: " + Arrays.toString(x));
		System.out.println("--------------------------------------------------------------------------");
	}

	static void cambiaNumeroInArray(int[] x) {
		int w;
		int y;
		Scanner scanner = new Scanner(System.in);
		try {
			do {
				System.out.println("In quale posizione vuoi cambiare il numero? Digita tra 1 e 5.");
				y = scanner.nextInt();
				System.out.println(
						"Con che numero vuoi cambiare quello indicato? Digita tra 1 e 10. Se vuoi uscire digita zero.");
				w = scanner.nextInt();

				if (w > 0 && w <= 10) {
					x[y - 1] = w;
					System.out.println("Array dopo la modifica: " + Arrays.toString(x));
					System.out.println("--------------------------------------------------------------------------");
				} else if (w > 10) {
					System.out.println(
							"Non puoi inserire un numero maggiore di 10. Inserisci un numero compreso tra 1 e 10.");
					w = scanner.nextInt();
					x[y - 1] = w;
					System.out.println("Array dopo la modifica: " + Arrays.toString(x));
					System.out.println("--------------------------------------------------------------------------");
				} else {
					System.out.println("Sei uscito dal programma. Arrivederci!");
					System.out.println("--------------------------------------------------------------------------");
				}
			} while (w != 0);
		} catch (InputMismatchException err) {
			System.out.println("Errore. Non puoi inserire un dato diverso da un numero intero.");
			cambiaNumeroInArray(x);
		} catch (ArrayIndexOutOfBoundsException err) {
			System.out.println("Errore. Selezionare una posizione da 1 a 5.");
			cambiaNumeroInArray(x);
		}
	}

}
