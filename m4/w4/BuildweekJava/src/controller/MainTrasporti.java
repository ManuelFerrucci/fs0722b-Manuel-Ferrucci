package controller;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import enums.DurataAbbonamento;
import enums.MetodoDiVendita;
import enums.StatoBiglietto;
import enums.StatoDistributoreAutomatico;
import enums.StatoMezzoDiTrasporto;
import model.Abbonamento;
import model.Autobus;
import model.Biglietto;
import model.DistributoreAutomatico;
import model.MezzoDiTrasporto;
import model.RivenditoreAutorizzato;
import model.Tessera;
import model.TitoloDiViaggio;
import model.Tram;
import model.Tratta;
import model.Utente;

public class MainTrasporti {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("BuildweekJava");
	static EntityManager em = emf.createEntityManager();

	public static void main(String[] args) {

		// Creazione Utenti
		Utente manuelFerrucci = new Utente();
		manuelFerrucci.setNomeUtente("Manuel");
		manuelFerrucci.setCognomeUtente("Ferrucci");
		manuelFerrucci.setDataNascitaUtente(new GregorianCalendar(1992, 1, 20).getTime());
		manuelFerrucci.setCodiceFiscaleUtente("A100");
		// UtenteDAO.salvaUtente(manuelFerrucci);

		Utente stefanoGavioli = new Utente();
		stefanoGavioli.setNomeUtente("Stefano");
		stefanoGavioli.setCognomeUtente("Gavioli");
		stefanoGavioli.setDataNascitaUtente(new GregorianCalendar(2000, 3, 24).getTime());
		stefanoGavioli.setCodiceFiscaleUtente("A101");
		// UtenteDAO.salvaUtente(stefanoGavioli);

		// Creazione Tessere
		Tessera tesseraFerrucciM = new Tessera();
		tesseraFerrucciM.setDataInizioTessera(new GregorianCalendar(2023, 1, 21).getTime());
		// TesseraDAO.salvaTessera(tesseraFerrucciM);

		Tessera tesseraGavioliS = new Tessera();
		tesseraGavioliS.setDataInizioTessera(new GregorianCalendar(2023, 1, 22).getTime());
		// TesseraDAO.salvaTessera(tesseraGavioliS);

		// Creazione Abbonamenti
		Abbonamento abbonamentoFerrucciM = new Abbonamento();
		abbonamentoFerrucciM.setMetodoVenditaTitoloDiViaggio(MetodoDiVendita.DistributoreAutomatico);
		abbonamentoFerrucciM.setDurataAbbonamento(DurataAbbonamento.Mensile);
		abbonamentoFerrucciM.setDataInizioAbbonamento(new GregorianCalendar(2023, 1, 21).getTime());
		// AbbonamentoDAO.salvaAbbonamento(abbonamentoFerrucciM);

		Abbonamento abbonamentoGavioliS = new Abbonamento();
		abbonamentoGavioliS.setMetodoVenditaTitoloDiViaggio(MetodoDiVendita.DistributoreAutomatico);
		abbonamentoGavioliS.setDurataAbbonamento(DurataAbbonamento.Settimanale);
		abbonamentoGavioliS.setDataInizioAbbonamento(new GregorianCalendar(2023, 1, 22).getTime());
		// AbbonamentoDAO.salvaAbbonamento(abbonamentoGavioliS);

		// Creazione Biglietti
		Biglietto biglietto1 = new Biglietto();
		biglietto1.setMetodoVenditaTitoloDiViaggio(MetodoDiVendita.DistributoreAutomatico);
		biglietto1.setDataAcquistoBiglietto(new GregorianCalendar(2023, 1, 22).getTime());
		biglietto1.setStatoBiglietto(StatoBiglietto.Attivo);
		// BigliettoDAO.salvaBiglietto(biglietto1);

		Biglietto biglietto2 = new Biglietto();
		biglietto2.setMetodoVenditaTitoloDiViaggio(MetodoDiVendita.DistributoreAutomatico);
		biglietto2.setDataAcquistoBiglietto(new GregorianCalendar(2023, 1, 22).getTime());
		biglietto2.setStatoBiglietto(StatoBiglietto.Attivo);
		// BigliettoDAO.salvaBiglietto(biglietto2);

		Biglietto biglietto3 = new Biglietto();
		biglietto3.setMetodoVenditaTitoloDiViaggio(MetodoDiVendita.RivenditoreAutorizzato);
		biglietto3.setDataAcquistoBiglietto(new GregorianCalendar(2023, 1, 23).getTime());
		biglietto3.setStatoBiglietto(StatoBiglietto.Attivo);
		// BigliettoDAO.salvaBiglietto(biglietto3);

		// Creazione Distributore Automatico
		DistributoreAutomatico distributoreAutMantovaN1 = new DistributoreAutomatico();
		distributoreAutMantovaN1.setNomePuntoDiEmissione("Distributore automatico n.1");
		distributoreAutMantovaN1.setIndirizzoPuntoDiEmissione("Via Verdi n.56");
		distributoreAutMantovaN1.setCittaPuntoDiEmissione("Mantova");
		distributoreAutMantovaN1.setStatoDistributoreAutomatico(StatoDistributoreAutomatico.Attivo);
		// DistributoreAutomaticoDAO.salvaDistributoreAutomatico(distributoreAutMantovaN1);

		// Creazione Rivenditore Autorizzato
		RivenditoreAutorizzato rivenditoreAutorBolognaN1 = new RivenditoreAutorizzato();
		rivenditoreAutorBolognaN1.setNomePuntoDiEmissione("Tabacchi LA BOLOGNESE");
		rivenditoreAutorBolognaN1.setIndirizzoPuntoDiEmissione("Via Garibaldi n.33");
		rivenditoreAutorBolognaN1.setCittaPuntoDiEmissione("Bologna");
		// RivenditoreAutorizzatoDAO.salvaRivenditoreAutorizzato(rivenditoreAutorBolognaN1);

		// Creazione mezzi di trasporto
		Autobus autobusUrbanoN1 = new Autobus();
		autobusUrbanoN1.setStatoMezzoDiTrasporto(StatoMezzoDiTrasporto.InServizio);
		// AutobusDAO.salvaAutobus(autobusUrbanoN1);

		Tram tramUrbano1 = new Tram();
		tramUrbano1.setStatoMezzoDiTrasporto(StatoMezzoDiTrasporto.InServizio);
		// TramDAO.salvaTram(tramUrbano1);

		// Creazione Tratta
		Tratta trattaRomaNapoli = new Tratta();
		trattaRomaNapoli.setLuogoPartenzaTratta("Roma");
		trattaRomaNapoli.setLuogoCapolineaTratta("Napoli");
		trattaRomaNapoli.setOraInizioTratta(new GregorianCalendar(2023, 1, 22, 8, 0).getTime());
		trattaRomaNapoli.setOraFineTratta(new GregorianCalendar(2023, 1, 22, 12, 0).getTime());
		trattaRomaNapoli.setTempoMedioTratta(new GregorianCalendar(2023, 1, 22, 4, 0).getTime());
		// TrattaDAO.salvaTratta(trattaRomaNapoli);

		////////// Modifiche //////////
		// Utente test = UtenteDAO.getByIdUtente(1);
		// test.setIdTessera(TesseraDAO.getByIdTessera(1));
		// UtenteDAO.modificaUtente(test);

		// Utente test1 = UtenteDAO.getByIdUtente(2);
		// test1.setIdTessera(TesseraDAO.getByIdTessera(2));
		// UtenteDAO.modificaUtente(test1);

		// Tessera tesseraTest = TesseraDAO.getByIdTessera(1);
		// tesseraTest.setIdUtente(UtenteDAO.getByIdUtente(1));
		// TesseraDAO.modificaTessera(tesseraTest);

		// Tessera tesseraTest1 = TesseraDAO.getByIdTessera(2);
		// tesseraTest1.setIdUtente(UtenteDAO.getByIdUtente(2));
		// TesseraDAO.modificaTessera(tesseraTest1);

		// Tessera tesseraTest2 = TesseraDAO.getByIdTessera(1);
		// tesseraTest2.setIdAbbonamento(AbbonamentoDAO.getByIdAbbonamento(1));
		// TesseraDAO.modificaTessera(tesseraTest2);

		// Tessera tesseraTest3 = TesseraDAO.getByIdTessera(2);
		// tesseraTest3.setIdAbbonamento(AbbonamentoDAO.getByIdAbbonamento(2));
		// TesseraDAO.modificaTessera(tesseraTest3);

		// Abbonamento testAbb = AbbonamentoDAO.getByIdAbbonamento(1);
		/*
		 * testAbb.setIdTessera(TesseraDAO.getByIdTessera(1));
		 * AbbonamentoDAO.modificaAbbonamento(testAbb);
		 */

		// Abbonamento testAbb1 = AbbonamentoDAO.getByIdAbbonamento(2);
		/*
		 * testAbb1.setIdTessera(TesseraDAO.getByIdTessera(2));
		 * AbbonamentoDAO.modificaAbbonamento(testAbb1);
		 */

		// Biglietto testBigl1 = BigliettoDAO.getByIdBiglietto(5);
		// Biglietto testBigl2 = BigliettoDAO.getByIdBiglietto(4);
		// Biglietto testBigl3 = BigliettoDAO.getByIdBiglietto(5);

		// DistributoreAutomatico distrmantova1 =
		// DistributoreAutomaticoDAO.getByIdDistributoreAutomatico(1);
		// RivenditoreAutorizzato rivbologna1 =
		// RivenditoreAutorizzatoDAO.getByIdRivenditoreAutorizzato(2);
		// testBigl1.setPuntoDiEmissione(distrmantova1);
		// testAbb1.setPuntoDiEmissione(distrmantova1);
		// BigliettoDAO.modificaBiglietto(testBigl1);
		// AbbonamentoDAO.modificaAbbonamento(testAbb1);

		// Autobus testAutobus = AutobusDAO.getByIdAutobus(1);
		// Tram testTram = TramDAO.getByIdTram(2);
		// Biglietto testBigl1 = BigliettoDAO.getByIdBiglietto(3);
		// Biglietto testBigl2 = BigliettoDAO.getByIdBiglietto(4);
		// Biglietto testBigl3 = BigliettoDAO.getByIdBiglietto(5);
		// Abbonamento testAbb = AbbonamentoDAO.getByIdAbbonamento(1);
		// Abbonamento testAbb2 = AbbonamentoDAO.getByIdAbbonamento(2);

		// testBigl1.setStatoBiglietto(StatoBiglietto.Attivo);
		// testBigl1.setDataVidimazioneBiglietto(null);
		// BigliettoDAO.modificaBiglietto(testBigl1);
		// BigliettoDAO.vidimaBigliettoAutobus(testAutobus, testBigl1);
		// AbbonamentoDAO.vidimaAbbonamentoAutobus(testAutobus, testAbb);
		// BigliettoDAO.vidimaBigliettoTram(testTram, testBigl3);
		// AbbonamentoDAO.vidimaAbbonamentoTram(testTram, testAbb2);
		// AutobusDAO.scendeUnUtente(testAutobus);
		// TramDAO.scendeUnUtente(testTram);
		// AutobusDAO.scendonoTuttiGliUtenti(testAutobus);
		// TramDAO.scendonoTuttiGliUtenti(testTram);

		// Query
		// cercaTitoliDaIdEmissione(2);

	}

	// QUERY
	public static List<TitoloDiViaggio> cercaTitoliDaIdEmissione(Integer id) {
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery(
				"SELECT t FROM TitoloDiViaggio t WHERE t.puntoDiEmissione.id = ?1 ORDER BY t.idTitoloDiViaggio ASC");
		q.setParameter(1, id);
		List<TitoloDiViaggio> lista = q.getResultList();
		System.out.println(lista);
		return lista;
	}
}
