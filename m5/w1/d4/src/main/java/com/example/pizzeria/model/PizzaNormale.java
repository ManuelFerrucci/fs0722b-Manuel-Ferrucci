package com.example.pizzeria.model;

public class PizzaNormale extends PizzaBase {
	protected String ingredientiAggiuntivi;

	public PizzaNormale(double prezzo, String nomePizza, double calorie, String ingredientiAggiuntivi) {
		super(prezzo, nomePizza, calorie);
		this.ingredientiAggiuntivi = ingredientiAggiuntivi;
		if (this.ingredientiAggiuntivi.equalsIgnoreCase("prosciutto - ananas")) {
			nomePizza = "Hawaiian Pizza";
			this.nomePizza = nomePizza;
		} else {
			this.nomePizza = nomePizza;
		}
	}

	public String getIngredientiAggiuntivi() {
		return ingredientiAggiuntivi;
	}

	public void setIngredientiAggiuntivi(String ingredientiAggiuntivi) {
		this.ingredientiAggiuntivi = ingredientiAggiuntivi;
	}

	@Override
	public String toString() {
		return "PizzaNormale [nomePizza = " + getNomePizza() + ", prezzo = euro " + getPrezzo() + ", calorie = "
				+ calorie + ", ingredientiBase = " + getIngredientiBase() + ", ingredientiAggiuntivi = "
				+ ingredientiAggiuntivi + "]";
	}

}
