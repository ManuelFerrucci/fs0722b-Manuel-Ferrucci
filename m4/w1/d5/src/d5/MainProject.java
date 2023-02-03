package d5;

import java.util.Scanner;

public class MainProject {

	static Riproduttore file1;
	static Riproduttore file2;
	static Riproduttore file3;
	static Riproduttore file4;
	static Riproduttore file5;

	public static void main(String[] args) {
		int tipo;
		Scanner primoScanner = new Scanner(System.in);

		do {
			System.out.println("Seleziona il file 1/5 tra: Immagine (1), Video(2), Suono(3)");
			tipo = primoScanner.nextInt();

			switch (tipo) {
			case 1:
				Scanner primoscanner1 = new Scanner(System.in);
				System.out.println("Titolo immagine: ");
				String titolo = primoscanner1.nextLine();

				System.out.println("Luminosita immagine: ");
				int luminosita = primoscanner1.nextInt();
				System.out.println("Complimenti, file aggiunto in modo corretto!");
				System.out.println();

				file1 = new Immagine(titolo, luminosita);
				file1.xImmagine = 1;
				break;

			case 2:
				Scanner primoScanner2 = new Scanner(System.in);
				System.out.println("Titolo Video: ");
				String titolo2 = primoScanner2.nextLine();

				System.out.println("Durata Video ");
				int tempo2 = primoScanner2.nextInt();

				System.out.println("Luminosita video: ");
				int luminosita2 = primoScanner2.nextInt();

				System.out.println("Volume video: ");
				int volume2 = primoScanner2.nextInt();
				System.out.println("Complimenti, file aggiunto in modo corretto!");
				System.out.println();

				file1 = new Video(titolo2, tempo2, luminosita2, volume2);
				file1.xImmagine = 0;
				break;

			case 3:
				Scanner primoScanner3 = new Scanner(System.in);
				System.out.println("Titolo suono: ");
				String title3 = primoScanner3.nextLine();

				System.out.println("Tempo suono: ");
				int tempo3 = primoScanner3.nextInt();

				System.out.println("Volume suono: ");
				int volume3 = primoScanner3.nextInt();
				System.out.println("Complimenti, file aggiunto in modo corretto!");
				System.out.println();

				file1 = new Suono(title3, tempo3, volume3);
				file1.xImmagine = 0;
				break;
			default:
				System.out.println("Errore, inserire un numero da 1 a 3!");
			}
		} while (tipo != 1 && tipo != 2 && tipo != 3);

		// file2

		do {
			System.out.println("Seleziona il file 2/5 tra: Immagine (1), Video(2), Suono(3)");
			tipo = primoScanner.nextInt();

			switch (tipo) {

			case 1:
				Scanner primoscanner1 = new Scanner(System.in);
				System.out.println("Titolo immagine: ");
				String titolo = primoscanner1.nextLine();

				System.out.println("Luminosita immagine: ");
				int luminosita = primoscanner1.nextInt();
				System.out.println("Complimenti, file aggiunto in modo corretto!");
				System.out.println();

				file2 = new Immagine(titolo, luminosita);
				file2.xImmagine = 1;
				break;

			case 2:
				Scanner primoScanner2 = new Scanner(System.in);
				System.out.println("Titolo Video: ");
				String titolo2 = primoScanner2.nextLine();

				System.out.println("Durata Video ");
				int tempo2 = primoScanner2.nextInt();

				System.out.println("Luminosita video: ");
				int luminosita2 = primoScanner2.nextInt();

				System.out.println("Volume video: ");
				int volume2 = primoScanner2.nextInt();
				System.out.println("Complimenti, file aggiunto in modo corretto!");
				System.out.println();

				file2 = new Video(titolo2, tempo2, luminosita2, volume2);
				file2.xImmagine = 0;
				break;

			case 3:
				Scanner primoScanner3 = new Scanner(System.in);
				System.out.println("Titolo suono: ");
				String title3 = primoScanner3.nextLine();

				System.out.println("Tempo suono: ");
				int tempo3 = primoScanner3.nextInt();

				System.out.println("Volume suono: ");
				int volume3 = primoScanner3.nextInt();
				System.out.println("Complimenti, file aggiunto in modo corretto!");
				System.out.println();

				file2 = new Suono(title3, tempo3, volume3);
				file2.xImmagine = 0;
				break;
			default:
				System.out.println("Errore, inserire un numero da 1 a 3!");
			}
		} while (tipo != 1 && tipo != 2 && tipo != 3);

		// file3

		do {
			System.out.println("Seleziona il file 3/5 tra: Immagine (1), Video(2), Suono(3)");
			tipo = primoScanner.nextInt();

			switch (tipo) {

			case 1:
				Scanner primoscanner1 = new Scanner(System.in);
				System.out.println("Titolo immagine: ");
				String titolo = primoscanner1.nextLine();

				System.out.println("Luminosita immagine: ");
				int luminosita = primoscanner1.nextInt();
				System.out.println("Complimenti, file aggiunto in modo corretto!");
				System.out.println();

				file3 = new Immagine(titolo, luminosita);
				file3.xImmagine = 1;
				break;

			case 2:
				Scanner primoScanner2 = new Scanner(System.in);
				System.out.println("Titolo Video: ");
				String titolo2 = primoScanner2.nextLine();

				System.out.println("Durata Video ");
				int tempo2 = primoScanner2.nextInt();

				System.out.println("Luminosita video: ");
				int luminosita2 = primoScanner2.nextInt();

				System.out.println("Volume video: ");
				int volume2 = primoScanner2.nextInt();
				System.out.println("Complimenti, file aggiunto in modo corretto!");
				System.out.println();

				file3 = new Video(titolo2, tempo2, luminosita2, volume2);
				file3.xImmagine = 0;
				break;

			case 3:
				Scanner primoScanner3 = new Scanner(System.in);
				System.out.println("Titolo suono: ");
				String title3 = primoScanner3.nextLine();

				System.out.println("Tempo suono: ");
				int tempo3 = primoScanner3.nextInt();

				System.out.println("Volume suono: ");
				int volume3 = primoScanner3.nextInt();
				System.out.println("Complimenti, file aggiunto in modo corretto!");
				System.out.println();

				file3 = new Suono(title3, tempo3, volume3);
				file3.xImmagine = 0;
				break;
			default:
				System.out.println("Errore, inserire un numero da 1 a 3!");
			}
		} while (tipo != 1 && tipo != 2 && tipo != 3);

		// file4

		do {
			System.out.println("Seleziona il file 4/5 tra: Immagine (1), Video(2), Suono(3)");
			tipo = primoScanner.nextInt();

			switch (tipo) {

			case 1:
				Scanner primoscanner1 = new Scanner(System.in);
				System.out.println("Titolo immagine: ");
				String titolo = primoscanner1.nextLine();

				System.out.println("Luminosita immagine: ");
				int luminosita = primoscanner1.nextInt();
				System.out.println("Complimenti, file aggiunto in modo corretto!");
				System.out.println();

				file4 = new Immagine(titolo, luminosita);
				file4.xImmagine = 1;
				break;

			case 2:
				Scanner primoScanner2 = new Scanner(System.in);
				System.out.println("Titolo Video: ");
				String titolo2 = primoScanner2.nextLine();

				System.out.println("Durata Video ");
				int tempo2 = primoScanner2.nextInt();

				System.out.println("Luminosita video: ");
				int luminosita2 = primoScanner2.nextInt();

				System.out.println("Volume video: ");
				int volume2 = primoScanner2.nextInt();
				System.out.println("Complimenti, file aggiunto in modo corretto!");
				System.out.println();

				file4 = new Video(titolo2, tempo2, luminosita2, volume2);
				file4.xImmagine = 0;
				break;

			case 3:
				Scanner primoScanner3 = new Scanner(System.in);
				System.out.println("Titolo suono: ");
				String title3 = primoScanner3.nextLine();

				System.out.println("Tempo suono: ");
				int tempo3 = primoScanner3.nextInt();

				System.out.println("Volume suono: ");
				int volume3 = primoScanner3.nextInt();
				System.out.println("Complimenti, file aggiunto in modo corretto!");
				System.out.println();

				file4 = new Suono(title3, tempo3, volume3);
				file4.xImmagine = 0;
				break;
			default:
				System.out.println("Errore, inserire un numero da 1 a 3!");
			}
		} while (tipo != 1 && tipo != 2 && tipo != 3);

		// file5

		do {
			System.out.println("Seleziona il file 5/5 tra: Immagine (1), Video(2), Suono(3)");
			tipo = primoScanner.nextInt();

			switch (tipo) {

			case 1:
				Scanner primoscanner1 = new Scanner(System.in);
				System.out.println("Titolo immagine: ");
				String titolo = primoscanner1.nextLine();

				System.out.println("Luminosita immagine: ");
				int luminosita = primoscanner1.nextInt();
				System.out.println("Complimenti, file aggiunto in modo corretto!");
				System.out.println();

				file5 = new Immagine(titolo, luminosita);
				file5.xImmagine = 1;
				break;

			case 2:
				Scanner primoScanner2 = new Scanner(System.in);
				System.out.println("Titolo Video: ");
				String titolo2 = primoScanner2.nextLine();

				System.out.println("Durata Video ");
				int tempo2 = primoScanner2.nextInt();

				System.out.println("Luminosita video: ");
				int luminosita2 = primoScanner2.nextInt();

				System.out.println("Volume video: ");
				int volume2 = primoScanner2.nextInt();
				System.out.println("Complimenti, file aggiunto in modo corretto!");
				System.out.println();

				file5 = new Video(titolo2, tempo2, luminosita2, volume2);
				file5.xImmagine = 0;
				break;

			case 3:
				Scanner primoScanner3 = new Scanner(System.in);
				System.out.println("Titolo suono: ");
				String title3 = primoScanner3.nextLine();

				System.out.println("Tempo suono: ");
				int tempo3 = primoScanner3.nextInt();

				System.out.println("Volume suono: ");
				int volume3 = primoScanner3.nextInt();
				System.out.println("Complimenti, file aggiunto in modo corretto!");
				System.out.println();

				file5 = new Suono(title3, tempo3, volume3);
				file5.xImmagine = 0;
				break;
			default:
				System.out.println("Errore, inserire un numero da 1 a 3!");
			}
		} while (tipo != 1 && tipo != 2 && tipo != 3);

		Scanner secondoScanner = new Scanner(System.in);

		int selezionati;
		do {
			System.out.println();
			System.out.println("Digita un numero da 1 a 5 per eseguire un file: ");
			selezionati = secondoScanner.nextInt();
			switch (selezionati) {
			case 1:
				switch (file1.xImmagine) {
				case 1:
					file1.show();
					break;
				case 0:
					file1.play();
					break;
				}
				break;
			case 2:
				switch (file2.xImmagine) {
				case 1:
					file2.show();
					break;
				case 0:
					file2.play();
					break;
				}
				break;
			case 3:
				switch (file3.xImmagine) {
				case 1:
					file3.show();
					break;
				case 0:
					file3.play();
					break;
				}
				break;
			case 4:
				switch (file4.xImmagine) {
				case 1:
					file4.show();
					break;
				case 0:
					file4.play();
					break;
				}
				break;
			case 5:
				switch (file5.xImmagine) {
				case 1:
					file5.show();
					break;
				case 0:
					file5.play();
					break;
				}
				break;
			case 0:
				System.out.println("Sei uscito dalla riproduzione, alla prossima!");
				break;
			default:
				System.out
						.println("Errore, no files per questo id! Digita un numero da 1 a 5 per tornare al controllo.");
				selezionati = secondoScanner.nextInt();
			}
		} while (selezionati != 0 && selezionati <= 5);
	}
}
