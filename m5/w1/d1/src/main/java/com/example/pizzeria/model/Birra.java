package com.example.pizzeria.model;

public class Birra extends Bevanda {
	double percentualeAlcolica;

	public Birra(double prezzo, double calorie, String nome, String quantitaInCentilitri, double percentualeAlcolica) {
		super(prezzo, calorie, nome, quantitaInCentilitri);
		this.percentualeAlcolica = percentualeAlcolica;
	}

	public double getPercentualeAlcolica() {
		return percentualeAlcolica;
	}

	public void setPercentualeAlcolica(double percentualeAlcolica) {
		this.percentualeAlcolica = percentualeAlcolica;
	}

	@Override
	public String toString() {
		return "Birra [nome=" + nome + ", quantitaInCentilitri=" + quantitaInCentilitri + ", prezzo=" + prezzo
				+ ", calorie=" + calorie + ", percentualeAlcolica=" + percentualeAlcolica + "]";
	}

}
