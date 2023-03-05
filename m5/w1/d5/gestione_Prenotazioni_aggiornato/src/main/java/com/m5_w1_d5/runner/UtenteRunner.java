package com.m5_w1_d5.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.m5_w1_d5.model.Utente;
import com.m5_w1_d5.service.UtenteService;

@Component
public class UtenteRunner implements ApplicationRunner {

	@Autowired
	UtenteService utenteService;

	@Override
	public void run(ApplicationArguments args) {
		try {
			System.out.println();
			System.out.println(
					"---------------SEPARATORE---------------SEPARATORE---------------SEPARATORE---------------SEPARATORE---------------SEPARATORE---------------");
			System.out.println();
			System.out.println("UtenteRunner partito correttamente...");
			System.out.println();

			// ISTANZE
			Utente manuelFerrucci = new Utente();
			manuelFerrucci.setUsernameUtente("Manuel_Ferrucci");
			manuelFerrucci.setNomeCompletoUtente("Manuel Ferrucci");
			manuelFerrucci.setEmailUtente("manuel@ferrucci.it");
			// utenteService.inserisciUtente(manuelFerrucci);

			Utente damianoTiberi = new Utente();
			damianoTiberi.setUsernameUtente("Damiano_Tiberi");
			damianoTiberi.setNomeCompletoUtente("Damiano Tiberi");
			damianoTiberi.setEmailUtente("damiano@tiberi.it");
			// utenteService.inserisciUtente(damianoTiberi);

			Utente umbertoEmanuele = new Utente();
			umbertoEmanuele.setUsernameUtente("Umberto_Emanuele");
			umbertoEmanuele.setNomeCompletoUtente("Umberto Emanuele");
			umbertoEmanuele.setEmailUtente("umberto@emanuele.it");
			// utenteService.inserisciUtente(umbertoEmanuele);

			Utente darioDelGiudice = new Utente();
			darioDelGiudice.setUsernameUtente("Dario_Del_Giudice");
			darioDelGiudice.setNomeCompletoUtente("Dario Del Giudice");
			darioDelGiudice.setEmailUtente("dario@delgiudice.it");
			// utenteService.inserisciUtente(darioDelGiudice);

			Utente rogerFederer = new Utente();
			rogerFederer.setUsernameUtente("Roger_Federer");
			rogerFederer.setNomeCompletoUtente("Roger Federer");
			rogerFederer.setEmailUtente("roger@federer.it");
			// utenteService.inserisciUtente(rogerFederer);
			
			// EVENTUALI MODIFICHE

		} catch (Exception e) {
			e.getMessage();
		}
	}

}
