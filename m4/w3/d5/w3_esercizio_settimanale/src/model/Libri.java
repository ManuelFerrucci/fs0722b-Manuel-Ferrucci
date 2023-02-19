package model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@NamedQuery(name = "Libri.findAll", query = "SELECT l FROM Libri l")
public class Libri extends Articolo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "autore_libri")
	private String autoreLibri;

	@Column(name = "genere_libri")
	private String genereLibri;

	public Libri() {
		super();
	}

	public String getAutoreLibri() {
		return autoreLibri;
	}

	public void setAutoreLibri(String autoreLibri) {
		this.autoreLibri = autoreLibri;
	}

	public String getGenereLibri() {
		return genereLibri;
	}

	public void setGenereLibri(String genereLibri) {
		this.genereLibri = genereLibri;
	}

	@Override
	public String toString() {
		return "Libri [autoreLibri=" + autoreLibri + ", genereLibri=" + genereLibri + ", IdIsbnArticolo="
				+ getIdIsbnArticolo() + ", TitoloArticolo=" + getTitoloArticolo() + ", AnnoPubblicazioneArticolo="
				+ getAnnoPubblicazioneArticolo() + ", NumeroPagineArticolo=" + getNumeroPagineArticolo() + "]";
	}

}