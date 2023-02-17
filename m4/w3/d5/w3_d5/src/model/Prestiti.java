package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the prestiti database table.
 * 
 */
@Entity
@NamedQuery(name = "Prestiti.findAll", query = "SELECT p FROM Prestiti p")
public class Prestiti implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_prestiti")
	private Integer idPrestiti;

	@Column(name = "data_inizio_prestiti")
	private String dataInizioPrestiti;

	@Column(name = "data_reseffettiva_prestiti")
	private String dataReseffettivaPrestiti;

	@Column(name = "data_resprevista_prestiti")
	private String dataResprevistaPrestiti;

	@Column(name = "tipo_articolo_prestiti")
	private String tipoArticoloPrestiti;

	// bi-directional many-to-one association to Libri
	@ManyToOne
	@JoinColumn(name = "id_isbn_libri")
	private Libri libri;

	// bi-directional many-to-one association to Riviste
	@ManyToOne
	@JoinColumn(name = "id_isbn_riviste")
	private Riviste riviste;

	// bi-directional many-to-one association to Utente
	@ManyToOne
	@JoinColumn(name = "id_tessera_utente")
	private Utente utente;

	public Prestiti() {
	}

	public Integer getIdPrestiti() {
		return this.idPrestiti;
	}

	public void setIdPrestiti(Integer idPrestiti) {
		this.idPrestiti = idPrestiti;
	}

	public String getDataInizioPrestiti() {
		return this.dataInizioPrestiti;
	}

	public void setDataInizioPrestiti(String dataInizioPrestiti) {
		this.dataInizioPrestiti = dataInizioPrestiti;
	}

	public String getDataReseffettivaPrestiti() {
		return this.dataReseffettivaPrestiti;
	}

	public void setDataReseffettivaPrestiti(String dataReseffettivaPrestiti) {
		this.dataReseffettivaPrestiti = dataReseffettivaPrestiti;
	}

	public String getDataResprevistaPrestiti() {
		return this.dataResprevistaPrestiti;
	}

	public void setDataResprevistaPrestiti(String dataResprevistaPrestiti) {
		this.dataResprevistaPrestiti = dataResprevistaPrestiti;
	}

	public String getTipoArticoloPrestiti() {
		return this.tipoArticoloPrestiti;
	}

	public void setTipoArticoloPrestiti(String tipoArticoloPrestiti) {
		this.tipoArticoloPrestiti = tipoArticoloPrestiti;
	}

	public Libri getLibri() {
		return this.libri;
	}

	public void setLibri(Libri libri) {
		this.libri = libri;
	}

	public Riviste getRiviste() {
		return this.riviste;
	}

	public void setRiviste(Riviste riviste) {
		this.riviste = riviste;
	}

	public Utente getUtente() {
		return this.utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	@Override
	public String toString() {
		return "Prestiti [idPrestiti=" + idPrestiti + ", dataInizioPrestiti=" + dataInizioPrestiti
				+ ", dataReseffettivaPrestiti=" + dataReseffettivaPrestiti + ", dataResprevistaPrestiti="
				+ dataResprevistaPrestiti + ", tipoArticoloPrestiti=" + tipoArticoloPrestiti + ", libri=" + libri
				+ ", riviste=" + riviste + ", utente=" + utente + "]";
	}

}