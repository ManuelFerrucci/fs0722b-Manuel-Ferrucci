package model;

import java.io.Serializable;
import javax.persistence.*;

import enums.Periodicita;

@Entity
@NamedQuery(name = "Riviste.findAll", query = "SELECT r FROM Riviste r")
public class Riviste extends Articolo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Enumerated(EnumType.STRING)
	@Column(name = "periodicita_riviste")
	private Periodicita periodicitaRiviste;

	public Riviste() {
		super();
	}

	public Periodicita getPeriodicitaRiviste() {
		return periodicitaRiviste;
	}

	public void setPeriodicitaRiviste(Periodicita periodicitaRiviste) {
		this.periodicitaRiviste = periodicitaRiviste;
	}

	@Override
	public String toString() {
		return "Riviste [periodicitaRiviste=" + periodicitaRiviste + ", IdIsbnArticolo=" + getIdIsbnArticolo()
				+ ", TitoloArticolo=" + getTitoloArticolo() + ", AnnoPubblicazioneArticolo="
				+ getAnnoPubblicazioneArticolo() + ", NumeroPagineArticolo=" + getNumeroPagineArticolo() + "]";
	}

	
}