package d2;

import java.util.Arrays;

public class Sim {
	long numero;
	double credito = 0;
	Chiamata[] ultimeChiamate = new Chiamata[5];
	
	public Sim(long numero) {
		this.numero = numero;
	}
	
	public void stampaSim() {
		System.out.println("Numero di telefono: " + this.numero + " - " + "Credito: " + this.credito + " - " + "Chiamate: " + Arrays.toString(this.ultimeChiamate));
	}
}
