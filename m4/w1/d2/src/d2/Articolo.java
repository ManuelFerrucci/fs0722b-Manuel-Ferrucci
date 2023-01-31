package d2;

public class Articolo {
	int codiceArticolo;
	String descrizioneArticolo;
	double prezzo;
	int pezziInMagazzino;

	public Articolo(int codiceArticolo, String descrizioneArticolo, double prezzo, int pezziInMagazzino) {
		this.codiceArticolo = codiceArticolo;
		this.descrizioneArticolo = descrizioneArticolo;
		this.prezzo = prezzo;
		this.pezziInMagazzino = pezziInMagazzino;
	}
}
