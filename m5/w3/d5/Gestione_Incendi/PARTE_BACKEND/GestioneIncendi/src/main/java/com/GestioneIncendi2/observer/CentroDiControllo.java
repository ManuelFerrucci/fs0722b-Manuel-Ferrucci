package com.GestioneIncendi2.observer;

import java.util.ArrayList;
import java.util.List;

import com.GestioneIncendi2.models.Installazione;
import com.GestioneIncendi2.proxy.ProcessoDiControlloAllarmi;

import lombok.Getter;
import lombok.Setter;

// con il pattern observer tengo sotto controllo lo stato di aggiornamento
// degli oggetti che voglio, ciclando l'array creato e notificando un allarme ad ogni variazione
@Getter
@Setter
public class CentroDiControllo {
	List<Installazione> listaSonde;

	private List<ProcessoDiControlloAllarmi> processiDiControllo = new ArrayList<>();

	public void aggiungiObserver(ProcessoDiControlloAllarmi observer) {
		processiDiControllo.add(observer);
	}

	public void rimuoviObserver(ProcessoDiControlloAllarmi observer) {
		processiDiControllo.remove(observer);
	}

	public void notificaObserver() {
		for (ProcessoDiControlloAllarmi processoDiControlloAllarmi : processiDiControllo) {
			processoDiControlloAllarmi.controlloAllarme(listaSonde);
		}
	}
}
