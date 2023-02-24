package model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQuery(name = "RivenditoreAutorizzato.findAll", query = "SELECT riv FROM RivenditoreAutorizzato riv")
public class RivenditoreAutorizzato extends PuntoDiEmissione implements Serializable {

	private static final long serialVersionUID = 1L;

	public RivenditoreAutorizzato() {
		super();
	}

	@Override
	public String toString() {
		return "RivenditoreAutorizzato [getIdPuntoDiEmissione()=" + getIdPuntoDiEmissione()
				+ ", getNomePuntoDiEmissione()=" + getNomePuntoDiEmissione() + ", getIndirizzoPuntoDiEmissione()="
				+ getIndirizzoPuntoDiEmissione() + ", getCittaPuntoDiEmissione()=" + getCittaPuntoDiEmissione() + "]";
	}

}
