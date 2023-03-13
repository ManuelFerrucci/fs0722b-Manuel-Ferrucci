package com.Ese_1_secretCode.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.Ese_1_secretCode.models.Edificio;
import com.Ese_1_secretCode.models.Utente;
import com.Ese_1_secretCode.services.EdificioService;
import com.Ese_1_secretCode.services.UtenteService;

@Component
public class UtenteRunner implements ApplicationRunner {

	@Autowired
	UtenteService utenteService;

	@Autowired
	EdificioService edificioService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println();
		System.out.println("Runner di Utente partito correttamente!");

		Edificio testDamianoHouse = edificioService.trovaEdificioById(1l);
		Edificio testManuelHouse = edificioService.trovaEdificioById(2l);
		Edificio testCasaAnonima = edificioService.trovaEdificioById(3l);

		Utente damianoTiberi = new Utente();
		damianoTiberi.setNome("Damiano");
		damianoTiberi.setCognome("Tiberi");
		damianoTiberi.setEdificio(testCasaAnonima);
		// utenteService.salvaUtente(damianoTiberi);

		Utente manuelFerrucci = new Utente();
		manuelFerrucci.setNome("Manuel");
		manuelFerrucci.setCognome("Ferrucci");
		// utenteService.salvaUtente(manuelFerrucci);
		
		Utente testManuelFerrucci = utenteService.trovaUtenteById(2l);
		testManuelFerrucci.setEdificio(testManuelHouse);
		// utenteService.modificaUtente(testManuelFerrucci);
		
		testManuelHouse.setCodiceDiSbloccoInserito("87654321");
		// edificioService.modificaEdificio(testManuelHouse);

		System.out.println();
	}

}
