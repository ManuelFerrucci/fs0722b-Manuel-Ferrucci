package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

import enums.StatoMezzoDiTrasporto;

@Entity
@NamedQuery(name = "PeriodoAttivitaMezzo.findAll", query = "SELECT pam FROM PeriodoAttivitaMezzo pam")
public class PeriodoAttivitaMezzo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_periodoattivitamezzo", unique = true)
	private Integer idPeriodoAttivitaMezzo;

	@Column(name = "data_inizio_periodoattivitamezzo", nullable = false)
	private Date dataInizioPeriodoAttivitaMezzo;

	@Column(name = "data_fine_periodoattivitamezzo", nullable = false)
	private Date dataFinePeriodoAttivitaMezzo;

	@Enumerated(EnumType.STRING)
	@Column(name = "stato_periodoattivitamezzo", nullable = false)
	private StatoMezzoDiTrasporto statoPeriodoAttivitaMezzo;

	@OneToOne
	@JoinColumn(name = "id_mezzoditrasporto", nullable = true)
	private MezzoDiTrasporto mezzoDiTrasporto;

	public PeriodoAttivitaMezzo() {
	}

	public Integer getIdPeriodoAttivitaMezzo() {
		return idPeriodoAttivitaMezzo;
	}

	public void setIdPeriodoAttivitaMezzo(Integer idPeriodoAttivitaMezzo) {
		this.idPeriodoAttivitaMezzo = idPeriodoAttivitaMezzo;
	}

	public Date getDataInizioPeriodoAttivitaMezzo() {
		return dataInizioPeriodoAttivitaMezzo;
	}

	public void setDataInizioPeriodoAttivitaMezzo(Date dataInizioPeriodoAttivitaMezzo) {
		this.dataInizioPeriodoAttivitaMezzo = dataInizioPeriodoAttivitaMezzo;
	}

	public Date getDataFinePeriodoAttivitaMezzo() {
		return dataFinePeriodoAttivitaMezzo;
	}

	public void setDataFinePeriodoAttivitaMezzo(Date dataFinePeriodoAttivitaMezzo) {
		this.dataFinePeriodoAttivitaMezzo = dataFinePeriodoAttivitaMezzo;
	}

	public StatoMezzoDiTrasporto getStatoPeriodoAttivitaMezzo() {
		return statoPeriodoAttivitaMezzo;
	}

	public void setStatoPeriodoAttivitaMezzo(StatoMezzoDiTrasporto statoPeriodoAttivitaMezzo) {
		this.statoPeriodoAttivitaMezzo = statoPeriodoAttivitaMezzo;
	}

	public MezzoDiTrasporto getMezzoDiTrasporto() {
		return mezzoDiTrasporto;
	}

	public void setMezzoDiTrasporto(MezzoDiTrasporto mezzoDiTrasporto) {
		this.mezzoDiTrasporto = mezzoDiTrasporto;
	}

	@Override
	public String toString() {
		return "PeriodoAttivitaMezzo [idPeriodoAttivitaMezzo=" + idPeriodoAttivitaMezzo
				+ ", dataInizioPeriodoAttivitaMezzo=" + dataInizioPeriodoAttivitaMezzo
				+ ", dataFinePeriodoAttivitaMezzo=" + dataFinePeriodoAttivitaMezzo + ", statoPeriodoAttivitaMezzo="
				+ statoPeriodoAttivitaMezzo + ", getMezzoDiTrasporto()=" + getMezzoDiTrasporto() + "]";
	}

}
