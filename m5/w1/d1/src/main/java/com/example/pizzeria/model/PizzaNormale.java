package com.example.pizzeria.model;

public class PizzaNormale extends PizzaBase {
	String ingredientiAggiuntivi;

	public PizzaNormale(double prezzo, double calorie, String nomePizza, String ingredientiAggiuntivi) {
		super(prezzo, calorie, nomePizza, PizzaBase.ingredientiBase);
		this.ingredientiAggiuntivi = ingredientiAggiuntivi;
	}

	public String getIngredientiAggiuntivi() {
		return ingredientiAggiuntivi;
	}

	public void setIngredientiAggiuntivi(String ingredientiAggiuntivi) {
		this.ingredientiAggiuntivi = ingredientiAggiuntivi;
	}

	@Override
	public String toString() {
		return "PizzaNormale [nomePizza=" + nomePizza + ", prezzo=" + prezzo + ", calorie=" + calorie
				+ ", ingredientiBase=" + getIngredientiBase() + ", ingredientiAggiuntivi= " + ingredientiAggiuntivi + "]";
	}

}
