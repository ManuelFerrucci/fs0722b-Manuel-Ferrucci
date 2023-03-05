package com.m5_w1_d5.runner;

import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.m5_w1_d5.model.Postazione;
import com.m5_w1_d5.model.Prenotazione;
import com.m5_w1_d5.model.Utente;
import com.m5_w1_d5.service.PostazioneService;
import com.m5_w1_d5.service.PrenotazioneService;
import com.m5_w1_d5.service.UtenteService;
import com.m5_w1_d5.utils.StatoPrenotazione;

@Component
public class PrenotazioneRunner implements ApplicationRunner {

	@Autowired
	PrenotazioneService prenotazioneService;

	@Autowired
	UtenteService utenteServicePrenot;

	@Autowired
	PostazioneService postazioneServicePrenot;

	@Override
	public void run(ApplicationArguments args) {
		try {
			System.out.println();
			System.out.println(
					"---------------SEPARATORE---------------SEPARATORE---------------SEPARATORE---------------SEPARATORE---------------SEPARATORE---------------");
			System.out.println();
			System.out.println("PrenotazioneRunner partito correttamente...");
			System.out.println();

			// ISTANZE
			Utente testManuelFerrucci = utenteServicePrenot.getByIdUtente(1);
			Utente testDamianoTiberi = utenteServicePrenot.getByIdUtente(2);
			Utente testUmbertoEmanuele = utenteServicePrenot.getByIdUtente(3);

			Postazione testSalaRiunioniPlazaHotel = postazioneServicePrenot.getByIdPostazione(1);
			Postazione testOpenSpaceRiunioniPlazaHotel = postazioneServicePrenot.getByIdPostazione(2);
			Postazione testUfficioValentinoFanclub = postazioneServicePrenot.getByIdPostazione(3);
			Postazione testOpenSpaceWimbledonPark = postazioneServicePrenot.getByIdPostazione(4);

			Prenotazione prenotazione1 = new Prenotazione();
			prenotazione1.setDataPrenotazione(new GregorianCalendar(2023, 2, 12).getTime());
			prenotazione1.setUtente(testManuelFerrucci);
			prenotazione1.setPostazione(testOpenSpaceWimbledonPark);
//			prenotazioneService.inserisciPrenotazione(prenotazione1, testOpenSpaceWimbledonPark,
//					testManuelFerrucci);

			Prenotazione prenotazione2 = new Prenotazione();
			prenotazione2.setDataPrenotazione(new GregorianCalendar(2023, 2, 8).getTime());
			prenotazione2.setUtente(testDamianoTiberi);
			prenotazione2.setPostazione(testUfficioValentinoFanclub);
//			prenotazioneService.inserisciPrenotazione(prenotazione2, testUfficioValentinoFanclub,
//					testDamianoTiberi);

			Prenotazione prenotazione3 = new Prenotazione();
			prenotazione3.setDataPrenotazione(new GregorianCalendar(2023, 2, 9).getTime());
			prenotazione3.setUtente(testDamianoTiberi);
			prenotazione3.setPostazione(testUfficioValentinoFanclub);
//			prenotazioneService.inserisciPrenotazione(prenotazione3, testUfficioValentinoFanclub,
//					testDamianoTiberi);

			Prenotazione prenotazione4 = new Prenotazione();
			prenotazione4.setDataPrenotazione(new GregorianCalendar(2023, 2, 9).getTime());
			prenotazione4.setUtente(testUmbertoEmanuele);
			prenotazione4.setPostazione(testOpenSpaceRiunioniPlazaHotel);
//			prenotazioneService.inserisciPrenotazione(prenotazione4, testOpenSpaceRiunioniPlazaHotel,
//					testUmbertoEmanuele);

			// SE VIENE DECOMMENTATO IL METODO DI INSERIMENTO DELLA PRENOTAZIONE CHE SEGUE,
			// USCIRA' IN CONSOLE UNA STAMPA CHE COMUNICHERA' CHE QUESTA PRENOTAZIONE NON
			// VERRA' EFFETTUATA PERCHE' QUESTA POSTAZIONE E' GIA' PRENOTATA IN QUESTA DATA,
			// (VEDI PRENOTAZIONE4)
			Prenotazione prenotazione5 = new Prenotazione();
			prenotazione5.setDataPrenotazione(new GregorianCalendar(2023, 2, 9).getTime());
			prenotazione5.setUtente(testDamianoTiberi);
			prenotazione5.setPostazione(testOpenSpaceRiunioniPlazaHotel);
//			prenotazioneService.inserisciPrenotazione(prenotazione5, testOpenSpaceRiunioniPlazaHotel,
//					testDamianoTiberi); 

			// SE VIENE DECOMMENTATO IL METODO DI INSERIMENTO DELLA PRENOTAZIONE CHE SEGUE,
			// USCIRA' IN CONSOLE UNA STAMPA CHE COMUNICHERA' CHE QUESTA PRENOTAZIONE NON
			// VERRA' EFFETTUATA PERCHE' QUESTO UTENTE HA GIA' ALTRE PRENOTAZIONI IN QUESTA
			// DATA, (VEDI PRENOTAZIONE3)
			Prenotazione prenotazione6 = new Prenotazione();
			prenotazione6.setDataPrenotazione(new GregorianCalendar(2023, 2, 9).getTime());
			prenotazione6.setUtente(testDamianoTiberi);
			prenotazione6.setPostazione(testOpenSpaceWimbledonPark);
//			prenotazioneService.inserisciPrenotazione(prenotazione6, testOpenSpaceWimbledonPark, testDamianoTiberi);

			// SE VIENE DECOMMENTATO IL METODO DI INSERIMENTO DELLA PRENOTAZIONE CHE SEGUE,
			// USCIRA' IN CONSOLE UNA STAMPA CHE COMUNICHERA' CHE QUESTA PRENOTAZIONE NON
			// VERRA' EFFETTUATA PERCHE' LA DATA E' ANTECEDENTE RISPETTO ALLA PRIMA
			// POSSIBILE (OVVERO IL GIORNO DOPO ALLA DATA IN CUI SI STA VISUALIZZANDO QUESTO
			// PROGETTO, IN POI)
			Prenotazione prenotazione7 = new Prenotazione();
			prenotazione7.setDataPrenotazione(new GregorianCalendar(2023, 2, 4).getTime());
			prenotazione7.setUtente(testManuelFerrucci);
			prenotazione7.setPostazione(testOpenSpaceRiunioniPlazaHotel);
//			prenotazioneService.inserisciPrenotazione(prenotazione7, testOpenSpaceRiunioniPlazaHotel, testManuelFerrucci);

			// EVENTUALI MODIFICHE PER VERIFICA

			// QUI DI SEGUITO HO CAMBIATO VOLUTAMENTE LA DATA DI PRENOTAZIONE2 PORTANDOLA AD
			// UNA DATA PASSATA PER PERMETTERE AL METODO IN BASSO DI FARE IL SUO LAVORO
//			Prenotazione verifica = prenotazioneService.getByIdPrenotazione(2);
//			verifica.setDataPrenotazione(new GregorianCalendar(2023, 2, 4).getTime());
//			prenotazioneService.modificaPrenotazione(verifica);

			///////////////// IMPORTANTE!!!!! ////////////////
			// IL METODO CHE SEGUE E' IN PRENOTAZIONESERVICE.JAVA E SERVE,
			// IN PROSPETTIVA DI UTILIZZO VERO, AD AGGIORNARE OGNI
			// GIORNO LO STATO DELLE PRENOTAZIONI A SECONDA
			// SE LA DATA DI PRENOTAZIONE E' PASSATA O E' ANCORA FUTURA.
			// BASTA LASCIARLO DECOMMENTATO E FA TUTTO LUI, SIA UN
			// SEMPLICE CONTROLLO CHE EVENTUALMENTE LA MODIFICA VERA E PROPRIA.
			// OVVIAMENTE SE DOVESSERO ESSERCI EVENTUALI COMANDI DECOMMENTATI
			// PIU' SU, CHE GLI DANNO FASTIDIO, POTREBBE NON STAMPARE NULLA

			prenotazioneService.aggiornamentoGiornalieroStatoPrenotazione();

		} catch (Exception e) {
			e.getMessage();
		}
	}

}
