package com.example.pizzeria.model;

public class PizzaGrande extends PizzaNormale {
	protected static double maggiorazionePrezzoBigSize = 2.5;
	protected static double maggiorazioneCalorieBigSize = 1.8;

	public PizzaGrande(double prezzo, String nomePizza, double calorie, String ingredientiAggiuntivi) {
		super(prezzo, nomePizza, calorie, ingredientiAggiuntivi);
		this.prezzo = prezzo * maggiorazionePrezzoBigSize;
		this.calorie = calorie * maggiorazioneCalorieBigSize;
		if (this.ingredientiAggiuntivi.equalsIgnoreCase("prosciutto - ananas")) {
			nomePizza = "Hawaiian Pizza BIG";
			this.nomePizza = nomePizza;
		} else {
			this.nomePizza = nomePizza;
		}
	}

	public static double getMaggiorazionePrezzoBigSize() {
		return maggiorazionePrezzoBigSize;
	}

	public static double getMaggiorazioneCalorieBigSize() {
		return maggiorazioneCalorieBigSize;
	}

	@Override
	public String toString() {
		return "PizzaGrande [nomePizzaBIG = " + nomePizza + ", prezzo = euro " + prezzo + ", calorie = " + calorie
				+ ", ingredientiBase = " + getIngredientiBase() + ", ingredientiAggiuntivi = " + ingredientiAggiuntivi
				+ "]";
	}

}
