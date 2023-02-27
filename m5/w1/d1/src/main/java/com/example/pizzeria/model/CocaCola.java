package com.example.pizzeria.model;

public class CocaCola extends Bevanda {
	double percentualeAlcolica;

	public CocaCola(double prezzo, double calorie, String nome, String quantitaInCentilitri,
			double percentualeAlcolica) {
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
		return "CocaCola [percentualeAlcolica=" + percentualeAlcolica + ", nome=" + nome + ", quantitaInCentilitri="
				+ quantitaInCentilitri + ", prezzo=" + prezzo + ", calorie=" + calorie + "]";
	}

}
