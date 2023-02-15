package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the evento database table.
 * 
 */
@Entity
@NamedQuery(name="Evento.findAll", query="SELECT e FROM Evento e")
public class Evento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_evento")
	private Integer idEvento;

	@Column(name="data_evento")
	private String dataEvento;

	@Column(name="descrizione")
	private String descrizione_evento;

	@Column(name="luogo_evento")
	private String luogoEvento;

	@Column(name="numero_massimo_partecipanti")
	private Integer numeroMassimoPartecipanti_evento;

	@Column(name="tipo_ev")
	private String tipoEv;

	@Column(name="titolo")
	private String titolo_evento;

	//bi-directional many-to-one association to Luogo
	@OneToMany(mappedBy="evento")
	private List<Luogo> luogos;

	//bi-directional many-to-one association to Partecipazioneevento
	@OneToMany(mappedBy="evento")
	private List<Partecipazioneevento> partecipazioneeventos;

	//bi-directional many-to-one association to Persona
	@OneToMany(mappedBy="evento")
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

	public String getDescrizione_evento() {
		return this.descrizione_evento;
	}

	public void setDescrizione_evento(String descrizione_evento) {
		this.descrizione_evento = descrizione_evento;
	}

	public String getLuogoEvento() {
		return this.luogoEvento;
	}

	public void setLuogoEvento(String luogoEvento) {
		this.luogoEvento = luogoEvento;
	}

	public Integer getNumeroMassimoPartecipanti_evento() {
		return this.numeroMassimoPartecipanti_evento;
	}

	public void setNumeroMassimoPartecipanti_evento(Integer numeroMassimoPartecipanti_evento) {
		this.numeroMassimoPartecipanti_evento = numeroMassimoPartecipanti_evento;
	}

	public String getTipoEv() {
		return this.tipoEv;
	}

	public void setTipoEv(String tipoEv) {
		this.tipoEv = tipoEv;
	}

	public String getTitolo_evento() {
		return this.titolo_evento;
	}

	public void setTitolo_evento(String titolo_evento) {
		this.titolo_evento = titolo_evento;
	}

	public List<Luogo> getLuogos() {
		return this.luogos;
	}

	public void setLuogos(List<Luogo> luogos) {
		this.luogos = luogos;
	}

	public Luogo addLuogo(Luogo luogo) {
		getLuogos().add(luogo);
		luogo.setEvento(this);

		return luogo;
	}

	public Luogo removeLuogo(Luogo luogo) {
		getLuogos().remove(luogo);
		luogo.setEvento(null);

		return luogo;
	}

	public List<Partecipazioneevento> getPartecipazioneeventos() {
		return this.partecipazioneeventos;
	}

	public void setPartecipazioneeventos(List<Partecipazioneevento> partecipazioneeventos) {
		this.partecipazioneeventos = partecipazioneeventos;
	}

	public Partecipazioneevento addPartecipazioneevento(Partecipazioneevento partecipazioneevento) {
		getPartecipazioneeventos().add(partecipazioneevento);
		partecipazioneevento.setEvento(this);

		return partecipazioneevento;
	}

	public Partecipazioneevento removePartecipazioneevento(Partecipazioneevento partecipazioneevento) {
		getPartecipazioneeventos().remove(partecipazioneevento);
		partecipazioneevento.setEvento(null);

		return partecipazioneevento;
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

}