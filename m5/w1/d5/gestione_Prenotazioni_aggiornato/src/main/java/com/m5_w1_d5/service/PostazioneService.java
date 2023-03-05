package com.m5_w1_d5.service;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m5_w1_d5.model.Postazione;
import com.m5_w1_d5.model.Prenotazione;
import com.m5_w1_d5.repository.PostazioneDaoRepository;
import com.m5_w1_d5.repository.PrenotazioneDaoRepository;
import com.m5_w1_d5.utils.StatoPostazione;
import com.m5_w1_d5.utils.TipoPostazione;

@Service
public class PostazioneService {

	@Autowired
	PostazioneDaoRepository postazioneRepo;

	public void inserisciPostazione(Postazione postazione) {
		try {
			postazioneRepo.save(postazione);
			System.out.println("Postazione correttamente inserita!");
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public Postazione getByIdPostazione(Integer idPostazione) {
		try {
			return postazioneRepo.findById(idPostazione).get();
		} catch (Exception e) {
			e.getMessage();
		}
		return null;
	}

	public void modificaPostazione(Postazione postazione) {
		try {
			postazioneRepo.save(postazione);
			System.out.println("Postazione correttamente modificata!");
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void eliminaPostazione(Postazione postazione) {
		try {
			postazioneRepo.delete(postazione);
			System.out.println("Postazione correttamente cancellata!");
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public List<Postazione> visualizzaTutteLePostazioni() {
		try {
			return postazioneRepo.findAll();
		} catch (Exception e) {
			e.getMessage();
		}
		return null;
	}

	public void findByTipoPostazione(TipoPostazione tipoPostazione) {
		List<Postazione> listaPostazioni;
		try {
			listaPostazioni = postazioneRepo.findByTipoPostazione(tipoPostazione);
			if (listaPostazioni.isEmpty()) {
				System.out.println("Non sono presenti postazioni con quel tipo di postazione!");
			} else {
				for (Postazione postazione : listaPostazioni) {
					System.out.println("Postazione trovata tramite il tipo di postazione '"
							+ postazione.getTipoPostazione() + "': " + postazione);
				}
			}
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void findPostazioniByTipoPostazioneAndEdificioCittaEdificio(TipoPostazione tipoPostazione, String citta) {
		List<Postazione> listaPostazioni;
		try {
			listaPostazioni = postazioneRepo.findPostazioniByTipoPostazioneAndEdificioCittaEdificio(tipoPostazione,
					citta);
			if (listaPostazioni.isEmpty()) {
				System.out.println("Non sono presenti postazioni risultanti dalla combinazione tipo di postazione "
						+ tipoPostazione + " e la citta' " + citta + "!");
			} else {
				for (Postazione postazione : listaPostazioni) {
					System.out.println("Postazione trovata tramite il tipo di postazione '"
							+ postazione.getTipoPostazione() + " e la citta' '"
							+ postazione.getIdEdificio().getCittaEdificio() + "': " + postazione);
				}
			}
		} catch (Exception e) {
			e.getMessage();
		}
	}
}
