package com.example.pizzeria.model;

public class PizzaBase extends Prodotto {
	String nomePizza;
	static String ingredientiBase = "pomodoro - mozzarella";

	public PizzaBase(double prezzo, double calorie, String nomePizza, String ingredientiBase) {
		super(prezzo, calorie);
		this.nomePizza = nomePizza;
	}

	public String getNomePizza() {
		return nomePizza;
	}

	public void setNomePizza(String nomePizza) {
		this.nomePizza = nomePizza;
	}

	public String getIngredientiBase() {
		return ingredientiBase;
	}

	@Override
	public String toString() {
		return "PizzaBase [nomePizza=" + nomePizza + ", ingredientiBase=" + ingredientiBase + ", prezzo=" + prezzo
				+ ", calorie=" + calorie + "]";
	}

}
