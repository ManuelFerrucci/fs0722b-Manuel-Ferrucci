package model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

import enums.StatoMezzoDiTrasporto;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@NamedQuery(name = "MezzoDiTrasporto.findAll", query = "SELECT mdt FROM MezzoDiTrasporto mdt")
public abstract class MezzoDiTrasporto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_mezzoditrasporto", unique = true)
	private Integer idMezzoDiTrasporto;

	@Column(name = "posti_utilizzati_mezzoditrasporto", nullable = true)
	private Integer postiUtilizzatiMezzoDiTrasporto = 0;

	@Enumerated(EnumType.STRING)
	@Column(name = "stato_mezzoditrasporto", nullable = false)
	private StatoMezzoDiTrasporto statoMezzoDiTrasporto;

	@OneToMany(mappedBy = "mezzoDiTrasporto")
	private List<TitoloDiViaggio> titoliDiViaggio;

	public Integer getIdMezzoDiTrasporto() {
		return idMezzoDiTrasporto;
	}

	public void setIdMezzoDiTrasporto(Integer idMezzoDiTrasporto) {
		this.idMezzoDiTrasporto = idMezzoDiTrasporto;
	}

	public Integer getPostiUtilizzatiMezzoDiTrasporto() {
		return postiUtilizzatiMezzoDiTrasporto;
	}

	public void setPostiUtilizzatiMezzoDiTrasporto(Integer postiUtilizzatiMezzoDiTrasporto) {
		this.postiUtilizzatiMezzoDiTrasporto = postiUtilizzatiMezzoDiTrasporto;
	}

	public StatoMezzoDiTrasporto getStatoMezzoDiTrasporto() {
		return statoMezzoDiTrasporto;
	}

	public void setStatoMezzoDiTrasporto(StatoMezzoDiTrasporto statoMezzoDiTrasporto) {
		this.statoMezzoDiTrasporto = statoMezzoDiTrasporto;
	}

	public List<TitoloDiViaggio> getTitoliDiViaggio() {
		return titoliDiViaggio;
	}

	public void setTitoliDiViaggio(List<TitoloDiViaggio> titoliDiViaggio) {
		this.titoliDiViaggio = titoliDiViaggio;
	}

	@Override
	public String toString() {
		return "MezzoDiTrasporto [idMezzoDiTrasporto=" + idMezzoDiTrasporto + ", postiUtilizzatiMezzoDiTrasporto="
				+ postiUtilizzatiMezzoDiTrasporto + ", statoMezzoDiTrasporto=" + statoMezzoDiTrasporto
				+ ", titoliDiViaggio=" + titoliDiViaggio + "]";
	}

}
