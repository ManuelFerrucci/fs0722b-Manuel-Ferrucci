package com.example.pizzeria.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import utils.StatoOrdine;
import utils.StatoTavolo;

@Configuration
public class ConfigurationPizzeria {

	@Bean
	@Scope("prototype")
	public PizzaNormale marinara() {
		return new PizzaNormale(2.5, "Marinara", 234.8, "origano");
	}

	@Bean
	@Scope("prototype")
	public PizzaNormale quattroStagioni() {
		return new PizzaNormale(3.5, "4 Stagioni", 678.3, "olive - carciofini - prosciutto");
	}

	@Bean
	@Scope("prototype")
	public PizzaNormale hawaiana() {
		return new PizzaNormale(6, "Ananas", 569.2, "prosciutto - ananas");
	}

	@Bean
	@Scope("prototype")
	public PizzaGrande quattroStagioniBig() {
		return new PizzaGrande(3.5, "4 Stagioni BIG", 678.4, "olive - carciofini - prosciutto");
	}

	@Bean
	@Scope("prototype")
	public Bevanda birraMoretti() {
		return new Bevanda(2, "Birra Moretti 20CL", "Si", "20CL", 87.3, 5.4);
	}

	@Bean
	@Scope("prototype")
	public Bevanda cocaColaLattina() {
		return new Bevanda(1.5, "Coca-Cola 33CL", "Si", "33CL", 76.1, 0);
	}

	@Bean
	@Scope("prototype")
	public Tavolo tavolo1() {
		return new Tavolo(1, 5, StatoTavolo.Occupato);
	}

	List<Prodotto> listaOrdine1 = new ArrayList<Prodotto>();

	@Bean
	@Scope("prototype")
	public Ordine ordine1() {
		return new Ordine(1, listaOrdine1, "nessuna nota", tavolo1(), StatoOrdine.InCorso, 2, "15:41");
	}

}
