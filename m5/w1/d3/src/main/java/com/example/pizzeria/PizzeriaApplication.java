package com.example.pizzeria;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.pizzeria.model.Bevanda;
import com.example.pizzeria.model.ConfigurationPizzeria;
import com.example.pizzeria.model.Ordine;
import com.example.pizzeria.model.PizzaGrande;
import com.example.pizzeria.model.PizzaNormale;
import com.example.pizzeria.model.Prodotto;
import com.example.pizzeria.model.Tavolo;

@SpringBootApplication
public class PizzeriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PizzeriaApplication.class, args);

		configWith_Beans_pizzeria();
	}

	public static void configWith_Beans_pizzeria() {
		ApplicationContext appCtx = new AnnotationConfigApplicationContext(ConfigurationPizzeria.class);
		try {

			// Recupero Bean
			PizzaNormale pizzaMarinara = (PizzaNormale) appCtx.getBean("marinara");
			PizzaNormale pizzaQuattroStagioni = (PizzaNormale) appCtx.getBean("quattroStagioni");
			PizzaNormale pizzaHawaiana = (PizzaNormale) appCtx.getBean("hawaiana");
			PizzaGrande pizzaQuattroStagioniBIG = (PizzaGrande) appCtx.getBean("quattroStagioniBig");
			Bevanda cocaCola33CL = (Bevanda) appCtx.getBean("cocaColaLattina");
			Bevanda birraMoretti20CL = (Bevanda) appCtx.getBean("birraMoretti");

			// Creazione lista menu'
			List<Prodotto> menu = new ArrayList<Prodotto>();
			menu.add(pizzaMarinara);
			menu.add(pizzaQuattroStagioni);
			menu.add(pizzaHawaiana);
			menu.add(pizzaQuattroStagioniBIG);
			menu.add(cocaCola33CL);
			menu.add(birraMoretti20CL);

			// Stampa in console del menu'
			System.out.println();
			System.out.println(
					"--------------- SEPARATORE --------------- SEPARATORE --------------- SEPARATORE --------------- SEPARATORE --------------- SEPARATORE ---------------");
			System.out.println();
			System.out.println("Menu'");
			System.out.println();
			System.out.println("Pizze:");
			for (Prodotto prodotto : menu) {
				if (prodotto.getClass() == PizzaNormale.class) {
					System.out.println(prodotto);
				}
			}

			System.out.println();
			System.out.println("Pizze BIG-SIZE:");
			for (Prodotto prodotto : menu) {
				if (prodotto.getClass() == PizzaGrande.class) {
					System.out.println(prodotto);
				}
			}

			System.out.println();
			System.out.println("Bevande:");
			for (Prodotto prodotto : menu) {
				if (prodotto.getClass() == Bevanda.class) {
					System.out.println(prodotto);
				}
			}

			Tavolo primoTavolo = (Tavolo) appCtx.getBean("tavolo1");
			Ordine primoOrdine = (Ordine) appCtx.getBean("ordine1");
			List<Prodotto> listaOrdine1 = primoOrdine.getOrdineTavolo();
			listaOrdine1.add(pizzaMarinara);
			listaOrdine1.add(pizzaQuattroStagioniBIG);
			listaOrdine1.add(birraMoretti20CL);
			listaOrdine1.add(cocaCola33CL);

			primoOrdine.setOrdineTavolo(listaOrdine1);
			System.out.println();
			System.out.println(
					"--------------- SEPARATORE --------------- SEPARATORE --------------- SEPARATORE --------------- SEPARATORE --------------- SEPARATORE ---------------");
			System.out.println();
			System.out.println(primoOrdine);
			primoOrdine.ammontareDelConto(primoOrdine.getOrdineTavolo());

		} catch (Exception e) {
			e.getMessage();
		} finally {
			((AnnotationConfigApplicationContext) appCtx).close();
		}

	}

}
