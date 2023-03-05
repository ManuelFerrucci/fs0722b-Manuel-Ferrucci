package com.m5_w1_d5.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.m5_w1_d5.model.Edificio;
import com.m5_w1_d5.service.EdificioService;

@Component
public class EdificioRunner implements ApplicationRunner {

	@Autowired
	EdificioService edificioService;

	@Override
	public void run(ApplicationArguments args) {
		try {
			System.out.println();
			System.out.println(
					"---------------SEPARATORE---------------SEPARATORE---------------SEPARATORE---------------SEPARATORE---------------SEPARATORE---------------");
			System.out.println();
			System.out.println("EdificioRunner partito correttamente...");
			System.out.println();

			// ISTANZE
			Edificio plazaHotel = new Edificio();
			plazaHotel.setNomeEdificio("Plaza Hotel");
			plazaHotel.setIndirizzoEdificio("Via Rossi, 59");
			plazaHotel.setCittaEdificio("Roma");
			// edificioService.inserisciEdificio(plazaHotel);

			Edificio valentinoFanclub = new Edificio();
			valentinoFanclub.setNomeEdificio("Valentino Fan Club");
			valentinoFanclub.setIndirizzoEdificio("Via Gialli, 46");
			valentinoFanclub.setCittaEdificio("Tavullia");
			// edificioService.inserisciEdificio(valentinoFanclub);

			Edificio wimbledonPark = new Edificio();
			wimbledonPark.setNomeEdificio("Wimbledon Park");
			wimbledonPark.setIndirizzoEdificio("Via Tennis, 22");
			wimbledonPark.setCittaEdificio("Londra");
			// edificioService.inserisciEdificio(wimbledonPark);

			// EVENTUALI MODIFICHE

		} catch (Exception e) {
			e.getMessage();
		}
	}

}
