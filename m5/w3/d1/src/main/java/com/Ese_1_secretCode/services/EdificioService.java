package com.Ese_1_secretCode.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ese_1_secretCode.models.Edificio;
import com.Ese_1_secretCode.repositories.EdificioRepository;
import com.Ese_1_secretCode.utils.StatoCodiceSicurezzaEdificio;

@Service
public class EdificioService {

	@Autowired
	EdificioRepository edificioRepository;

	public void salvaEdificio(Edificio edificio) {
		if (edificio.getCodiceDiSbloccoInserito() == null) {
			edificio.setStatoCodice(StatoCodiceSicurezzaEdificio.BLOCCATO);
		} else {
			if (!edificio.getCodiceDiSbloccoInserito().equals(edificio.getCodiceSicurezza())) {
				edificio.setStatoCodice(StatoCodiceSicurezzaEdificio.BLOCCATO);
				edificio.setCodiceDiSbloccoInserito(null);
				System.out.println("La chiave di sicurezza e' errata, riprovare. L'edificio resta BLOCCATO.");
			} else {
				edificio.setStatoCodice(StatoCodiceSicurezzaEdificio.SBLOCCATO);
				System.out.println("Chiave di sicurezza sbloccata, edificio ora assegnabile.");
			}
		}
		edificioRepository.save(edificio);
		System.out.println("Edificio salvato correttamente!");

	}

	public Edificio trovaEdificioById(Long id) {
		Edificio edificio = edificioRepository.findById(id).get();
		if (edificioRepository.existsById(id)) {
			System.out.println(edificio);
			return edificio;
		} else {
			System.out.println("L'edificio con id " + id + " non esiste!");
		}
		return null;
	}

	public void modificaEdificio(Edificio edificio) {
		if (edificio.getCodiceDiSbloccoInserito() == null) {
			edificio.setStatoCodice(StatoCodiceSicurezzaEdificio.BLOCCATO);
		} else {
			if (!edificio.getCodiceDiSbloccoInserito().equals(edificio.getCodiceSicurezza())) {
				edificio.setStatoCodice(StatoCodiceSicurezzaEdificio.BLOCCATO);
				edificio.setCodiceDiSbloccoInserito(null);
				System.out.println("La chiave di sicurezza e' errata, riprovare. L'edificio resta BLOCCATO.");
			} else {
				edificio.setStatoCodice(StatoCodiceSicurezzaEdificio.SBLOCCATO);
				System.out.println("Chiave di sicurezza sbloccata, edificio ora assegnabile.");
			}
		}
		edificioRepository.save(edificio);
		System.out.println("Edificio modificato correttamente!");
	}

	public void eliminaEdificio(Edificio edificio) {
		edificioRepository.delete(edificio);
		System.out.println("Edificio eliminato correttamente!");
	}

	public void vediTuttiGliEdifici() {
		List<Edificio> listaEdifici = edificioRepository.findAll();
		if (listaEdifici.isEmpty()) {
			System.out.println("La lista è vuota!");
		} else {
			for (Edificio edificio : listaEdifici) {
				System.out.println(edificio);
			}
		}
	}

}
