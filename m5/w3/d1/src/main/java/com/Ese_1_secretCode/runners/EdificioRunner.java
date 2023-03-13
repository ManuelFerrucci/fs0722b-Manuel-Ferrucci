package com.Ese_1_secretCode.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.Ese_1_secretCode.models.Edificio;
import com.Ese_1_secretCode.services.EdificioService;

@Component
public class EdificioRunner implements ApplicationRunner {

	@Autowired
	EdificioService edificioService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println();
		System.out.println("Runner di Edificio partito correttamente!");

		Edificio damianoHouse = new Edificio();
		damianoHouse.setNome("Damiano's House");
		damianoHouse.setIndirizzo("Via Gavioli, 1000");
		damianoHouse.setCitta("Gaviolopoli");
		damianoHouse.setCodiceSicurezza("12345678");
		// edificioService.salvaEdificio(damianoHouse);

		Edificio manuelHouse = new Edificio();
		manuelHouse.setNome("Manuel's House");
		manuelHouse.setIndirizzo("Via Gavioli, 1001");
		manuelHouse.setCitta("Gaviolopoli");
		manuelHouse.setCodiceSicurezza("87654321");
		// edificioService.salvaEdificio(manuelHouse);

		Edificio casaAnonima = new Edificio();
		casaAnonima.setNome("Casa anonima");
		casaAnonima.setIndirizzo("Via Gavioli, 1002");
		casaAnonima.setCitta("Gaviolopoli");
		casaAnonima.setCodiceDiSbloccoInserito("12346789");
		casaAnonima.setCodiceSicurezza("12346789");
		// edificioService.salvaEdificio(casaAnonima);
		
	}

}
