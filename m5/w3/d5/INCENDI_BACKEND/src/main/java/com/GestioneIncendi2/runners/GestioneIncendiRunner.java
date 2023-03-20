package com.GestioneIncendi2.runners;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.GestioneIncendi2.factory.Factory;
import com.GestioneIncendi2.models.AllarmeIncendio;
import com.GestioneIncendi2.models.Installazione;
import com.GestioneIncendi2.models.Sonda;
import com.GestioneIncendi2.observer.CentroDiControllo;
import com.GestioneIncendi2.services.SondaService;

@Component
public class GestioneIncendiRunner implements ApplicationRunner {

	@Autowired
	SondaService sondaService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println();
		System.out.println("GestioneIncendiRunner Run...");
		System.out.println();

		// METODO CREAZIONE SONDE USANDO FACTORY PATTERN
		Integer numeroSondeDaCreare = 5;
		List<Installazione> listaInstallazioni = new ArrayList<>();
		for (int i = 1; i <= numeroSondeDaCreare; i++) {
			Installazione sondaFactory = Factory.definisciTipo("SONDA");
			((Sonda) sondaFactory).setId(i);
			listaInstallazioni.add(sondaFactory);
			System.out.println("Sonda creata con il factory: " + sondaFactory);
		}
		System.out.println();

		CentroDiControllo centroDiControllo = new CentroDiControllo();
		AllarmeIncendio allarmeIncendio = new AllarmeIncendio();
		centroDiControllo.aggiungiObserver(allarmeIncendio);
		centroDiControllo.setListaSonde(listaInstallazioni);

		// METODO DI NOTIFICA
		// Con il metodo che segue verranno notificati gli incendi.
		// Se non c'è nessuna sonda con quantità fumo maggiore di 5,
		// non verrà stampato nulla, viceversa verrà stampato sia un
		// avviso che l'URL con le indicazioni (latit, longit, ecc)
		// per i soccorritori.
		// NOTA. Questo verrà stampato in ogni caso, non c'entra con
		// i db, lavora in autonomia, quindi anche se in db non è
		// presente alcun elemento

		centroDiControllo.notificaObserver();

		///// IN PIU' HO FATTO L'INSERIMENTO DELLE SONDE IN DATABASE, INIZIA QUI /////
		System.out.println();
		System.out.println("************* QUI INIZIANO LE STAMPE CHE RIGUARDANO IL DATABASE *************");
		System.out.println();

		// SALVATAGGIO SONDE SU DATABASE
		// Dopo aver decommentato il "ciclo for", e salvato le sonde in
		// database, commentare di nuovo altrimenti le salva tali
		// e quali un'altra volta

//		for (Installazione installazione : listaInstallazioni) {
//			sondaService.salvaSondaInDb(installazione);
//		}
//		System.out.println();

		// AGGIORNAMENTO IN TEMPO REALE PRESENZA INCENDI, ANCHE SU DB
		// In pratica il metodo va ad aggiornare in tempo reale sul db la
		// quantità di fumo delle sonde, prendendola dalla quantità
		// di fumo delle sonde nella lista usata prima, in cui questo
		// valore viene generato in modo random ogni volta che viene
		// fatto il run dell'applicazione. Il metodo è in SondaService.java

		for (int i = 0; i < listaInstallazioni.size(); i++) {
			Installazione sonda = listaInstallazioni.get(i);
			sondaService.quantitaFumoInTempoReale(sonda, (i + 1));
		}
		System.out.println();

		// VISUALIZZAZIONE DEI DETTAGLI SONDE SU DATABASE
		sondaService.trovaSondaById(1);
		sondaService.trovaSondaById(2);
		sondaService.trovaSondaById(3);
		sondaService.trovaSondaById(4);
		sondaService.trovaSondaById(5);

		System.out.println();
	}
}
