package it.epicode.be;

import java.util.Arrays;
import java.util.Scanner;

public class Helloworld {
	
	
	public static void main (String[] args) {
		
		// Esercizio 1
		System.out.println("Il mio primo progetto Java!");
		
		// Esercizio 2
		System.out.println("Risultato della moltiplicazione: " + moltiplica(2,3)); //inserisci i parametri che preferisci
		
		System.out.println(concatena("Il mio numero preferito: ", 3)); //inserisci i parametri che preferisci
		
		String arrx [] = {"Mario", "Luca", "Andrea", "Manuel", "Giuseppe"};
		String nomeDaAggiungere = "Flavio";
		System.out.println("Array ricomposto: " + Arrays.toString(inserisciInArray(arrx, nomeDaAggiungere))); //inserisci i parametri che preferisci
		
		//Esercizio 3
		main2();
		
		//Esercizio 4
		System.out.println("Perimetro rettangolo: " + perimetroRettangolo(2.45, 3.67)); //inserisci i parametri che preferisci
		
		System.out.println("Numero uscito: " + pariDispari(3)); //inserisci i parametri che preferisci
		
		System.out.println("Area triangolo: " + areaTriangolo(11.55, 6.45)); //inserisci i parametri che preferisci
	}
	
	public static int moltiplica(int x, int y) {
		//System.out.println("Risultato della moltiplicazione: " + (x * y));
		return x * y;
	}
	
	public static String concatena(String x, int y) {
		return x + y;
	}
	
	public static String [] inserisciInArray(String x [], String y) {
		String z [] = new String [6];
		z[0] = x[0];
		z[1] = x[1];
		z[2] = y;
		z[3] = x[2];
		z[4] = x[3];
		z[5] = x[4];
		return z;
	}
	
	public static void main2() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Scrivi la prima stringa: ");
		String primaStringa = scanner.nextLine();
		System.out.println("Scrivi la seconda stringa: ");
		String secondaStringa = scanner.nextLine();
		System.out.println("Scrivi la terza stringa: ");
		String terzaStringa = scanner.nextLine();
		
		System.out.println("Ordine normale: " + primaStringa + ", " + secondaStringa + ", " + terzaStringa);
		System.out.println("Ordine inverso: " + terzaStringa + ", " + secondaStringa + ", " + primaStringa);
	}
	
	public static double perimetroRettangolo(double x, double y) {
		return (x + y)*2;
	}
	
	public static int pariDispari(int x) {
		if(x % 2 == 0) {
			return 0;
		} else {
			return 1;
		}
	}
	
	public static double areaTriangolo(double x, double y) {
		return (x * y) / 2;
	}
}



