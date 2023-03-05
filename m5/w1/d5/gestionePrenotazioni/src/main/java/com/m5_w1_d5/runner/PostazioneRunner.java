package com.m5_w1_d5.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.m5_w1_d5.model.Edificio;
import com.m5_w1_d5.model.Postazione;
import com.m5_w1_d5.service.EdificioService;
import com.m5_w1_d5.service.PostazioneService;
import com.m5_w1_d5.utils.StatoPostazione;
import com.m5_w1_d5.utils.TipoPostazione;

@Component
public class PostazioneRunner implements ApplicationRunner {

	@Autowired
	PostazioneService postazioneService;

	@Autowired
	EdificioService edificioServicePost;

	@Override
	public void run(ApplicationArguments args) {
		try {
			System.out.println();
			System.out.println(
					"---------------SEPARATORE---------------SEPARATORE---------------SEPARATORE---------------SEPARATORE---------------SEPARATORE---------------");
			System.out.println();
			System.out.println("PostazioneRunner partito correttamente...");
			System.out.println();

			// ISTANZE
			Edificio testPlazaHotel = edificioServicePost.getByIdEdificio(1);
			Edificio testValentinoFanclub = edificioServicePost.getByIdEdificio(2);
			Edificio testWimbledonPark = edificioServicePost.getByIdEdificio(3);

			Postazione salaRiunioniPlazaHotel = new Postazione();
			salaRiunioniPlazaHotel.setDescrizionePostazione("Sala riunioni e convegni al terzo piano del Plaza Hotel");
			salaRiunioniPlazaHotel.setTipoPostazione(TipoPostazione.SALA_RIUNIONI);
			salaRiunioniPlazaHotel.setMassimoPartecipantiPostazione(30);
			salaRiunioniPlazaHotel.setIdEdificio(testPlazaHotel);
			// postazioneService.inserisciPostazione(salaRiunioniPlazaHotel);

			Postazione openSpacePlazaHotel = new Postazione();
			openSpacePlazaHotel.setDescrizionePostazione("Open space al piano terra del Plaza Hotel");
			openSpacePlazaHotel.setTipoPostazione(TipoPostazione.OPENSPACE);
			openSpacePlazaHotel.setMassimoPartecipantiPostazione(20);
			openSpacePlazaHotel.setIdEdificio(testPlazaHotel);
			// postazioneService.inserisciPostazione(openSpacePlazaHotel);

			Postazione ufficioValentinoFanclub = new Postazione();
			ufficioValentinoFanclub.setDescrizionePostazione("Ufficio privato al primo piano del Valentino Fan Club");
			ufficioValentinoFanclub.setTipoPostazione(TipoPostazione.PRIVATO);
			ufficioValentinoFanclub.setMassimoPartecipantiPostazione(46);
			ufficioValentinoFanclub.setIdEdificio(testValentinoFanclub);
			// postazioneService.inserisciPostazione(ufficioValentinoFanclub);

			Postazione openSpaceWimbledonPark = new Postazione();
			openSpaceWimbledonPark
					.setDescrizionePostazione("Open space in giardino coperto, nel complesso di Wimbledon Park");
			openSpaceWimbledonPark.setTipoPostazione(TipoPostazione.OPENSPACE);
			openSpaceWimbledonPark.setMassimoPartecipantiPostazione(50);
			openSpaceWimbledonPark.setIdEdificio(testWimbledonPark);
			// postazioneService.inserisciPostazione(openSpaceWimbledonPark);

			// METODO DI RICERCA SOLO PER TIPO POSTAZIONE,
			// CAMBIARE IL TIPO CHE SI DESIDERA CERCARE, ALL'OCCORRENZA.
			// IL METODO SI TROVA IN POSTAZIONESERVICE.JAVA
			postazioneService.findByTipoPostazione(TipoPostazione.OPENSPACE);
			
			System.out.println();

			// METODO DI RICERCA PER TIPO POSTAZIONE E CITTA',
			// CAMBIARE IL TIPO E LA CITTA'CHE SI DESIDERA CERCARE, ALL'OCCORRENZA.
			// IL METODO SI TROVA IN POSTAZIONESERVICE.JAVA
			postazioneService.findPostazioniByTipoPostazioneAndEdificioCittaEdificio(TipoPostazione.PRIVATO, "Tavullia");
			
			// EVENTUALI MODIFICHE

		} catch (Exception e) {
			e.getMessage();
		}
	}

}
