package com.m5_w1_d5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m5_w1_d5.model.Edificio;
import com.m5_w1_d5.repository.EdificioDaoRepository;

@Service
public class EdificioService {

	@Autowired
	EdificioDaoRepository edificioRepo;

	public void inserisciEdificio(Edificio edificio) {
		try {
			edificioRepo.save(edificio);
			System.out.println("Edificio correttamente inserito");
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public Edificio getByIdEdificio(Integer id) {
		try {
			return edificioRepo.findById(id).get();
		} catch (Exception e) {
			e.getMessage();
		}
		return null;
	}
	
	public void modificaEdificio(Edificio edificio) {
		try {
			edificioRepo.save(edificio);
			System.out.println("Edificio correttamente modificato!");
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void eliminaEdificio(Edificio edificio) {
		try {
			edificioRepo.delete(edificio);
			System.out.println("Edificio correttamente eliminato!");
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public List<Edificio> visualizzaTuttiGliEdifici() {
		try {
			return edificioRepo.findAll();
		} catch (Exception e) {
			e.getMessage();
		}
		return null;
	}
}
