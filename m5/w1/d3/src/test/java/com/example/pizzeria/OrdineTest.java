package com.example.pizzeria;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.example.pizzeria.model.Bevanda;
import com.example.pizzeria.model.Ordine;
import com.example.pizzeria.model.PizzaNormale;
import com.example.pizzeria.model.Prodotto;
import com.example.pizzeria.model.Tavolo;

import utils.StatoOrdine;
import utils.StatoTavolo;

public class OrdineTest {
	Ordine o;
	List<Prodotto> listaOrdine1;
	Tavolo tavolo1;
	PizzaNormale marinara;
	Bevanda cocacola;

	@BeforeClass
	public static void beforeClassOrdineTest() {
		System.out.println("@BeforeClass");
	}

	@Before // in before mi istanzio l'oggetto così non devo ripeterlo dopo
	public void beforeTest() {
		System.out.println("@Before");
		tavolo1 = new Tavolo(10, 23, StatoTavolo.Occupato);
		o = new Ordine(10, listaOrdine1, "nessuna nota", tavolo1, StatoOrdine.InCorso, 3);
		listaOrdine1 = new ArrayList<Prodotto>();
		marinara = new PizzaNormale(2, "marinara", 34, "origano");
		cocacola = new Bevanda(1.5, "Coca-Cola", "Sì", "33CL", 35, 0);
		listaOrdine1.add(marinara);
		listaOrdine1.add(cocacola);
		o.setOrdineTavolo(listaOrdine1);
	}

	@Test
	public void testVerificaImportoCoperto() {
		System.out.println("Coperto a " + Ordine.getCoperto());
		assertEquals(1.5, o.getCoperto(), 0); // VERIFICATA
	}

	@Test
	public void testAmmontareDelConto() {
		assertEquals(8, o.ammontareDelConto(listaOrdine1), 0); // VERIFICATA
	}

	@After
	public void afterTest() {
		System.out.println("@After");
	}

	@AfterClass
	public static void afterClassTest() {
		System.out.println("@AfterClass");
	}

}
