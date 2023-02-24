package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.NamedQuery;

import enums.StatoBiglietto;

@Entity
@NamedQuery(name = "Biglietto.findAll", query = "SELECT b FROM Biglietto b")
public class Biglietto extends TitoloDiViaggio implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "data_acquisto_biglietto", nullable = true)
	private Date dataAcquistoBiglietto;

	@Column(name = "data_vidimazione_biglietto", nullable = true)
	private Date dataVidimazioneBiglietto;

	@Enumerated(EnumType.STRING)
	@Column(name = "stato_biglietto", nullable = true)
	private StatoBiglietto statoBiglietto;

	public Biglietto() {
		super();
	}

	public Date getDataAcquistoBiglietto() {
		return dataAcquistoBiglietto;
	}

	public void setDataAcquistoBiglietto(Date dataAcquistoBiglietto) {
		this.dataAcquistoBiglietto = dataAcquistoBiglietto;
	}

	public Date getDataVidimazioneBiglietto() {
		return dataVidimazioneBiglietto;
	}

	public void setDataVidimazioneBiglietto(Date dataVidimazioneBiglietto) {
		this.dataVidimazioneBiglietto = dataVidimazioneBiglietto;
	}

	public StatoBiglietto getStatoBiglietto() {
		return statoBiglietto;
	}

	public void setStatoBiglietto(StatoBiglietto statoBiglietto) {
		this.statoBiglietto = statoBiglietto;
	}

	@Override
	public String toString() {
		return "Biglietto [dataAcquistoBiglietto=" + dataAcquistoBiglietto + ", dataVidimazioneBiglietto="
				+ dataVidimazioneBiglietto + ", statoBiglietto=" + statoBiglietto + ", getIdTitoloDiViaggio()="
				+ getIdTitoloDiViaggio() + ", getMetodoVenditaTitoloDiViaggio()=" + getMetodoVenditaTitoloDiViaggio()
				+ ", getPuntoDiEmissione()=" + getPuntoDiEmissione()
				+ "]";
	}

}
