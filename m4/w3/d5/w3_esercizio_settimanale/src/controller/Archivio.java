package controller;

import javax.persistence.Query;

import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import enums.Periodicita;
import model.Articolo;
import model.Libri;
import model.Prestiti;
import model.Riviste;
import model.Utente;

public class Archivio {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("w3_d5");

	public static void main(String[] args) {

		// Articoli
		Libri open = new Libri();
		open.setTitoloArticolo("Open");
		open.setAnnoPubblicazioneArticolo(2009);
		open.setNumeroPagineArticolo(507);
		open.setAutoreLibri("Andre Agassi");
		open.setGenereLibri("Autobiografico");

		Riviste valeN46 = new Riviste();
		valeN46.setTitoloArticolo("Valentino Rossi n.46");
		valeN46.setAnnoPubblicazioneArticolo(2023);
		valeN46.setNumeroPagineArticolo(46);
		valeN46.setPeriodicitaRiviste(Periodicita.MENSILE);

		Libri codiceDaVinci = new Libri();
		codiceDaVinci.setTitoloArticolo("Il codice Da Vinci");
		codiceDaVinci.setAnnoPubblicazioneArticolo(2012);
		codiceDaVinci.setNumeroPagineArticolo(456);
		codiceDaVinci.setAutoreLibri("Dan Brown");
		codiceDaVinci.setGenereLibri("Romanzo");

		Riviste settimanaEnigmisticaN4023 = new Riviste();
		settimanaEnigmisticaN4023.setTitoloArticolo("La settimana enigmistica n.4023");
		settimanaEnigmisticaN4023.setAnnoPubblicazioneArticolo(2023);
		settimanaEnigmisticaN4023.setNumeroPagineArticolo(46);
		settimanaEnigmisticaN4023.setPeriodicitaRiviste(Periodicita.SETTIMANALE);

		Riviste tuttoMotoN122 = new Riviste();
		tuttoMotoN122.setTitoloArticolo("Tutto Moto n.122");
		tuttoMotoN122.setAnnoPubblicazioneArticolo(2023);
		tuttoMotoN122.setNumeroPagineArticolo(76);
		tuttoMotoN122.setPeriodicitaRiviste(Periodicita.MENSILE);

		Libri ilCalciatore = new Libri();
		ilCalciatore.setTitoloArticolo("Il calciatore d'oro");
		ilCalciatore.setAnnoPubblicazioneArticolo(2015);
		ilCalciatore.setNumeroPagineArticolo(278);
		ilCalciatore.setAutoreLibri("Beppe Bergomi");
		ilCalciatore.setGenereLibri("Sportivo");

		Libri libroBellissimo = new Libri();
		libroBellissimo.setTitoloArticolo("Libro bellissimo");
		libroBellissimo.setAnnoPubblicazioneArticolo(2057);
		libroBellissimo.setNumeroPagineArticolo(2875);
		libroBellissimo.setAutoreLibri("Autore bellissimo");
		libroBellissimo.setGenereLibri("Un genere bellissimo");

		// LibriDAO.salvaLibro(open);
		// RivisteDAO.salvaRivista(valeN46);
		// LibriDAO.salvaLibro(codiceDaVinci);
		// RivisteDAO.salvaRivista(settimanaEnigmisticaN4023);
		// RivisteDAO.salvaRivista(tuttoMotoN122);
		// LibriDAO.salvaLibro(ilCalciatore);
		// LibriDAO.salvaLibro(libroBellissimo);

		// Utenti
		Utente manuelFerrucci = new Utente();
		manuelFerrucci.setNomeUtente("Manuel");
		manuelFerrucci.setCognomeUtente("Ferrucci");
		manuelFerrucci.setDataNascitaUtente(new GregorianCalendar(1992, 1, 20).getTime());

		Utente damianoTiberi = new Utente();
		damianoTiberi.setNomeUtente("Damiano");
		damianoTiberi.setCognomeUtente("Tiberi");
		damianoTiberi.setDataNascitaUtente(new GregorianCalendar(1987, 8, 14).getTime());

		Utente stefanoGavioli = new Utente();
		stefanoGavioli.setNomeUtente("Stefano");
		stefanoGavioli.setCognomeUtente("Gavioli");
		stefanoGavioli.setDataNascitaUtente(new GregorianCalendar(2000, 6, 23).getTime());

		Utente francescoPastore = new Utente();
		francescoPastore.setNomeUtente("Francesco");
		francescoPastore.setCognomeUtente("Pastore");
		francescoPastore.setDataNascitaUtente(new GregorianCalendar(2001, 6, 14).getTime());

		Utente domenicoFrau = new Utente();
		domenicoFrau.setNomeUtente("Domenico");
		domenicoFrau.setCognomeUtente("Frau");
		domenicoFrau.setDataNascitaUtente(new GregorianCalendar(1990, 9, 11).getTime());

		Utente riccardoDamiani = new Utente();
		riccardoDamiani.setNomeUtente("Riccardo");
		riccardoDamiani.setCognomeUtente("Damiani");
		riccardoDamiani.setDataNascitaUtente(new GregorianCalendar(1997, 11, 23).getTime());

		// UtenteDAO.salvaUtente(manuelFerrucci);
		// UtenteDAO.salvaUtente(damianoTiberi);
		// UtenteDAO.salvaUtente(stefanoGavioli);
		// UtenteDAO.salvaUtente(francescoPastore);
		// UtenteDAO.salvaUtente(domenicoFrau);
		// UtenteDAO.salvaUtente(riccardoDamiani);

		// Prestiti
		Prestiti prestito1 = new Prestiti();
		prestito1.setUtente(manuelFerrucci);
		prestito1.setArticolo(open);
		prestito1.setDataInizioPrestiti(new GregorianCalendar(2023, 1, 17).getTime());

		Prestiti prestito2 = new Prestiti();
		prestito2.setUtente(damianoTiberi);
		prestito2.setArticolo(valeN46);
		prestito2.setDataInizioPrestiti(new GregorianCalendar(2023, 1, 17).getTime());

		Prestiti prestito3 = new Prestiti();
		prestito3.setUtente(stefanoGavioli);
		prestito3.setArticolo(codiceDaVinci);
		prestito3.setDataInizioPrestiti(new GregorianCalendar(2023, 1, 18).getTime());

		Prestiti prestito4 = new Prestiti();
		prestito4.setUtente(francescoPastore);
		prestito4.setArticolo(settimanaEnigmisticaN4023);
		prestito4.setDataInizioPrestiti(new GregorianCalendar(2023, 1, 18).getTime());

		Prestiti prestito5 = new Prestiti();
		prestito5.setUtente(domenicoFrau);
		prestito5.setArticolo(tuttoMotoN122);
		prestito5.setDataInizioPrestiti(new GregorianCalendar(2023, 0, 14).getTime());
		prestito5.setDataReseffettivaPrestiti(new GregorianCalendar(2023, 1, 2).getTime());

		Prestiti prestito6 = new Prestiti();
		prestito6.setUtente(riccardoDamiani);
		prestito6.setArticolo(ilCalciatore);
		prestito6.setDataInizioPrestiti(new GregorianCalendar(2022, 11, 7).getTime());

		// PrestitiDAO.salvaPrestito(prestito1);
		// PrestitiDAO.salvaPrestito(prestito2);
		// PrestitiDAO.salvaPrestito(prestito3);
		// PrestitiDAO.salvaPrestito(prestito4);
		// PrestitiDAO.salvaPrestito(prestito5);
		// PrestitiDAO.salvaPrestito(prestito6);

		
		
		
		///// CONSEGNA COMPITO /////

		// Aggiunge un articolo al db
		// LibriDAO.salvaLibro(libroBellissimo);
		
		// Elimina un articolo dal db
		// LibriDAO.eliminaLibro(libroBellissimo);
		
		// Ricerca tramite Id che nel mio db coincide con l'ISBN
		// LibriDAO.getByIdLibro(1);

		// Ricerca per ISBN
		ricercaPerISBN(2);

		// Ricerca per Anno di pubblicazione
		ricercaPerAnnoPubblicazione(2012);

		// Ricerca per autore
		ricercaPerAutore("Beppe Bergomi");
		
		// Ricerca per titolo (anche parziale, togliendo qualche lettera ed inserendo %)
		ricercaPerTitolo("Open");

		// Ricerca articoli attualmente in prestito dato un numero di tessera
		ricercaPerArticoliInPrestitoDatoNumeroTessera(2);

		// Ricerca prestiti scaduti non restituiti
		ricercaPrestitiScadutiNonRestituiti();
	}

	static List<Articolo> ricercaPerISBN(Integer ricerca) {
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("SELECT a FROM Articolo a WHERE a.idIsbnArticolo = ?1");
		query.setParameter(1, ricerca);
		List<Articolo> lista = query.getResultList();
		System.out.println(lista);
		return lista;
	}

	static List<Articolo> ricercaPerAnnoPubblicazione(Integer ricerca) {
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("SELECT a FROM Articolo a WHERE a.annoPubblicazioneArticolo = ?1");
		query.setParameter(1, ricerca);
		List<Articolo> lista = query.getResultList();
		System.out.println(lista);
		return lista;
	}

	static List<Articolo> ricercaPerAutore(String ricerca) {
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("SELECT a FROM Articolo a WHERE a.autoreLibri LIKE :ricercaCustom");
		query.setParameter("ricercaCustom", ricerca);
		List<Articolo> lista = query.getResultList();
		System.out.println(lista);
		return lista;
	}

	static List<Articolo> ricercaPerTitolo(String ricerca) {
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("SELECT a FROM Articolo a WHERE a.titoloArticolo LIKE :ricercaCustom");
		query.setParameter("ricercaCustom", ricerca);
		List<Articolo> lista = query.getResultList();
		System.out.println(lista);
		return lista;
	}

	static List<Articolo> ricercaPerArticoliInPrestitoDatoNumeroTessera(Integer ricerca) {
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery(
				"SELECT ar FROM Articolo ar INNER JOIN Prestiti pr ON (ar.idIsbnArticolo = pr.articolo) INNER JOIN Utente ut ON (pr.utente = ut.idTesseraUtente) WHERE ut.idTesseraUtente = ?1 AND pr.dataReseffettivaPrestiti IS NULL");
		query.setParameter(1, ricerca);
		List<Articolo> lista = query.getResultList();
		System.out.println(lista);
		return lista;
	}

	static List<Prestiti> ricercaPrestitiScadutiNonRestituiti() {
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery(
				"SELECT pr FROM Prestiti pr WHERE pr.dataResprevistaPrestiti < NOW() AND pr.dataReseffettivaPrestiti IS NULL");
		List<Prestiti> lista = query.getResultList();
		System.out.println(lista);
		return lista;
	}

}
