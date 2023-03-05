package com.m5_w1_d5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m5_w1_d5.model.Utente;
import com.m5_w1_d5.repository.UtenteDaoRepository;

@Service
public class UtenteService {

	@Autowired
	UtenteDaoRepository utenteRepo;

	public void inserisciUtente(Utente utente) {
		try {
			utenteRepo.save(utente);
			System.out.println("Utente correttamente inserito!");
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public Utente getByIdUtente(Integer id) {
		try {
			return utenteRepo.findById(id).get();
		} catch (Exception e) {
			e.getMessage();
		}
		return null;
	}
	
	public void modificaUtente(Utente utente) {
		try {
			utenteRepo.save(utente);
			System.out.println("Utente correttamente modificato!");
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void eliminaUtente(Utente utente) {
		try {
			utenteRepo.delete(utente);
			System.out.println("Utente correttamente cancellato!");
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public List<Utente> visualizzaTuttiGliUtenti() {
		try {
			return utenteRepo.findAll();
		} catch (Exception e) {
			e.getMessage();
		}
		return null;
	}
}
