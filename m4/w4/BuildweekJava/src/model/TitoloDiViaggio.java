package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

import enums.MetodoDiVendita;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@NamedQuery(name = "TitoloDiViaggio.findAll", query = "SELECT tdv FROM TitoloDiViaggio tdv")
public abstract class TitoloDiViaggio implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_titolodiviaggio", unique = true)
	private Integer idTitoloDiViaggio;

	@Enumerated(EnumType.STRING)
	@Column(name = "metodo_vendita_titolodiviaggio", nullable = false)
	private MetodoDiVendita metodoVenditaTitoloDiViaggio;

	@ManyToOne
	@JoinColumn(name = "id_puntodiemissione", nullable = true)
	private PuntoDiEmissione puntoDiEmissione;

	@ManyToOne
	@JoinColumn(name = "id_mezzoditrasporto", nullable = true)
	private MezzoDiTrasporto mezzoDiTrasporto;

	public Integer getIdTitoloDiViaggio() {
		return idTitoloDiViaggio;
	}

	public void setIdTitoloDiViaggio(Integer idTitoloDiViaggio) {
		this.idTitoloDiViaggio = idTitoloDiViaggio;
	}

	public MetodoDiVendita getMetodoVenditaTitoloDiViaggio() {
		return metodoVenditaTitoloDiViaggio;
	}

	public void setMetodoVenditaTitoloDiViaggio(MetodoDiVendita metodoVenditaTitoloDiViaggio) {
		this.metodoVenditaTitoloDiViaggio = metodoVenditaTitoloDiViaggio;
	}

	public PuntoDiEmissione getPuntoDiEmissione() {
		return puntoDiEmissione;
	}

	public void setPuntoDiEmissione(PuntoDiEmissione puntoDiEmissione) {
		this.puntoDiEmissione = puntoDiEmissione;
	}

	public MezzoDiTrasporto getMezzoDiTrasporto() {
		return mezzoDiTrasporto;
	}

	public void setMezzoDiTrasporto(MezzoDiTrasporto mezzoDiTrasporto) {
		this.mezzoDiTrasporto = mezzoDiTrasporto;
	}

	@Override
	public String toString() {
		return "TitoloDiViaggio [idTitoloDiViaggio=" + idTitoloDiViaggio + ", metodoVenditaTitoloDiViaggio="
				+ metodoVenditaTitoloDiViaggio + ", puntoDiEmissione=" + puntoDiEmissione + ", mezzoDiTrasporto="
				+ mezzoDiTrasporto + "]";
	}

}
