package controller;

import enums.Periodicita;
import model.Libri;
import model.Prestiti;
import model.Riviste;
import model.Utente;

public class Archivio {

	public static void main(String[] args) {
		Libri open = new Libri();
		open.setTitoloLibri("Open - La mia storia");
		open.setAnnoPubblicazioneLibri("2009");
		open.setNumeroPagineLibri(502);
		open.setAutoreLibri("Andre Agassi");
		open.setGenereLibri("Autobiografico");
		
		Libri tennis = new Libri();
		tennis.setTitoloLibri("Tennis");
		tennis.setAnnoPubblicazioneLibri("2011");
		tennis.setNumeroPagineLibri(343);
		tennis.setAutoreLibri("Giorgio Castelli");
		tennis.setGenereLibri("Sport");

		LibriDAO.salvaLibro(open);
		// LibriDAO.salvaLibro(tennis);

		Riviste focusN120 = new Riviste();
		focusN120.setTitoloRiviste("Focus - n.120");
		focusN120.setAnnoPubblicazioneRiviste("2003");
		focusN120.setNumeroPagineRiviste(87);
		focusN120.setPeriodicitaRiviste(Periodicita.MENSILE);

		// RivisteDAO.salvaRivista(focusN120);

		Utente manuelFerrucci = new Utente();
		manuelFerrucci.setNomeUtente("Manuel");
		manuelFerrucci.setCognomeUtente("Ferrucci");
		manuelFerrucci.setDataNascitaUtente("1992-02-20");

		Utente damianoTiberi = new Utente();
		damianoTiberi.setNomeUtente("Damiano");
		damianoTiberi.setCognomeUtente("Tiberi");
		damianoTiberi.setDataNascitaUtente("1987-09-14");
		
		Utente stefanoGavioli = new Utente();
		stefanoGavioli.setNomeUtente("Stefano");
		stefanoGavioli.setCognomeUtente("Gavioli");
		stefanoGavioli.setDataNascitaUtente("2000-04-24");

		UtenteDAO.salvaUtente(manuelFerrucci);
		// UtenteDAO.salvaUtente(damianoTiberi);
		// UtenteDAO.salvaUtente(stefanoGavioli);

		Prestiti prestito1 = new Prestiti();
		prestito1.setUtente(manuelFerrucci);
		prestito1.setLibri(open);
		prestito1.setDataInizioPrestiti("2023-02-17");
		prestito1.setDataResprevistaPrestiti("2023-03-17");
		prestito1.setDataReseffettivaPrestiti("Non ancora consegnato");
		prestito1.setTipoArticoloPrestiti("Libro");

		Prestiti prestito2 = new Prestiti();
		prestito2.setUtente(damianoTiberi);
		prestito2.setRiviste(focusN120);
		prestito2.setDataInizioPrestiti("2023-02-17");
		prestito2.setDataResprevistaPrestiti("2023-03-17");
		prestito2.setDataReseffettivaPrestiti("Non ancora consegnato");
		prestito2.setTipoArticoloPrestiti("Rivista");

		Prestiti prestito3 = new Prestiti();
		prestito3.setUtente(stefanoGavioli);
		prestito3.setLibri(tennis);
		prestito3.setDataInizioPrestiti("2023-02-17");
		prestito3.setDataResprevistaPrestiti("2023-03-17");
		prestito3.setDataReseffettivaPrestiti("Non ancora consegnato");
		prestito3.setTipoArticoloPrestiti("Libro");
		
		PrestitiDAO.salvaPrestito(prestito1);
		// PrestitiDAO.salvaPrestito(prestito2);
		// PrestitiDAO.salvaPrestito(prestito3);
		

	}

}
