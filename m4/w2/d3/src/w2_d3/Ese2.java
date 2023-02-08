package w2_d3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ese2 extends Thread {
	List<Integer> listaCompleta = new ArrayList<Integer>();
	
	List<Integer> lista1 = new ArrayList<Integer>();
	List<Integer> lista2 = new ArrayList<Integer>();
	List<Integer> lista3 = new ArrayList<Integer>();

	public List<Integer> generaRandom() {
		Random random = new Random();

		for (int i = 0; i < 3000; i++) {
			int numeroRandom = random.nextInt(1, 3001);
			listaCompleta.add(numeroRandom);
		}

		System.out.println("Array principale: " + listaCompleta);
		System.out.println("---------------------------------------------------");
		System.out.println("Dimensione array principale: " + listaCompleta.size() + " elementi");
		System.out.println("---------------------------------------------------");
		return listaCompleta;
	}

	public List<Integer> dividiArray() {
		for (int i = 0; i < 1000; i++) {
			lista1.add(listaCompleta.get(i));
		}
		for (int j = 1000; j < 2000; j++) {
			lista2.add(listaCompleta.get(j));
		}
		for (int z = 2000; z < 3000; z++) {
			lista3.add(listaCompleta.get(z));
		}

		System.out.println("Array 1: " + lista1);
		System.out.println("Array 2: " + lista2);
		System.out.println("Array 3: " + lista3);
		System.out.println("---------------------------------------------------");

		return lista1;
	}

	public synchronized int sommaElementiInLista(List<Integer> lista) {
		int somma = 0;
		for (int i = 0; i < lista.size(); i++) {
			somma += lista.get(i);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("STO AVENDO UN PO' DI PROBLEMI");
		}

		System.out.println("La somma degli elementi nell'array ammonta a " + somma);
		System.out.println("--------------------------------------------------------------");
		return somma;
	}

	public int sommaArray() {
		int sommaFinale = sommaElementiInLista(lista1) + sommaElementiInLista(lista2) + sommaElementiInLista(lista3);
		System.out.println("La somma degli elementi di tutti gli array ammonta a " + sommaFinale);
		System.out.println("--------------------------------------------------------------");
		return sommaFinale;
	}

}
