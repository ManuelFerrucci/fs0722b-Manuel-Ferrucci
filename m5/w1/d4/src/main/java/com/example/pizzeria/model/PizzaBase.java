package com.example.pizzeria.model;

public class PizzaBase extends Prodotto {
	protected String nomePizza;
	protected double calorie;
	protected static String ingredientiBase = "pomodoro - mozzarella";

	public PizzaBase(double prezzo, String nomePizza, double calorie) {
		super(prezzo);
		this.nomePizza = nomePizza;
		this.calorie = calorie;
	}

	public String getNomePizza() {
		return nomePizza;
	}

	public void setNomePizza(String nomePizza) {
		this.nomePizza = nomePizza;
	}

	public double getCalorie() {
		return calorie;
	}

	public void setCalorie(double calorie) {
		this.calorie = calorie;
	}

	public static String getIngredientiBase() {
		return ingredientiBase;
	}

	@Override
	public String toString() {
		return "PizzaBase [nomePizza=" + nomePizza + ", calorie=" + calorie + ", prezzo=" + getPrezzo() + "]";
	}

}
