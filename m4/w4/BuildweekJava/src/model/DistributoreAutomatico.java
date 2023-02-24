package model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

import enums.StatoDistributoreAutomatico;

@Entity
@NamedQuery(name = "DistributoreAutomatico.findAll", query = "SELECT da FROM DistributoreAutomatico da")
public class DistributoreAutomatico extends PuntoDiEmissione implements Serializable {

	private static final long serialVersionUID = 1L;

	@Enumerated(EnumType.STRING)
	@Column(name = "stato_distributoreautomatico", nullable = true)
	private StatoDistributoreAutomatico statoDistributoreAutomatico;

	public DistributoreAutomatico() {
		super();
	}

	public StatoDistributoreAutomatico getStatoDistributoreAutomatico() {
		return statoDistributoreAutomatico;
	}

	public void setStatoDistributoreAutomatico(StatoDistributoreAutomatico statoDistributoreAutomatico) {
		this.statoDistributoreAutomatico = statoDistributoreAutomatico;
	}

	@Override
	public String toString() {
		return "DistributoreAutomatico [statoDistributoreAutomatico=" + statoDistributoreAutomatico
				+ ", getIdPuntoDiEmissione()=" + getIdPuntoDiEmissione() + ", getNomePuntoDiEmissione()="
				+ getNomePuntoDiEmissione() + ", getIndirizzoPuntoDiEmissione()=" + getIndirizzoPuntoDiEmissione()
				+ ", getCittaPuntoDiEmissione()=" + getCittaPuntoDiEmissione() + "]";
	}

}
