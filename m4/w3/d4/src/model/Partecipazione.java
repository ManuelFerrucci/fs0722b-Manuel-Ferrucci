package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the partecipazione database table.
 * 
 */
@Entity
@NamedQuery(name = "Partecipazione.findAll", query = "SELECT p FROM Partecipazione p")
public class Partecipazione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_partecipazione")
	private Integer idPartecipazione;

	@Column(name = "stato_partecipazione")
	private String statoPartecipazione;

	// bi-directional many-to-one association to Evento
	@ManyToOne
	@JoinColumn(name = "id_evento")
	private Evento evento;

	// bi-directional many-to-one association to Persona
	@ManyToOne
	@JoinColumn(name = "id_persona")
	private Persona persona;

	public Partecipazione() {
	}

	public Integer getIdPartecipazione() {
		return this.idPartecipazione;
	}

	public void setIdPartecipazione(Integer idPartecipazione) {
		this.idPartecipazione = idPartecipazione;
	}

	public String getStatoPartecipazione() {
		return this.statoPartecipazione;
	}

	public void setStatoPartecipazione(String statoPartecipazione) {
		this.statoPartecipazione = statoPartecipazione;
	}

	public Evento getEvento() {
		return this.evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@Override
	public String toString() {
		return "Partecipazione [idPartecipazione=" + idPartecipazione + ", statoPartecipazione=" + statoPartecipazione
				+ ", evento=" + evento + ", persona=" + persona + "]";
	}

}