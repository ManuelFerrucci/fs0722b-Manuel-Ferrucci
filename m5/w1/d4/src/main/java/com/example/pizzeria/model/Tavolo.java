package com.example.pizzeria.model;

import utils.StatoTavolo;

public class Tavolo {
	protected int idTavolo;
	protected int numeroMassimoCoperti;
	protected StatoTavolo statoTavolo;

	public Tavolo(int idTavolo, int numeroMassimoCoperti, StatoTavolo statoTavolo) {
		super();
		this.idTavolo = idTavolo;
		this.numeroMassimoCoperti = numeroMassimoCoperti;
		this.statoTavolo = statoTavolo;
	}

	public int getIdTavolo() {
		return idTavolo;
	}

	public void setIdTavolo(int idTavolo) {
		this.idTavolo = idTavolo;
	}

	public int getNumeroMassimoCoperti() {
		return numeroMassimoCoperti;
	}

	public void setNumeroMassimoCoperti(int numeroMassimoCoperti) {
		this.numeroMassimoCoperti = numeroMassimoCoperti;
	}

	public StatoTavolo getStatoTavolo() {
		return statoTavolo;
	}

	public void setStatoTavolo(StatoTavolo statoTavolo) {
		this.statoTavolo = statoTavolo;
	}

	@Override
	public String toString() {
		return "Tavolo [idTavolo=" + idTavolo + ", numeroMassimoCoperti=" + numeroMassimoCoperti + ", statoTavolo="
				+ statoTavolo + "]";
	}

}
