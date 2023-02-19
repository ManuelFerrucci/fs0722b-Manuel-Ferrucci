package model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.*;

@Entity
@NamedQuery(name = "Prestiti.findAll", query = "SELECT p FROM Prestiti p")
public class Prestiti implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_prestiti", unique = true)
	private Integer idPrestiti;

	@Column(name = "data_inizio_prestiti", nullable = false)
	private Date dataInizioPrestiti;

	@Column(name = "data_reseffettiva_prestiti")
	private Date dataReseffettivaPrestiti;

	@Column(name = "data_resprevista_prestiti", nullable = false)
	private Date dataResprevistaPrestiti;

	@ManyToOne
	@JoinColumn(name = "id_isbn_articolo", nullable = false)
	private Articolo articolo;

	@ManyToOne
	@JoinColumn(name = "id_tessera_utente", nullable = false)
	private Utente utente;

	public Prestiti() {
	}

	public Integer getIdPrestiti() {
		return idPrestiti;
	}

	public void setIdPrestiti(Integer idPrestiti) {
		this.idPrestiti = idPrestiti;
	}

	public Date getDataInizioPrestiti() {
		return dataInizioPrestiti;
	}

	public void setDataInizioPrestiti(Date dataInizioPrestiti) {
		this.dataInizioPrestiti = dataInizioPrestiti;
		Calendar c = Calendar.getInstance();
		c.setTime(dataInizioPrestiti);
		c.add(Calendar.DATE, 30);
		this.dataResprevistaPrestiti = c.getTime();
	}

	public Date getDataReseffettivaPrestiti() {
		return dataReseffettivaPrestiti;
	}

	public void setDataReseffettivaPrestiti(Date dataReseffettivaPrestiti) {
		this.dataReseffettivaPrestiti = dataReseffettivaPrestiti;
	}

	public Date getDataResprevistaPrestiti() {
		return dataResprevistaPrestiti;
	}

	public Articolo getArticolo() {
		return articolo;
	}

	public void setArticolo(Articolo articolo) {
		this.articolo = articolo;
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	@Override
	public String toString() {
		return "Prestiti [idPrestiti=" + idPrestiti + ", dataInizioPrestiti=" + dataInizioPrestiti
				+ ", dataReseffettivaPrestiti=" + dataReseffettivaPrestiti + ", dataResprevistaPrestiti="
				+ dataResprevistaPrestiti + ", id_isbn_articolo=" + articolo.getIdIsbnArticolo()
				+ ", id_tessera_utente=" + utente.getIdTesseraUtente() + "]";
	}
}