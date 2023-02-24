package model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

@Entity
@NamedQuery(name = "Tessera.findAll", query = "SELECT t FROM Tessera t")
public class Tessera implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tessera", unique = true)
	private Integer idTessera;

	@Column(name = "data_inizio_tessera", nullable = false)
	private Date dataInizioTessera;

	@Column(name = "data_fine_tessera", nullable = false)
	private Date dataFineTessera;

	@OneToOne(cascade = CascadeType.REMOVE)
	@JoinColumn(name = "id_titolodiviaggio", nullable = true)
	private Abbonamento idAbbonamento;

	@OneToOne(cascade = CascadeType.REMOVE)
	@JoinColumn(name = "id_utente", nullable = true)
	private Utente idUtente;

	public Tessera() {
	}

	public Integer getIdTessera() {
		return idTessera;
	}

	public void setIdTessera(Integer idTessera) {
		this.idTessera = idTessera;
	}

	public Date getDataInizioTessera() {
		return dataInizioTessera;
	}

	public void setDataInizioTessera(Date dataInizioTessera) {
		this.dataInizioTessera = dataInizioTessera;
		Calendar c = Calendar.getInstance();
		c.setTime(dataInizioTessera);
		c.add(Calendar.DATE, 365);
		this.dataFineTessera = c.getTime();
	}

	public Date getDataFineTessera() {
		return dataFineTessera;
	}

	public Abbonamento getIdAbbonamento() {
		return idAbbonamento;
	}

	public void setIdAbbonamento(Abbonamento idAbbonamento) {
		this.idAbbonamento = idAbbonamento;
	}

	public Utente getIdUtente() {
		return idUtente;
	}

	public void setIdUtente(Utente idUtente) {
		this.idUtente = idUtente;
	}

	@Override
	public String toString() {
		return "Tessera [idTessera=" + idTessera + ", dataInizioTessera=" + dataInizioTessera + ", dataFineTessera="
				+ dataFineTessera + ", getIdUtente()=" + getIdUtente()
				+ "]";
	}

}
