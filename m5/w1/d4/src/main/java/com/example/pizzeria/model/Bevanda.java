package com.example.pizzeria.model;

public class Bevanda extends Prodotto {
	protected String nome;
	protected String gassata;
	protected String quantita;
	protected double calorie;
	protected double tassoAlcolemico;

	public Bevanda(double prezzo, String nome, String gassata, String quantita, double calorie,
			double tassoAlcolemico) {
		super(prezzo);
		this.nome = nome;
		this.gassata = gassata;
		this.quantita = quantita;
		this.calorie = calorie;
		this.tassoAlcolemico = tassoAlcolemico;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGassata() {
		return gassata;
	}

	public void setGassata(String gassata) {
		this.gassata = gassata;
	}

	public String getQuantita() {
		return quantita;
	}

	public void setQuantita(String quantita) {
		this.quantita = quantita;
	}

	public double getCalorie() {
		return calorie;
	}

	public void setCalorie(double calorie) {
		this.calorie = calorie;
	}

	public double getTassoAlcolemico() {
		return tassoAlcolemico;
	}

	public void setTassoAlcolemico(double tassoAlcolemico) {
		this.tassoAlcolemico = tassoAlcolemico;
	}

	@Override
	public String toString() {
		return "Bevanda [nome=" + nome + ", gassata = " + gassata + ", quantita = " + quantita + ", calorie = "
				+ calorie + ", tassoAlcolemico = " + tassoAlcolemico + ", prezzo = " + getPrezzo() + "]";
	}

}
