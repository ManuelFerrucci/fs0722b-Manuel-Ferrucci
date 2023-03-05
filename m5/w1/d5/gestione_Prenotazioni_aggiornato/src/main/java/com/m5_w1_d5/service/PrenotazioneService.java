package com.m5_w1_d5.service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m5_w1_d5.model.Postazione;
import com.m5_w1_d5.model.Prenotazione;
import com.m5_w1_d5.model.Utente;
import com.m5_w1_d5.repository.PostazioneDaoRepository;
import com.m5_w1_d5.repository.PrenotazioneDaoRepository;
import com.m5_w1_d5.utils.StatoPostazione;
import com.m5_w1_d5.utils.StatoPrenotazione;

@Service
public class PrenotazioneService {

	@Autowired
	PrenotazioneDaoRepository prenotazioneRepo;

	@Autowired
	PostazioneDaoRepository postazioneRepo;

	@Autowired
	UtenteService utenteServicePREN;

	@Autowired
	PostazioneService postazioneServicePREN;

	public void inserisciPrenotazione(Prenotazione prenotazione, Postazione postazione, Utente utente) {
		Calendar current = Calendar.getInstance();
		List<Prenotazione> listaPrenotazioni = visualizzaTutteLePrenotazioni();
		if (prenotazione.getDataPrenotazione().compareTo(current.getTime()) < 0) {
			System.out.println("Prenotazione non possibile. La data inserita risulta antecedente alla data di domani!");
		} else {
			if (listaPrenotazioni.isEmpty()) {
				try {
					prenotazioneRepo.save(prenotazione);
					System.out.println("Prenotazione correttamente inserita!");
				} catch (Exception e) {
					e.getMessage();
				}
			} else {
				Integer verifica = 0;
				for (Prenotazione testPrenotazione : listaPrenotazioni) {
					if (prenotazione.getDataPrenotazione().equals(testPrenotazione.getDataPrenotazione())
							&& postazione.getIdPostazione() == testPrenotazione.getPostazione().getIdPostazione()) {
						verifica = 1;
						break;
					} else if (prenotazione.getDataPrenotazione().equals(testPrenotazione.getDataPrenotazione())
							&& utente.getIdUtente() == testPrenotazione.getUtente().getIdUtente()) {
						verifica = 2;
						break;
					}
				}
				if (verifica == 1) {
					System.out.println(
							"Prenotazione non possibile. La postazione risulta prenotata nella data indicata!");
				} else if (verifica == 2) {
					System.out.println(
							"Prenotazione non possibile. L'utente ha fatto un'altra prenotazione nella data indicata!");
				} else {
					try {
						prenotazioneRepo.save(prenotazione);
						System.out.println("Prenotazione correttamente inserita!");
					} catch (Exception e) {
						e.getMessage();
					}
				}
			}
		}
	}

	public Prenotazione getByIdPrenotazione(Integer id) {
		try {
			return prenotazioneRepo.findById(id).get();
		} catch (Exception e) {
			e.getMessage();
		}
		return null;
	}

	public void modificaPrenotazione(Prenotazione prenotazione) {
		try {
			prenotazioneRepo.save(prenotazione);
			System.out.println("Prenotazione correttamente modificata!");
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void eliminaPrenotazione(Prenotazione prenotazione) {
		try {
			prenotazioneRepo.delete(prenotazione);
			System.out.println("Prenotazione correttamente eliminata!");
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public List<Prenotazione> visualizzaTutteLePrenotazioni() {
		try {
			return prenotazioneRepo.findAll();
		} catch (Exception e) {
			e.getMessage();
		}
		return null;
	}

	public void aggiornamentoGiornalieroStatoPrenotazione() {
		Calendar current = Calendar.getInstance();
		List<Prenotazione> listaPrenotazioni = visualizzaTutteLePrenotazioni();
		if (listaPrenotazioni.isEmpty()) {
			System.out.println("Non sono presenti prenotazioni!");
		} else {
			for (Prenotazione prenotazione : listaPrenotazioni) {
				if (prenotazione.getDataPrenotazione().compareTo(current.getTime()) < 0
						&& prenotazione.getStatoprenotazione() == StatoPrenotazione.CONFERMATA) {
					prenotazione.setStatoprenotazione(StatoPrenotazione.SCADUTA);
					try {
						prenotazioneRepo.save(prenotazione);
						System.out.println(
								"Stato della prenotazione numero " + prenotazione.getIdPrenotazione() + " modificato!");
					} catch (Exception e) {
						e.getMessage();
					}
				} else {
					System.out.println("Prenotazione numero " + prenotazione.getIdPrenotazione()
							+ " verificata, nulla da modificare.");
				}
			}
		}
	}
}
