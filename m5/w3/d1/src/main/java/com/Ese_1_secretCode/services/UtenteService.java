package com.Ese_1_secretCode.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ese_1_secretCode.models.Utente;
import com.Ese_1_secretCode.repositories.EdificioRepository;
import com.Ese_1_secretCode.repositories.UtenteRepository;
import com.Ese_1_secretCode.utils.StatoCodiceSicurezzaEdificio;

@Service
public class UtenteService {

	@Autowired
	UtenteRepository utenteRepository;

	@Autowired
	EdificioRepository edificioRepository;

	public void salvaUtente(Utente utente) {
		if (utente.getEdificio() == null) {
			System.out.println("Utente salvato correttamente!");
		} else {
			if (utente.getEdificio().getStatoCodice() == StatoCodiceSicurezzaEdificio.BLOCCATO) {
				utente.setEdificio(null);
				System.out.println(
						"Utente salvato, ma non e' stato assegnato all'edificio indicato perche' esso risulta BLOCCATO.");
			} else {
				System.out.println("Utente salvato correttamente!");
			}
		}
		utenteRepository.save(utente);
	}

	public Utente trovaUtenteById(Long id) {
		Utente utente = utenteRepository.findById(id).get();
		if (utenteRepository.existsById(id)) {
			System.out.println(utente);
			return utente;
		} else {
			System.out.println("L'utente con id " + id + " non esiste!");
		}

		return null;
	}

	public void modificaUtente(Utente utente) {
		if (utente.getEdificio() == null) {
			System.out.println("Utente modificato correttamente!");
		} else {
			if (utente.getEdificio().getStatoCodice() == StatoCodiceSicurezzaEdificio.BLOCCATO) {
				utente.setEdificio(null);
				System.out.println(
						"Utente modificato, ma non e' stato assegnato all'edificio indicato perche' esso risulta BLOCCATO.");
			} else {
				System.out.println("Utente modificato correttamente!");
			}
		}
		utenteRepository.save(utente);
	}

	public void eliminaUtente(Utente utente) {
		utenteRepository.delete(utente);
		System.out.println("Utente eliminato correttamente!");
	}

	public void vediTuttiGliUtenti() {
		List<Utente> listaUtenti = utenteRepository.findAll();
		if (listaUtenti.isEmpty()) {
			System.out.println("La lista è vuota!");
		} else {
			for (Utente utente : listaUtenti) {
				System.out.println(utente);
			}
		}
	}

}
