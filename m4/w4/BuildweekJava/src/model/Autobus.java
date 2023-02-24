package model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQuery(name = "Autobus.findAll", query = "SELECT autob FROM Autobus autob")
public class Autobus extends MezzoDiTrasporto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "capienza_massima_autobus", nullable = true)
	private Integer capienzaMassimaAutobus = 15;

	public Autobus() {
		super();
	}

	public Integer getCapienzaMassimaAutobus() {
		return capienzaMassimaAutobus;
	}

	@Override
	public String toString() {
		return "Autobus [capienzaMassimaAutobus=" + capienzaMassimaAutobus + ", getIdMezzoDiTrasporto()="
				+ getIdMezzoDiTrasporto() + ", getPostiUtilizzatiMezzoDiTrasporto()="
				+ getPostiUtilizzatiMezzoDiTrasporto() + ", getStatoMezzoDiTrasporto()=" + getStatoMezzoDiTrasporto()
				+ "]";
	}

}
