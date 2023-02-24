package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@NamedQuery(name = "Viaggio.findAll", query = "SELECT vi FROM Viaggio vi")
public class Viaggio implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_viaggio", unique = true)
	private Integer idViaggio;

	@Column(name = "tempo_effettivo_viaggio", nullable = true)
	private Date tempoEffettivoViaggio;

	@OneToMany
	@Column(name = "id_tratta", nullable = false)
	private List<Tratta> idTratta;

	@OneToMany
	@Column(name = "id_mezzoditrasporto", nullable = false)
	private List<MezzoDiTrasporto> mezziDiTrasporto;

	@OneToOne
	@JoinColumn(name = "id_tratta", nullable = true)
	private Tratta tratta;

	public Viaggio() {
	}

	public Integer getIdViaggio() {
		return idViaggio;
	}

	public void setIdViaggio(Integer idViaggio) {
		this.idViaggio = idViaggio;
	}

	public Date getTempoEffettivoViaggio() {
		return tempoEffettivoViaggio;
	}

	public void setTempoEffettivoViaggio(Date tempoEffettivoViaggio) {
		this.tempoEffettivoViaggio = tempoEffettivoViaggio;
	}

	public List<Tratta> getIdTratta() {
		return idTratta;
	}

	public void setIdTratta(List<Tratta> idTratta) {
		this.idTratta = idTratta;
	}

	public List<MezzoDiTrasporto> getMezziDiTrasporto() {
		return mezziDiTrasporto;
	}

	public void setMezziDiTrasporto(List<MezzoDiTrasporto> mezziDiTrasporto) {
		this.mezziDiTrasporto = mezziDiTrasporto;
	}

	@Override
	public String toString() {
		return "Viaggio [idViaggio=" + idViaggio + ", tempoEffettivoViaggio=" + tempoEffettivoViaggio
				+ ", getIdTratta()=" + getIdTratta() + ", getMezziDiTrasporto()=" + getMezziDiTrasporto() + "]";
	}

}
