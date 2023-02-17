package model;

import java.io.Serializable;
import javax.persistence.*;

import enums.Periodicita;

import java.util.List;

/**
 * The persistent class for the riviste database table.
 * 
 */
@Entity
@NamedQuery(name = "Riviste.findAll", query = "SELECT r FROM Riviste r")
public class Riviste implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_isbn_riviste")
	private Integer idIsbnRiviste;

	@Column(name = "anno_pubblicazione_riviste")
	private String annoPubblicazioneRiviste;

	@Column(name = "numero_pagine_riviste")
	private Integer numeroPagineRiviste;

	@Enumerated(EnumType.STRING)
	@Column(name = "periodicita_riviste")
	private Periodicita periodicitaRiviste;

	@Column(name = "titolo_riviste")
	private String titoloRiviste;

	// bi-directional many-to-one association to Prestiti
	@OneToMany(mappedBy = "riviste")
	private List<Prestiti> prestitis;

	public Riviste() {
	}

	public Integer getIdIsbnRiviste() {
		return this.idIsbnRiviste;
	}

	public void setIdIsbnRiviste(Integer idIsbnRiviste) {
		this.idIsbnRiviste = idIsbnRiviste;
	}

	public String getAnnoPubblicazioneRiviste() {
		return this.annoPubblicazioneRiviste;
	}

	public void setAnnoPubblicazioneRiviste(String annoPubblicazioneRiviste) {
		this.annoPubblicazioneRiviste = annoPubblicazioneRiviste;
	}

	public Integer getNumeroPagineRiviste() {
		return this.numeroPagineRiviste;
	}

	public void setNumeroPagineRiviste(Integer numeroPagineRiviste) {
		this.numeroPagineRiviste = numeroPagineRiviste;
	}

	public Periodicita getPeriodicitaRiviste() {
		return this.periodicitaRiviste;
	}

	public void setPeriodicitaRiviste(Periodicita periodicitaRiviste) {
		this.periodicitaRiviste = periodicitaRiviste;
	}

	public String getTitoloRiviste() {
		return this.titoloRiviste;
	}

	public void setTitoloRiviste(String titoloRiviste) {
		this.titoloRiviste = titoloRiviste;
	}

	public List<Prestiti> getPrestitis() {
		return this.prestitis;
	}

	public void setPrestitis(List<Prestiti> prestitis) {
		this.prestitis = prestitis;
	}

	public Prestiti addPrestiti(Prestiti prestiti) {
		getPrestitis().add(prestiti);
		prestiti.setRiviste(this);

		return prestiti;
	}

	public Prestiti removePrestiti(Prestiti prestiti) {
		getPrestitis().remove(prestiti);
		prestiti.setRiviste(null);

		return prestiti;
	}

	@Override
	public String toString() {
		return "Riviste [idIsbnRiviste=" + idIsbnRiviste + ", annoPubblicazioneRiviste=" + annoPubblicazioneRiviste
				+ ", numeroPagineRiviste=" + numeroPagineRiviste + ", periodicitaRiviste=" + periodicitaRiviste
				+ ", titoloRiviste=" + titoloRiviste + ", prestitis=" + prestitis + "]";
	}

}