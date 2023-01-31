package d2;

public class Esercizio_giorno2 {

	public static void main(String[] args) {
		// Esercizio rettangoli
		Rettangolo rettangolo1 = new Rettangolo(5.3, 10.8);
		stampaRettangolo(rettangolo1);
		Rettangolo rettangolo2 = new Rettangolo(11.4, 13.6);
		stampaDueRettangoli(rettangolo1, rettangolo2);

		// Esercizio sim
		Sim sim1 = new Sim(123456789L);
		sim1.stampaSim();

		// Esercizio e-commerce
		Cliente cliente1 = new Cliente(1, "Mario Rossi", "cliente@cliente.it", "1/1/1900");

		Articolo articolo1 = new Articolo(1, "bello", 15, 5);
		Articolo articolo2 = new Articolo(1, "bello", 13, 8);
		Articolo arr[] = { articolo1, articolo2 };

		Carrello carr = new Carrello(cliente1, arr);

		System.out.println("Totale in carrello: " + carr.totaleCostoArticoli + " euro");
	}

	public static void stampaRettangolo(Rettangolo a) {
		a.calcolaPerimetroRettangolo();
		a.calcolaAreaRettangolo();
	}

	public static void stampaDueRettangoli(Rettangolo a, Rettangolo b) {
		System.out.println("Perimetro rettangolo1: " + a.calcolaPerimetroRettangolo() + " cm");
		System.out.println("Area rettangolo2: " + a.calcolaAreaRettangolo() + " cm quadrati");

		System.out.println("Perimetro rettangolo1: " + b.calcolaPerimetroRettangolo() + " cm");
		System.out.println("Area rettangolo2: " + b.calcolaAreaRettangolo() + " cm quadrati");

		System.out.println("Somma perimetri rettangoli 1 e 2: "
				+ (a.calcolaPerimetroRettangolo() + b.calcolaPerimetroRettangolo()) + " cm");
		System.out.println("Somma aree rettangoli 1 e 2: " + (a.calcolaAreaRettangolo() + b.calcolaAreaRettangolo())
				+ " cm quadrati");
	}
}
