package com.GestioneIncendi2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.GestioneIncendi2.models.AllarmeIncendio;
import com.GestioneIncendi2.models.Installazione;
import com.GestioneIncendi2.models.Sonda;

public class AllarmeIncendioTest {

	// cambiare l'ultimo valore della sonda a piacimento, è la quantità del fumo,
	// solo se il valore è maggiore di 5, in console apparirà l'avviso e l'URL
	Installazione sondaTest = new Sonda(1, -46.45646, 46.45646, 8);

	AllarmeIncendio allarmeIncendio = new AllarmeIncendio();
	List<Installazione> listaSondeTest = new ArrayList<>();

	@Before
	public void testControlloAllarmeBefore() {
		listaSondeTest.add(sondaTest);
	}

	@Test
	public void testControlloAllarme() {
		String result1 = "La sonda " + ((Sonda) sondaTest).getId() + " rileva quantita' di fumo "
				+ (((Sonda) sondaTest).getQuantitaFumo() - 5) + " unita' al di sopra del limite, ALLARME INCENDIO";
		String result2 = null;

		if (((Sonda) sondaTest).getQuantitaFumo() > 5) {
			assertEquals(result1, allarmeIncendio.controlloAllarmePerTest(listaSondeTest));
		} else {
			assertEquals(result2, allarmeIncendio.controlloAllarmePerTest(listaSondeTest));
		}
	}

}
