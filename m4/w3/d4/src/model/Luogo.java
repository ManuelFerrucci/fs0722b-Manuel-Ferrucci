package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the luogo database table.
 * 
 */
@Entity
@NamedQuery(name = "Luogo.findAll", query = "SELECT l FROM Luogo l")
public class Luogo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_luogo")
	private Integer idLuogo;

	@Column(name = "citta_luogo")
	private String cittaLuogo;

	@Column(name = "nome_luogo")
	private String nomeLuogo;

	// bi-directional many-to-one association to Evento
	@OneToMany(mappedBy = "luogo")
	private List<Evento> eventos;

	public Luogo() {
	}

	public Integer getIdLuogo() {
		return this.idLuogo;
	}

	public void setIdLuogo(Integer idLuogo) {
		this.idLuogo = idLuogo;
	}

	public String getCittaLuogo() {
		return this.cittaLuogo;
	}

	public void setCittaLuogo(String cittaLuogo) {
		this.cittaLuogo = cittaLuogo;
	}

	public String getNomeLuogo() {
		return this.nomeLuogo;
	}

	public void setNomeLuogo(String nomeLuogo) {
		this.nomeLuogo = nomeLuogo;
	}

	public List<Evento> getEventos() {
		return this.eventos;
	}

	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}

	public Evento addEvento(Evento evento) {
		getEventos().add(evento);
		evento.setLuogo(this);

		return evento;
	}

	public Evento removeEvento(Evento evento) {
		getEventos().remove(evento);
		evento.setLuogo(null);

		return evento;
	}

	@Override
	public String toString() {
		return "Luogo [idLuogo=" + idLuogo + ", cittaLuogo=" + cittaLuogo + ", nomeLuogo=" + nomeLuogo + ", eventos="
				+ eventos + "]";
	}

}