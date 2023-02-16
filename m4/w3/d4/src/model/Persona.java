package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the persona database table.
 * 
 */
@Entity
@NamedQuery(name = "Persona.findAll", query = "SELECT p FROM Persona p")
public class Persona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_persona")
	private Integer idPersona;

	@Column(name = "cognome_persona")
	private String cognomePersona;

	@Column(name = "datanascita_persona")
	private String datanascitaPersona;

	@Column(name = "email_persona")
	private String emailPersona;

	@Column(name = "nome_persona")
	private String nomePersona;

	@Column(name = "sesso_persona")
	private String sessoPersona;

	// bi-directional many-to-one association to Partecipazione
	@OneToMany(mappedBy = "persona")
	private List<Partecipazione> partecipaziones;

	// bi-directional many-to-one association to Evento
	@ManyToOne
	@JoinColumn(name = "id_evento")
	private Evento evento;

	public Persona() {
	}

	public Integer getIdPersona() {
		return this.idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public String getCognomePersona() {
		return this.cognomePersona;
	}

	public void setCognomePersona(String cognomePersona) {
		this.cognomePersona = cognomePersona;
	}

	public String getDatanascitaPersona() {
		return this.datanascitaPersona;
	}

	public void setDatanascitaPersona(String datanascitaPersona) {
		this.datanascitaPersona = datanascitaPersona;
	}

	public String getEmailPersona() {
		return this.emailPersona;
	}

	public void setEmailPersona(String emailPersona) {
		this.emailPersona = emailPersona;
	}

	public String getNomePersona() {
		return this.nomePersona;
	}

	public void setNomePersona(String nomePersona) {
		this.nomePersona = nomePersona;
	}

	public String getSessoPersona() {
		return this.sessoPersona;
	}

	public void setSessoPersona(String sessoPersona) {
		this.sessoPersona = sessoPersona;
	}

	public List<Partecipazione> getPartecipaziones() {
		return this.partecipaziones;
	}

	public void setPartecipaziones(List<Partecipazione> partecipaziones) {
		this.partecipaziones = partecipaziones;
	}

	public Partecipazione addPartecipazione(Partecipazione partecipazione) {
		getPartecipaziones().add(partecipazione);
		partecipazione.setPersona(this);

		return partecipazione;
	}

	public Partecipazione removePartecipazione(Partecipazione partecipazione) {
		getPartecipaziones().remove(partecipazione);
		partecipazione.setPersona(null);

		return partecipazione;
	}

	public Evento getEvento() {
		return this.evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", cognomePersona=" + cognomePersona + ", datanascitaPersona="
				+ datanascitaPersona + ", emailPersona=" + emailPersona + ", nomePersona=" + nomePersona
				+ ", sessoPersona=" + sessoPersona + ", partecipaziones=" + partecipaziones + ", evento=" + evento
				+ "]";
	}

}