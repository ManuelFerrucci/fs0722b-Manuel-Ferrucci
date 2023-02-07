package w2_d2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Main {

		//////////////DECOMMENTARE IN MAIN PER VISUALIZZARE////////////////
	
	public static void main(String[] args) {
		// inserimentoParole();
		// generaNumeriCausali();
		// listaInversa();
		// verificaPariDispari(true);
	}

	static void inserimentoParole() {
		Scanner scanner = new Scanner(System.in);
		Set<String> parole = new HashSet<String>();
		Set<String> paroleDuplicate = new HashSet<String>();

		System.out.println("Inserisci un numero.");
		int dim = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < dim; i++) {
			System.out.println("Inserisci una parola.");
			String y = scanner.nextLine();
			if (parole.contains(y)) {
				System.out.println("Hai inserito un duplicato.");
				paroleDuplicate.add(y);
			} else {
				parole.add(y);
			}
		}
		System.out.println("Array di parole: " + parole);
		System.out.println("---------------------------------------------------");
		System.out.println("Array di parole duplicate: " + paroleDuplicate);
		System.out.println("---------------------------------------------------");
		System.out.println("Array di parole contiene: " + parole.size() + " parole");
		System.out.println("---------------------------------------------------");
	}

	public static List<Integer> generaNumeriCausali() {
		Scanner scanner = new Scanner(System.in);
		List<Integer> listaNumeri = new ArrayList<Integer>();

		System.out.println("Inserisci un numero.");
		int dim = Integer.parseInt(scanner.nextLine());
		Random random = new Random();

		boolean z = false;
		for (int i = 0; i < dim; i++) {
			int numeroRandom = random.nextInt(1, 101);
			/*
			 * for (int j = 0; j < dim; j++) { /////da approfondire perché da problemi if
			 * (listaNumeri.contains(numeroRandom)) { i--; z = true; } } if (z == true) { z
			 * = false; continue; }
			 */
			listaNumeri.add(numeroRandom);
		}
		System.out.println("Array casuale: " + listaNumeri);
		System.out.println("---------------------------------------------------");
		return listaNumeri;
	}

	public static List<Integer> listaInversa() {
		List<Integer> listaConNumeriInversi = new ArrayList<Integer>();
		List<Integer> listaSpecchiata = new ArrayList<Integer>();

		listaConNumeriInversi.addAll(generaNumeriCausali());
		// System.out.println(listaConNumeriInversi);

		for (int i = listaConNumeriInversi.size() - 1; i >= 0; i--) {
			listaSpecchiata.add(listaConNumeriInversi.get(i));
		}
		System.out.println("Array specchiato: " + listaSpecchiata);

		listaConNumeriInversi.addAll(listaSpecchiata);
		System.out.println("Array iniziale compreso di quello specchiato: " + listaConNumeriInversi);
		System.out.println("---------------------------------------------------");

		return listaConNumeriInversi;
	}

	public static void verificaPariDispari(boolean booleano) {
		List<Integer> listaVerifica = new ArrayList<Integer>();
		List<Integer> listaPari = new ArrayList<Integer>();
		List<Integer> listaDispari = new ArrayList<Integer>();

		listaVerifica.addAll(listaInversa());

		for (Integer numero : listaVerifica) {
			if (numero % 2 == 0) {
				listaPari.add(numero);
			} else {
				listaDispari.add(numero);
			}
		}
		if (booleano == true) {
			System.out.println("Booleano true, lista pari: " + listaPari);
			System.out.println("---------------------------------------------------");
		} else if (booleano == false) {
			System.out.println("Booleano false, lista dispari: " + listaDispari);
			System.out.println("---------------------------------------------------");
		}
	}
}
