package d2;

public class Carrello {

	Cliente clienteAssociato;
	Articolo elencoArticoli[];
	double totaleCostoArticoli = 0;

	public Carrello(Cliente clienteAssociato, Articolo elencoArticoli[]) {
		this.clienteAssociato = clienteAssociato;
		this.elencoArticoli = elencoArticoli;

		for (int i = 0; i < elencoArticoli.length; i++) {
			this.totaleCostoArticoli += elencoArticoli[i].prezzo;
		}
	}
}
