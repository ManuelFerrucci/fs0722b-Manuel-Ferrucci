package w2_d5.catalogo_bibliografico;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

public class Catalogo {

	static File file = new File("fileEsercizio.txt");

	public static void main(String[] args) {

		//////////////////// LISTA ARTICOLI ////////////////////
		List<Prodotto> listaProdotti = new ArrayList<Prodotto>();

		//////////////////// ISTANZE DEI LIBRI ////////////////////
		Libri open = new Libri(8806229729L, "Open - La mia storia", "2009", 502, "Andre Agassi", "autobiografico");
		Libri dioDellaRacchetta = new Libri(8867766511L, "Il dio della racchetta", "2017", 136, "Simone Fornara",
				"sport");
		Libri tennisComeEsperienzaReligiosa = new Libri(8806210920L, "Il tennis come esperienza religiosa", "2017", 96,
				"David Foster Wallace", "sport");
		Libri libroSegnaposto = new Libri(880435943540L, "Segnaposto", "DuemilaMAI", 46, "Autore x", "sport");

		//////////////////// ISTANZE DELLE RIVISTE ////////////////////
		Riviste ilTennisItalianoN1137 = new Riviste(9798733089232L, "Il tennis italiano - n.1137", "2022", 73,
				Periodicita.MENSILE);
		Riviste focusN120 = new Riviste(9770397837347L, "Focus - n.120", "2002", 87, Periodicita.MENSILE);
		Riviste settimanaEnigmisticaN4742 = new Riviste(8340712832023L, "La settimana enigmistica - n.4742", "2023", 44,
				Periodicita.SETTIMANALE);
		Riviste rivistaSegnaposto = new Riviste(880985643540L, "Segnaposto", "DuemilaMAI", 49, Periodicita.SEMESTRALE);

		listaProdotti.add(ilTennisItalianoN1137);
		listaProdotti.add(open);
		listaProdotti.add(focusN120);
		listaProdotti.add(dioDellaRacchetta);
		listaProdotti.add(settimanaEnigmisticaN4742);
		listaProdotti.add(tennisComeEsperienzaReligiosa);

		////////// ESECUZIONE DEI METODI //////////
		visualizzaListaProdotti(listaProdotti); 					///// STAMPA DELLA LISTA
		aggiungiRivista(listaProdotti, rivistaSegnaposto); 			///// AGGIUNGE UNA RIVISTA ALLA LISTA
		aggiungiLibro(listaProdotti, libroSegnaposto); 				///// AGGIUNGE UN LIBRO ALLA LISTA
		visualizzaListaProdotti(listaProdotti); 					///// STAMPA DELLA LISTA DOPO LA CANCELLAZIONE
		eliminaProdottoTramiteIsbn(listaProdotti, 880435943540L); 	///// ELIMINA UN PRODOTTO DALLA LISTA
		cercaProdottoTramiteIsbn(listaProdotti, 8867766511L); 		///// CERCA UN PRODOTTO NELLA LISTA CON ISBN
		cercaProdottoTramiteDataPub(listaProdotti, "2017"); 		///// CERCA UN PRODOTTO NELLA LISTA CON DATA PUB
		cercaProdottoTramiteAutore(listaProdotti, "Andre Agassi"); 	///// CERCA UN PRODOTTO NELLA LISTA CON AUTORE
		cercaProdottoTramiteAutore(listaProdotti, "Pippo"); 		///// ERRORE CREATO APPOSITAMENTE PER VERIFICA

		////////// MANIPOLAZIONE FILE //////////
		// convertiInStringa(listaProdotti);
		scriviFile(listaProdotti);
		leggiFile();

	}

	////////// METODI //////////
	public static void visualizzaListaProdotti(List<Prodotto> listaProdotti) {
		listaProdotti.forEach(ele -> {
			String x = ele.getClass().toString();
			if (x.contains("Libri")) {
				System.out.println("Libro: " + ele.getTitolo());
			} else {
				System.out.println("Rivista: " + ele.getTitolo());
			}
		});
		System.out.println("------------------------------------------------------------------------");
	}

	public static void aggiungiLibro(List<Prodotto> listaProdotti, Libri libro) {
		listaProdotti.add(libro);
		System.out.println("Libro " + libro.getTitolo() + " correttamente aggiunto!");
		System.out.println("------------------------------------------------------------------------");
	}

	public static void aggiungiRivista(List<Prodotto> listaProdotti, Riviste rivista) {
		listaProdotti.add(rivista);
		System.out.println("Rivista " + rivista.getTitolo() + " correttamente aggiunta!");
		System.out.println("------------------------------------------------------------------------");
	}

	public static void eliminaProdottoTramiteIsbn(List<Prodotto> listaProdotti, long isbn) {
		List<Prodotto> listaSenzaElemento = listaProdotti.stream().filter(ele -> ele.getCodiceISBN() != isbn).toList();
		listaProdotti.clear();
		listaProdotti.addAll(listaSenzaElemento);
		System.out.println("Elemento eliminato!");
		if (listaProdotti.size() >= 1) {
			System.out.println();
			System.out.println("Lista aggiornata:");
			visualizzaListaProdotti(listaProdotti);
		} else {
			System.out.println("La tua lista non contiene alcun elemento!");

		}
	}

	public static void cercaProdottoTramiteIsbn(List<Prodotto> listaProdotti, long isbn) {
		List<Prodotto> prodottiTrovati = listaProdotti.stream().filter(ele -> ele.getCodiceISBN() == isbn).toList();
		if (prodottiTrovati.size() >= 1) {
			prodottiTrovati.forEach(ele -> {
				String x = ele.getClass().toString();
				if (x.contains("Libri")) {
					System.out.println("Libro trovato tramite isbn (" + isbn + "): " + ele.getTitolo());
				} else {
					System.out.println("Rivista trovata tramite isbn (" + isbn + "): " + ele.getTitolo());
				}
			});
		} else {
			System.out.println("La tua ricerca tramite isbn (" + isbn + ") non ha prodotto nessun risultato!");
		}
		System.out.println("------------------------------------------------------------------------");
	}

	public static void cercaProdottoTramiteDataPub(List<Prodotto> listaProdotti, String annoPub) {
		List<Prodotto> prodottiTrovati = listaProdotti.stream()
				.filter(ele -> ele.getAnnoPubblicazione().equalsIgnoreCase(annoPub)).toList();
		if (prodottiTrovati.size() >= 1) {
			prodottiTrovati.forEach(ele -> {
				String x = ele.getClass().toString();
				if (x.contains("Libri")) {
					System.out.println(
							"Libro trovato tramite data di pubblicazione (" + annoPub + "): " + ele.getTitolo());
				} else {
					System.out.println(
							"Rivista trovata tramite data di pubblicazione (" + annoPub + "): " + ele.getTitolo());
				}
			});
		} else {
			System.out.println(
					"La tua ricerca tramite data di pubblicazione (" + annoPub + ") non ha prodotto nessun risultato!");
		}

		System.out.println("------------------------------------------------------------------------");
	}

	public static void cercaProdottoTramiteAutore(List<Prodotto> listaProdotti, String autore) {
		List<Prodotto> prodottiTrovati = listaProdotti.stream().filter(ele -> ele.getAutore().equalsIgnoreCase(autore))
				.toList();
		if (prodottiTrovati.size() >= 1) {
			prodottiTrovati.forEach(ele -> {
				///// FATTO SOLO PER I LIBRI PERCHE' LE RIVISTE NON HANNO ATTRIBUTO AUTORE
				System.out.println("Libro trovato tramite autore (" + autore + "): " + ele.getTitolo());
			});
		} else {
			System.out.println("La tua ricerca tramite l'autore (" + autore + ") non ha prodotto nessun risultato!");
		}
		System.out.println("------------------------------------------------------------------------");

	}

	public static void scriviFile(List<Prodotto> listaProdotti) {
		try {
			FileUtils.writeLines(file, "UTF-8", listaProdotti);
			System.out.println("Scrittura su file di testo eseguita!");
			System.out.println("------------------------------------------------------------------------");
		} catch (IOException e) {
			System.out.println("ERRORE DURANTE LA SCRITTURA");
			System.out.println("------------------------------------------------------------------------");
		}
	}

	public static void leggiFile() {
		try (InputStream input = new FileInputStream("fileEsercizio.txt")) {
			System.out.println("Lettura del file di testo: ");
			System.out.println(IOUtils.toString(input, "UTF-8"));
			System.out.println("------------------------------------------------------------------------");
		} catch (IOException e) {
			System.out.println("ERRORE DURANTE LA LETTURA");
			System.out.println("------------------------------------------------------------------------");
		}
	}
}
