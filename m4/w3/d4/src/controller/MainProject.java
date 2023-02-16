package controller;

import model.Evento;
import model.Luogo;
import model.Partecipazione;
import model.Persona;

public class MainProject {

	public static void main(String[] args) {
		// Luogo
		Luogo foroItalicoss = new Luogo();
		foroItalicoss.setNomeLuogo("Foro Italicos");
		foroItalicoss.setCittaLuogo("Roma");

		LuogoDAO.saveLu(foroItalicoss);
		//LuogoDAO.deleteLu(foroItalicoss);
		

		// Evento
		Evento internazionaliTennis = new Evento();
		internazionaliTennis.setTitoloEvento("Internazionali BNL D'Italia");
		internazionaliTennis.setDataEvento("2023-05-13");
		internazionaliTennis.setDescrizioneEvento("Torneo di tennis ATP 1000");
		internazionaliTennis.setTipoEvento("PRIVATO");
		internazionaliTennis.setNumeroPartecipanti(3000);
		//internazionaliTennis.setLuogo(foroItalicoss);

		// EventoDAO.saveEv(internazionaliTennis);

		// Persona
		Persona manuelFerrucci = new Persona();
		manuelFerrucci.setNomePersona("Manuel");
		manuelFerrucci.setCognomePersona("Ferrucci");
		manuelFerrucci.setEmailPersona("manuel@example.it");
		manuelFerrucci.setDatanascitaPersona("1992-02-20");
		manuelFerrucci.setSessoPersona("MASCHIO");
		manuelFerrucci.setEvento(internazionaliTennis);

		//PersonaDAO.savePers(manuelFerrucci);

		// Partecipazione
		Partecipazione bigliettoTennis = new Partecipazione();
		bigliettoTennis.setPersona(manuelFerrucci);
		bigliettoTennis.setEvento(internazionaliTennis);
		bigliettoTennis.setStatoPartecipazione("DACONFERMARE");

		// PartecipazioneDAO.savePartec(bigliettoTennis);
	}

}
