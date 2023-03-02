package com.example.pizzeria.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import utils.StatoOrdine;

//@PropertySource("classpath:application.properties") // serve per il coperto, ma non funziona
public class Ordine {

	protected static double coperto = 1.5;
	protected int numeroOrdine;
	protected List<Prodotto> ordineTavolo;
	protected String noteOrdine;
	protected Tavolo tavolo;
	protected StatoOrdine statoOrdine;
	protected int numeroCoperti;
	protected LocalDateTime orarioOrdine = LocalDateTime.now();

	public Ordine(int numeroOrdine, List<Prodotto> ordineTavolo, String noteOrdine, Tavolo tavolo,
			StatoOrdine statoOrdine, int numeroCoperti) {
		super();
		this.numeroOrdine = numeroOrdine;
		this.ordineTavolo = ordineTavolo;
		this.noteOrdine = noteOrdine;
		this.tavolo = tavolo;
		this.statoOrdine = statoOrdine;
		this.numeroCoperti = numeroCoperti;
	}

	public double ammontareDelConto(List<Prodotto> ordineTavolo) {
		double totaleConto = 0;
		double totaleCoperto = coperto * this.numeroCoperti;
		for (Prodotto prodotto : ordineTavolo) {
			totaleConto += prodotto.prezzo;
		}
		totaleConto = totaleConto + totaleCoperto;
		System.out.println("Il conto del tavolo " + tavolo.idTavolo + " ammonta a " + totaleConto + " euro");
		return totaleConto;
	}

	public String stringaDataOrdineFormattata() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		return this.orarioOrdine.format(formatter);
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

	public LocalDateTime getOrarioOrdine() {
		return orarioOrdine;
	}

	public void setOrarioOrdine(LocalDateTime orarioOrdine) {
		this.orarioOrdine = orarioOrdine;
	}

	public static double getCoperto() {
		return coperto;
	}

	@Override
	public String toString() {
		return "Ordine [numeroOrdine = " + numeroOrdine + ", ordineTavolo = " + ordineTavolo + ", noteOrdine = "
				+ noteOrdine + ", tavolo = " + tavolo.idTavolo + ", statoOrdine = " + statoOrdine + ", numeroCoperti="
				+ numeroCoperti + ", orarioOrdine = " + stringaDataOrdineFormattata() + "]";
	}

}
