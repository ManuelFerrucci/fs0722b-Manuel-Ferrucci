package com.Ese_2_microservizi2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ese_2_microservizi2.models.Utente;
import com.Ese_2_microservizi2.repositories.UtenteRepository;

@Service
public class UtenteService {

	@Autowired
	UtenteRepository utenteRepository;

	public void salvaUtente(Utente utente) {
		utenteRepository.save(utente);
		System.out.println("Utente salvato!");
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
		utenteRepository.save(utente);
		System.out.println("Utente modificato correttamente!");
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
