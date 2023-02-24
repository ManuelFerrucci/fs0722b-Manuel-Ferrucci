package model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

import enums.DurataAbbonamento;

@Entity
@NamedQuery(name = "Abbonamento.findAll", query = "SELECT abb FROM Abbonamento abb")
public class Abbonamento extends TitoloDiViaggio implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "data_inizio_abbonamento", nullable = true)
	private Date dataInizioAbbonamento;

	@Column(name = "data_fine_abbonamento", nullable = true)
	private Date dataFineAbbonamento = new GregorianCalendar(1970, 0, 1).getTime();

	@Enumerated(EnumType.STRING)
	@Column(name = "durata_abbonamento", nullable = true)
	private DurataAbbonamento durataAbbonamento;

	@OneToOne(cascade = CascadeType.REMOVE)
	@JoinColumn(name = "id_tessera", nullable = true)
	private Tessera idTessera;

	public Abbonamento() {
		super();
	}

	public Date getDataInizioAbbonamento() {
		return dataInizioAbbonamento;
	}

	public void setDataInizioAbbonamento(Date dataInizioAbbonamento) {
		this.dataInizioAbbonamento = dataInizioAbbonamento;
		if (this.getDurataAbbonamento() == DurataAbbonamento.Mensile) {
			Calendar c = Calendar.getInstance();
			c.setTime(dataInizioAbbonamento);
			c.add(Calendar.DATE, 30);
			this.dataFineAbbonamento = c.getTime();
		} else if (this.getDurataAbbonamento() == DurataAbbonamento.Settimanale) {
			Calendar c = Calendar.getInstance();
			c.setTime(dataInizioAbbonamento);
			c.add(Calendar.DATE, 7);
			this.dataFineAbbonamento = c.getTime();
		} else {
			System.out.println("Durata non impostata");
		}
	}

	public Date getDataFineAbbonamento() {
		return dataFineAbbonamento;
	}

	public DurataAbbonamento getDurataAbbonamento() {
		return durataAbbonamento;
	}

	public void setDurataAbbonamento(DurataAbbonamento durataAbbonamento) {
		this.durataAbbonamento = durataAbbonamento;
	}

	public Tessera getIdTessera() {
		return idTessera;
	}

	public void setIdTessera(Tessera idTessera) {
		this.idTessera = idTessera;
	}

	@Override
	public String toString() {
		return "Abbonamento [dataInizioAbbonamento=" + dataInizioAbbonamento + ", dataFineAbbonamento="
				+ dataFineAbbonamento + ", durataAbbonamento=" + durataAbbonamento + ", idTessera=" + idTessera
				+ ", getIdTitoloDiViaggio()=" + getIdTitoloDiViaggio() + ", getMetodoVenditaTitoloDiViaggio()="
				+ getMetodoVenditaTitoloDiViaggio() + "]";
	}

}
