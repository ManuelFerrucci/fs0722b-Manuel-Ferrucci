package model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@NamedQuery(name = "Articolo.findAll", query = "SELECT a FROM Articolo a")
public abstract class Articolo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_isbn_articolo", unique = true)
	private Integer idIsbnArticolo;

	@Column(name = "titolo_articolo", nullable = false)
	private String titoloArticolo;

	@Column(name = "anno_pubblicazione_articolo", nullable = false)
	private Integer annoPubblicazioneArticolo;

	@Column(name = "numero_pagine_articolo", nullable = false)
	private Integer numeroPagineArticolo;

	@OneToMany(mappedBy = "articolo", cascade = CascadeType.REMOVE)
	private List<Prestiti> prestiti;

	public Integer getIdIsbnArticolo() {
		return idIsbnArticolo;
	}

	public void setIdIsbnArticolo(Integer idIsbnArticolo) {
		this.idIsbnArticolo = idIsbnArticolo;
	}

	public String getTitoloArticolo() {
		return titoloArticolo;
	}

	public void setTitoloArticolo(String titoloArticolo) {
		this.titoloArticolo = titoloArticolo;
	}

	public Integer getAnnoPubblicazioneArticolo() {
		return annoPubblicazioneArticolo;
	}

	public void setAnnoPubblicazioneArticolo(Integer annoPubblicazioneArticolo) {
		this.annoPubblicazioneArticolo = annoPubblicazioneArticolo;
	}

	public Integer getNumeroPagineArticolo() {
		return numeroPagineArticolo;
	}

	public void setNumeroPagineArticolo(Integer numeroPagineArticolo) {
		this.numeroPagineArticolo = numeroPagineArticolo;
	}

	@Override
	public String toString() {
		return "Articolo [idIsbnArticolo=" + idIsbnArticolo + ", titoloArticolo=" + titoloArticolo
				+ ", annoPubblicazioneArticolo=" + annoPubblicazioneArticolo + ", numeroPagineArticolo="
				+ numeroPagineArticolo + ", tipoArticolo=" + "]";
	}
}
