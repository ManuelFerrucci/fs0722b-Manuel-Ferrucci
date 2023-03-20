package com.GestioneIncendi2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GestioneIncendi2.models.Installazione;
import com.GestioneIncendi2.models.Sonda;
import com.GestioneIncendi2.repositories.SondaRepository;
import com.GestioneIncendi2.utils.StatoAllarmeSonda;

@Service
public class SondaService {
	@Autowired
	SondaRepository sondaRepository;

	public void salvaSondaInDb(Installazione sonda) {
		sondaRepository.save((Sonda) sonda);
		System.out.println("Sonda id " + ((Sonda) sonda).getId() + " salvata correttamente!");
	}

	public Sonda trovaSondaById(Integer id) {
		if (sondaRepository.existsById(id)) {
			Sonda sonda = sondaRepository.findById(id).get();
			System.out.println("Sonda trovata in db: " + sonda);
			return sonda;
		} else {
			System.out.println("Non risulta possibile trovare la sonda con id " + id
					+ ", perche' non esiste in database, devi prima aggiungerla!");
		}
		return null;
	}

	public void quantitaFumoInTempoReale(Installazione sondaCreataNelRunner, Integer idSondaRicercataInDb) {
		if (sondaRepository.existsById(idSondaRicercataInDb)) {
			Installazione sonda = sondaRepository.findById(idSondaRicercataInDb).get();
			((Sonda) sonda).setQuantitaFumo(((Sonda) sondaCreataNelRunner).getQuantitaFumo());
			if (((Sonda) sonda).getQuantitaFumo() > 5
					&& ((Sonda) sonda).getAllarmeIncendio() == StatoAllarmeSonda.Disattivo) {
				((Sonda) sonda).setAllarmeIncendio(StatoAllarmeSonda.Attivo);
				sondaRepository.save((Sonda) sonda);
				System.out.println("Sonda con id " + ((Sonda) sonda).getId()
						+ " aggiornata correttamente: quantita' di fumo sopra il limite rispetto alla precedente rilevazione, allarme incendio attivato!");
			} else if (((Sonda) sonda).getQuantitaFumo() <= 5
					&& ((Sonda) sonda).getAllarmeIncendio() == StatoAllarmeSonda.Attivo) {
				((Sonda) sonda).setAllarmeIncendio(StatoAllarmeSonda.Disattivo);
				sondaRepository.save((Sonda) sonda);
				System.out.println("Sonda con id " + ((Sonda) sonda).getId()
						+ " aggiornata correttamente: quantita' di fumo sotto il limite rispetto alla precedente rilevazione, incendio estinto e allarme disattivato!");
			} else {
				System.out.println("Sonda con id " + ((Sonda) sonda).getId()
						+ " aggiornata correttamente: non e' stata rilevata nessuna importante variazione rispetto alla rilevazione precedente.");
			}
		} else {
			System.out
					.println("Non risulta possibile aggiornare la quantita' di fumo rilevata, perche' la sonda con id "
							+ idSondaRicercataInDb + " non esiste in database, devi prima aggiungerla!");
		}
	}

	public void modificaSondaInDb(Installazione sonda) {
		sondaRepository.save((Sonda) sonda);
		System.out.println("Sonda modificata correttamente!");
	}

	public void eliminaSondaInDb(Installazione sonda) {
		sondaRepository.delete((Sonda) sonda);
		System.out.println("Sonda eliminata correttamente!");
	}
}
