package model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQuery(name = "Tram.findAll", query = "SELECT tr FROM Tram tr")
public class Tram extends MezzoDiTrasporto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "capienza_massima_tram", nullable = true)
	private Integer capienzaMassimaTram = 20;

	public Tram() {
		super();
	}

	public Integer getCapienzaMassimaTram() {
		return capienzaMassimaTram;
	}

	@Override
	public String toString() {
		return "Tram [capienzaMassimaTram=" + capienzaMassimaTram + ", getIdMezzoDiTrasporto()="
				+ getIdMezzoDiTrasporto() + ", getPostiUtilizzatiMezzoDiTrasporto()="
				+ getPostiUtilizzatiMezzoDiTrasporto() + ", getStatoMezzoDiTrasporto()=" + getStatoMezzoDiTrasporto()
				+ "]";
	}

}
