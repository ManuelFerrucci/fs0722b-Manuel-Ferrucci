package com.GestioneIncendi2.runners;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class GestioneIncendiRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println();
		System.out.println("GestioneIncendiRunner Run...");
		System.out.println();

		System.out.println();
	}

}
