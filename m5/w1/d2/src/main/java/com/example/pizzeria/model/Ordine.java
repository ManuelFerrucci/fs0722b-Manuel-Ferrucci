package com.example.pizzeria.model;

import java.util.List;

import utils.StatoOrdine;

public class Ordine {
	protected static double coperto = 1.5;
	protected int numeroOrdine;
	protected List<Prodotto> ordineTavolo;
	protected String noteOrdine;
	protected Tavolo tavolo;
	protected StatoOrdine statoOrdine;
	protected int numeroCoperti;
	protected String orarioOrdine;

	public Ordine(int numeroOrdine, List<Prodotto> ordineTavolo, String noteOrdine, Tavolo tavolo,
			StatoOrdine statoOrdine, int numeroCoperti, String orarioOrdine) {
		super();
		this.numeroOrdine = numeroOrdine;
		this.ordineTavolo = ordineTavolo;
		this.noteOrdine = noteOrdine;
		this.tavolo = tavolo;
		this.statoOrdine = statoOrdine;
		this.numeroCoperti = numeroCoperti;
		this.orarioOrdine = orarioOrdine;
	}

	public void ammontareDelConto(List<Prodotto> ordineTavolo) {
		double totaleConto = 0;
		double totaleCoperto = coperto * this.numeroCoperti;
		for (Prodotto prodotto : ordineTavolo) {
			totaleConto += prodotto.prezzo;
		}
		totaleConto = totaleConto + totaleCoperto;
		System.out.println("Il conto del tavolo " + tavolo.idTavolo + " ammonta a " + totaleConto + " euro");
	}

	public int getNumeroOrdine() {
		return numeroOrdine;
	}

	public void setNumeroOrdine(int numeroOrdine) {
		this.numeroOrdine = numeroOrdine;
	}

	public List<Prodotto> getOrdineTavolo() {
		return ordineTavolo;
	}

	public void setOrdineTavolo(List<Prodotto> ordineTavolo) {
		this.ordineTavolo = ordineTavolo;
	}

	public String getNoteOrdine() {
		return noteOrdine;
	}

	public void setNoteOrdine(String noteOrdine) {
		this.noteOrdine = noteOrdine;
	}

	public Tavolo getTavolo() {
		return tavolo;
	}

	public void setTavolo(Tavolo tavolo) {
		this.tavolo = tavolo;
	}

	public StatoOrdine getStatoOrdine() {
		return statoOrdine;
	}

	public void setStatoOrdine(StatoOrdine statoOrdine) {
		this.statoOrdine = statoOrdine;
	}

	public int getNumeroCoperti() {
		return numeroCoperti;
	}

	public void setNumeroCoperti(int numeroCoperti) {
		this.numeroCoperti = numeroCoperti;
	}

	public String getOrarioOrdine() {
		return orarioOrdine;
	}

	public void setOrarioOrdine(String orarioOrdine) {
		this.orarioOrdine = orarioOrdine;
	}

	public static double getCoperto() {
		return coperto;
	}

	@Override
	public String toString() {
		return "Ordine [numeroOrdine=" + numeroOrdine + ", ordineTavolo=" + ordineTavolo + ", noteOrdine=" + noteOrdine
				+ ", tavolo=" + tavolo.idTavolo + ", statoOrdine=" + statoOrdine + ", numeroCoperti=" + numeroCoperti
				+ ", orarioOrdine=" + orarioOrdine + "]";
	}

}
