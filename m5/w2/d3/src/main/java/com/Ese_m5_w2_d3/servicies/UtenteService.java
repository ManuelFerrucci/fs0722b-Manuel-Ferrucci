package com.Ese_m5_w2_d3.servicies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ese_m5_w2_d3.models.Utente;
import com.Ese_m5_w2_d3.repositories.UtenteRepository;

@Service
public class UtenteService {

	@Autowired
	UtenteRepository utenteRepo;

	public void creaUtente(Utente utente) {
		if (utenteRepo.existsByUsername(utente.getUsername())) {
			System.out.println("Utente gia' presente!");
		} else {
			try {
				utenteRepo.save(utente);
			} catch (Exception e) {
				e.getMessage();
			}
		}
	}

}
