package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the luogo database table.
 * 
 */
@Entity
@NamedQuery(name="Luogo.findAll", query="SELECT l FROM Luogo l")
public class Luogo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_luogo")
	private Integer idLuogo;

	@Column(name="citta")
	private String citta_luogo;

	@Column(name="nome")
	private String nome_luogo;

	//bi-directional many-to-one association to Evento
	@ManyToOne
	@JoinColumn(name="id_evento")
	private Evento evento;

	public Luogo() {
	}

	public Integer getIdLuogo() {
		return this.idLuogo;
	}

	public void setIdLuogo(Integer idLuogo) {
		this.idLuogo = idLuogo;
	}

	public String getCitta_luogo() {
		return this.citta_luogo;
	}

	public void setCitta_luogo(String citta_luogo) {
		this.citta_luogo = citta_luogo;
	}

	public String getNome_luogo() {
		return this.nome_luogo;
	}

	public void setNome_luogo(String nome_luogo) {
		this.nome_luogo = nome_luogo;
	}

	public Evento getEvento() {
		return this.evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

}