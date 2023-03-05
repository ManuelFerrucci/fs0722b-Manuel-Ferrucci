package com.m5_w1_d5.model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "edifici")
@AllArgsConstructor
@NoArgsConstructor
public class Edificio implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true)
	private Integer idEdificio;

	@Column(nullable = false)
	private String nomeEdificio;

	@Column(nullable = false)
	private String indirizzoEdificio;

	@Column(nullable = false)
	private String cittaEdificio;

	@OneToMany(mappedBy = "edificio")
	List<Postazione> listaPostazioni;

	public String getNomeEdificio() {
		return nomeEdificio;
	}

	public void setNomeEdificio(String nomeEdificio) {
		this.nomeEdificio = nomeEdificio;
	}

	public String getIndirizzoEdificio() {
		return indirizzoEdificio;
	}

	public void setIndirizzoEdificio(String indirizzoEdificio) {
		this.indirizzoEdificio = indirizzoEdificio;
	}

	public String getCittaEdificio() {
		return cittaEdificio;
	}

	public void setCittaEdificio(String cittaEdificio) {
		this.cittaEdificio = cittaEdificio;
	}

	public List<Postazione> getListaPostazioni() {
		return listaPostazioni;
	}

	public void setListaPostazioni(List<Postazione> listaPostazioni) {
		this.listaPostazioni = listaPostazioni;
	}

	public Integer getIdEdificio() {
		return idEdificio;
	}

	@Override
	public String toString() {
		return "Edificio [idEdificio=" + idEdificio + ", nomeEdificio=" + nomeEdificio + ", indirizzoEdificio="
				+ indirizzoEdificio + ", cittaEdificio=" + cittaEdificio + "]";
	}

}
