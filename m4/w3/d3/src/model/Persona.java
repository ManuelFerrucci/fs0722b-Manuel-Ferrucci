package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the persona database table.
 * 
 */
@Entity
@NamedQuery(name="Persona.findAll", query="SELECT p FROM Persona p")
public class Persona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_persona")
	private Integer idPersona;

	@Column(name="cognome")
	private String cognome_persona;

	@Temporal(TemporalType.DATE)
	@Column(name="data_nascita")
	private Date dataNascita;

	@Column(name="email")
	private String email_persona;

	@Column(name="nome")
	private String nome_persona;

	@Column(name="sesso_persona")
	private String sessoPersona;

	//bi-directional many-to-one association to Partecipazioneevento
	@OneToMany(mappedBy="persona")
	private List<Partecipazioneevento> partecipazioneeventos;

	//bi-directional many-to-one association to Evento
	@ManyToOne
	@JoinColumn(name="id_evento")
	private Evento evento;

	public Persona() {
	}

	public Integer getIdPersona() {
		return this.idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public String getCognome_persona() {
		return this.cognome_persona;
	}

	public void setCognome_persona(String cognome_persona) {
		this.cognome_persona = cognome_persona;
	}

	public Date getDataNascita() {
		return this.dataNascita;
	}

	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}

	public String getEmail_persona() {
		return this.email_persona;
	}

	public void setEmail_persona(String email_persona) {
		this.email_persona = email_persona;
	}

	public String getNome_persona() {
		return this.nome_persona;
	}

	public void setNome_persona(String nome_persona) {
		this.nome_persona = nome_persona;
	}

	public String getSessoPersona() {
		return this.sessoPersona;
	}

	public void setSessoPersona(String sessoPersona) {
		this.sessoPersona = sessoPersona;
	}

	public List<Partecipazioneevento> getPartecipazioneeventos() {
		return this.partecipazioneeventos;
	}

	public void setPartecipazioneeventos(List<Partecipazioneevento> partecipazioneeventos) {
		this.partecipazioneeventos = partecipazioneeventos;
	}

	public Partecipazioneevento addPartecipazioneevento(Partecipazioneevento partecipazioneevento) {
		getPartecipazioneeventos().add(partecipazioneevento);
		partecipazioneevento.setPersona(this);

		return partecipazioneevento;
	}

	public Partecipazioneevento removePartecipazioneevento(Partecipazioneevento partecipazioneevento) {
		getPartecipazioneeventos().remove(partecipazioneevento);
		partecipazioneevento.setPersona(null);

		return partecipazioneevento;
	}

	public Evento getEvento() {
		return this.evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

}