package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the evento database table.
 * 
 */
@Entity
@NamedQuery(name = "Evento.findAll", query = "SELECT e FROM Evento e")
public class Evento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_evento")
	private Integer idEvento;

	@Column(name = "data_evento")
	private String dataEvento;

	@Column(name = "descrizione_evento")
	private String descrizioneEvento;

	@Column(name = "numero_partecipanti")
	private Integer numeroPartecipanti;

	@Column(name = "tipo_evento")
	private String tipoEvento;

	@Column(name = "titolo_evento")
	private String titoloEvento;

	// bi-directional many-to-one association to Luogo
	@ManyToOne
	@JoinColumn(name = "id_luogo")
	private Luogo luogo;

	// bi-directional many-to-one association to Partecipazione
	@OneToMany(mappedBy = "evento")
	private List<Partecipazione> partecipaziones;

	// bi-directional many-to-one association to Persona
	@OneToMany(mappedBy = "evento")
	private List<Persona> personas;

	public Evento() {
	}

	public Integer getIdEvento() {
		return this.idEvento;
	}

	public void setIdEvento(Integer idEvento) {
		this.idEvento = idEvento;
	}

	public String getDataEvento() {
		return this.dataEvento;
	}

	public void setDataEvento(String dataEvento) {
		this.dataEvento = dataEvento;
	}

	public String getDescrizioneEvento() {
		return this.descrizioneEvento;
	}

	public void setDescrizioneEvento(String descrizioneEvento) {
		this.descrizioneEvento = descrizioneEvento;
	}

	public Integer getNumeroPartecipanti() {
		return this.numeroPartecipanti;
	}

	public void setNumeroPartecipanti(Integer numeroPartecipanti) {
		this.numeroPartecipanti = numeroPartecipanti;
	}

	public String getTipoEvento() {
		return this.tipoEvento;
	}

	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public String getTitoloEvento() {
		return this.titoloEvento;
	}

	public void setTitoloEvento(String titoloEvento) {
		this.titoloEvento = titoloEvento;
	}

	public Luogo getLuogo() {
		return this.luogo;
	}

	public void setLuogo(Luogo luogo) {
		this.luogo = luogo;
	}

	public List<Partecipazione> getPartecipaziones() {
		return this.partecipaziones;
	}

	public void setPartecipaziones(List<Partecipazione> partecipaziones) {
		this.partecipaziones = partecipaziones;
	}

	public Partecipazione addPartecipazione(Partecipazione partecipazione) {
		getPartecipaziones().add(partecipazione);
		partecipazione.setEvento(this);

		return partecipazione;
	}

	public Partecipazione removePartecipazione(Partecipazione partecipazione) {
		getPartecipaziones().remove(partecipazione);
		partecipazione.setEvento(null);

		return partecipazione;
	}

	public List<Persona> getPersonas() {
		return this.personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}

	public Persona addPersona(Persona persona) {
		getPersonas().add(persona);
		persona.setEvento(this);

		return persona;
	}

	public Persona removePersona(Persona persona) {
		getPersonas().remove(persona);
		persona.setEvento(null);

		return persona;
	}

	@Override
	public String toString() {
		return "Evento [idEvento=" + idEvento + ", dataEvento=" + dataEvento + ", descrizioneEvento="
				+ descrizioneEvento + ", numeroPartecipanti=" + numeroPartecipanti + ", tipoEvento=" + tipoEvento
				+ ", titoloEvento=" + titoloEvento + ", luogo=" + luogo + ", partecipaziones=" + partecipaziones
				+ ", personas=" + personas + "]";
	}

}