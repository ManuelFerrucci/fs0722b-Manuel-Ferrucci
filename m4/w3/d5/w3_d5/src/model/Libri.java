package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the libri database table.
 * 
 */
@Entity
@NamedQuery(name = "Libri.findAll", query = "SELECT l FROM Libri l")
public class Libri implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_isbn_libri")
	private Integer idIsbnLibri;

	@Column(name = "anno_pubblicazione_libri")
	private String annoPubblicazioneLibri;

	@Column(name = "autore_libri")
	private String autoreLibri;

	@Column(name = "genere_libri")
	private String genereLibri;

	@Column(name = "numero_pagine_libri")
	private Integer numeroPagineLibri;

	@Column(name = "titolo_libri")
	private String titoloLibri;

	// bi-directional many-to-one association to Prestiti
	@OneToMany(mappedBy = "libri")
	private List<Prestiti> prestitis;

	public Libri() {
	}

	public Integer getIdIsbnLibri() {
		return this.idIsbnLibri;
	}

	public void setIdIsbnLibri(Integer idIsbnLibri) {
		this.idIsbnLibri = idIsbnLibri;
	}

	public String getAnnoPubblicazioneLibri() {
		return this.annoPubblicazioneLibri;
	}

	public void setAnnoPubblicazioneLibri(String annoPubblicazioneLibri) {
		this.annoPubblicazioneLibri = annoPubblicazioneLibri;
	}

	public String getAutoreLibri() {
		return this.autoreLibri;
	}

	public void setAutoreLibri(String autoreLibri) {
		this.autoreLibri = autoreLibri;
	}

	public String getGenereLibri() {
		return this.genereLibri;
	}

	public void setGenereLibri(String genereLibri) {
		this.genereLibri = genereLibri;
	}

	public Integer getNumeroPagineLibri() {
		return this.numeroPagineLibri;
	}

	public void setNumeroPagineLibri(Integer numeroPagineLibri) {
		this.numeroPagineLibri = numeroPagineLibri;
	}

	public String getTitoloLibri() {
		return this.titoloLibri;
	}

	public void setTitoloLibri(String titoloLibri) {
		this.titoloLibri = titoloLibri;
	}

	public List<Prestiti> getPrestitis() {
		return this.prestitis;
	}

	public void setPrestitis(List<Prestiti> prestitis) {
		this.prestitis = prestitis;
	}

	public Prestiti addPrestiti(Prestiti prestiti) {
		getPrestitis().add(prestiti);
		prestiti.setLibri(this);

		return prestiti;
	}

	public Prestiti removePrestiti(Prestiti prestiti) {
		getPrestitis().remove(prestiti);
		prestiti.setLibri(null);

		return prestiti;
	}

	@Override
	public String toString() {
		return "Libri [idIsbnLibri=" + idIsbnLibri + ", annoPubblicazioneLibri=" + annoPubblicazioneLibri
				+ ", autoreLibri=" + autoreLibri + ", genereLibri=" + genereLibri + ", numeroPagineLibri="
				+ numeroPagineLibri + ", titoloLibri=" + titoloLibri + ", prestitis=" + prestitis + "]";
	}

}