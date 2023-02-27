package com.example.pizzeria.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class ConfigurationPizzeria {

	@Bean
	@Scope("prototype")
	public PizzaNormale marinara() {
		return new PizzaNormale(2.5, 234, "Marinara", "Origano");
	}

	@Bean
	@Scope("prototype")
	public PizzaNormale quattroStagioni() {
		return new PizzaNormale(4, 678, "4 Stagioni", "Olive - Carciofini - Prosciutto");
	}

	@Bean
	@Scope("prototype")
	public Birra birMoretti() {
		return new Birra(2, 87, "Birra Moretti 20CL", "20", 5.4);
	}

}
