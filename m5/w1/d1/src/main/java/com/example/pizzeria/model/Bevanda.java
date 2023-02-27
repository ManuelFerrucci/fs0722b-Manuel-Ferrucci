package com.example.pizzeria.model;

public abstract class Bevanda extends Prodotto {
	String nome;
	String quantitaInCentilitri;

	public Bevanda(double prezzo, double calorie, String nome, String quantitaInCentilitri) {
		super(prezzo, calorie);
		this.nome = nome;
		this.quantitaInCentilitri = quantitaInCentilitri;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getQuantitaInCentilitri() {
		return quantitaInCentilitri;
	}

	public void setQuantitaInCentilitri(String quantitaInCentilitri) {
		this.quantitaInCentilitri = quantitaInCentilitri;
	}

	@Override
	public String toString() {
		return "Bevanda [nome=" + nome + ", quantitaInCentilitri=" + quantitaInCentilitri + ", prezzo=" + prezzo
				+ ", calorie=" + calorie + "]";
	}

}
