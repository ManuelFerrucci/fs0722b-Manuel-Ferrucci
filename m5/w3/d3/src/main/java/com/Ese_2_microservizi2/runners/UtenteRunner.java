package com.Ese_2_microservizi2.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.Ese_2_microservizi2.models.Utente;
import com.Ese_2_microservizi2.services.UtenteService;

@Component
public class UtenteRunner implements ApplicationRunner {

	@Autowired
	UtenteService utenteService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println();
		System.out.println("Runner di Utente partito correttamente!");

		Utente damianoTiberi = new Utente();
		damianoTiberi.setNome("Damiano");
		damianoTiberi.setCognome("Tiberi");
		damianoTiberi.setEmail("ignorante@ignorante.it");
		damianoTiberi.setUsername("Ignorantissimo");
		damianoTiberi.setPassword("346327432748");
		// utenteService.salvaUtente(damianoTiberi);

		Utente manuelFerrucci = new Utente();
		manuelFerrucci.setNome("Manuel");
		manuelFerrucci.setCognome("Ferrucci");
		manuelFerrucci.setEmail("ignorantissimo@ignorante.it");
		manuelFerrucci.setUsername("Ignorantissimo e mezzo");
		manuelFerrucci.setPassword("98787342374");
		// utenteService.salvaUtente(manuelFerrucci);
		
		Utente stefanoGavioli = new Utente();
		stefanoGavioli.setNome("Stefano");
		stefanoGavioli.setCognome("Gavioli");
		stefanoGavioli.setEmail("fortissimo@ignorante.it");
		stefanoGavioli.setUsername("StefanoFortissimo");
		stefanoGavioli.setPassword("56455343343");
		// utenteService.salvaUtente(stefanoGavioli);

		System.out.println();
	}

}
